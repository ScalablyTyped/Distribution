package typings.fibers.futureMod

import org.scalablytyped.runtime.Instantiable0
import typings.fibers.futureMod._Global_.Function
import typings.fibers.futureMod._Global_.FutureFunction
import typings.fibers.futureMod._Global_.FutureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FutureConstructor
  extends Instantiable0[Future[js.Object]] {
  /**
    * Support for converting a Future to and from ES6 Promises.
    * @see Future#promise
    */
  def fromPromise[R](promise: js.Promise[R]): Future[R] = js.native
  def task[T](fn1: Function, fn2: Function, fns: Function*): Future[js.Array[T]] = js.native
  // wrap<O = object, T = FutureObject>(fnOrObject: O, multi?: boolean, suffix?: string): FutureObject & FunctionProperties<O>;
  /**
    * Invoke a function(s) that will be run in its own fiber context and return a future to its return
    * value.
    *
    * @description Run a function(s) in a future context, and return a future to their return value. This is useful
    * for instances where you want a closure to be able to `.wait()`. This also lets you wait for
    * mulitple parallel opertions to run.
    *
    * Example:
    * Future.task(function() {
    *   // You can safely `wait` on stuff here
    * }).detach();
    */
  def task[T](fn: js.Function1[/* repeated */ js.Any, T]): Future[T] = js.native
  /**
    * Wait on a series of futures and then return. If the futures throw an exception this function
    * /won't/ throw it back. You can get the value of the future by calling get() on it directly. If
    * you want to wait on a single future you're better off calling future.wait() on the instance.
    *
    * Example usage: Future.wait(aFuture, anotherFuture)
    */
  def wait(futures: FutureOrFutureArray*): Unit = js.native
  def wrap[O /* <: js.Object */](fnOrObject: O): FutureObject[O] = js.native
  def wrap[O /* <: js.Object */](fnOrObject: O, multi: Boolean): FutureObject[O] = js.native
  def wrap[O /* <: js.Object */](fnOrObject: O, multi: Boolean, suffix: String): FutureObject[O] = js.native
  /**
    * Wrap a node-style async function to return a future in place of using a callback.
    * A node-style async function is usually in the form (...args: any, cb: (err?: Error, ...cbArgs: any) => any) => any
    *
    * If a single function is passed, a future-returning function is created. If an object is passed a
    * new object is returned with all functions wrapped.
    *
    * The value that is returned from the invocation of the underlying function is assigned to the
    * property `_` on the future. This is useful for functions like `execFile` which take a callback,
    * but also return meaningful information.
    *
    * @param fnOrObject - the function or object to wrap
    * @param multi - indicates that this callback will return more than 1 argument after `err`. For example,
    *         `child_process.exec()` returns [err, stdout, stderr]
    * @param suffix - appends a string to every method that was overridden.
    *   If you passed an object. Default is 'Future'.
    *
    * Example usage: Future.wrap(asyncFunction)(arg1).wait()
    */
  def wrap[T](fnOrObject: js.Function1[/* repeated */ js.Any, T]): FutureFunction[T] = js.native
  def wrap[T](fnOrObject: js.Function1[/* repeated */ js.Any, T], multi: Boolean): FutureFunction[T] = js.native
  def wrap[T](fnOrObject: js.Function1[/* repeated */ js.Any, T], multi: Boolean, suffix: String): FutureFunction[T] = js.native
}

