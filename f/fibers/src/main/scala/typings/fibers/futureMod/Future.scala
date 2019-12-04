package typings.fibers.futureMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Future[T] extends js.Object {
  /**
    * "detach" this future. Basically this is useful if you want to run a task in a future, you
    * aren't interested in its return value, but if it throws you don't want the exception to be
    * lost. If this fiber throws, an exception will be thrown to the event loop and node will
    * probably fall down.
    */
  def detach(): Unit = js.native
  /**
    * Return the value of this future. If the future hasn't resolved yet this will throw an error.
    */
  def get(): T = js.native
  /**
    * Returns whether or not this future has resolved yet.
    */
  def isResolved(): Boolean = js.native
  /**
    * Support for converting a Future to and from ES6 Promises.
    * @see FutureConstructor#fromPromise
    */
  def promise(): js.Promise[T] = js.native
  /**
    * Propogate results to another future.
    *
    * Example usage: future1.proxy(future2) // future2 gets automatically resolved with however future1 resolves
    */
  def proxy(future: Future[T]): Unit = js.native
  /**
    * Propogate only errors to an another future or array of futures.
    */
  def proxyErrors(futures: FutureOrFutureArray): this.type = js.native
  /**
    * Waits for this future to resolve and then invokes a callback.
    *
    * If only one argument is passed it is a standard function(err, val){} errback.
    *
    * If two arguments are passed, the first argument is a future which will be thrown to in the case
    * of error, and the second is a function(val){} callback.
    */
  def resolve(errback: FutureResolveFunction[T]): this.type = js.native
  def resolve(future: Future[_], callback: js.Function1[/* val */ T, Unit]): this.type = js.native
  /**
    * Resolve only in the case of success
    */
  def resolveSuccess(cb: js.Function1[/* val */ T, Unit]): this.type = js.native
  /**
    * Returns a node-style function which will mark this future as resolved when called.
    *
    * Example usage:
    *   var errback = aFuture.resolver();
    *   asyncFunction(arg1, arg2, etc, errback)
    *   var result = aFuture.wait();
    */
  def resolver(): FutureResolveFunction[T] = js.native
  /**
    * Mark this future as returned. All pending callbacks will be invoked immediately.
    *
    * value - the value to return when get() or wait() is called.
    *
    * Example usage: aFuture.return(value)
    */
  def `return`[T](): Unit = js.native
  def `return`[T](value: T): Unit = js.native
  /**
    * Throw from this future as returned. All pending callbacks will be invoked immediately.
    * Note that execution will continue normally after running this method,
    * so make sure you exit appropriately after running throw()
    *
    * error - the error to throw when get() or wait() is called.
    *
    * Example usage: aFuture.throw(new Error("Something borked"))
    */
  def `throw`(err: Error): Unit = js.native
}

