package typings.fibers

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.fibers.futureMod.global.Function
import typings.fibers.futureMod.global.FutureFunction
import typings.fibers.futureMod.global.FutureObject
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object futureMod extends Shortcut {
  
  @JSImport("fibers/future", JSImport.Namespace)
  @js.native
  val ^ : FutureConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("fibers/future", JSImport.Namespace)
  @js.native
  class Class[T] ()
    extends StObject
       with Future[T]
  
  @js.native
  trait Future[T] extends StObject {
    
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
    def resolve(future: Future[js.Any], callback: js.Function1[/* val */ T, Unit]): this.type = js.native
    
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
  
  @js.native
  trait FutureConstructor
    extends StObject
       with Instantiable0[Future[js.Object]] {
    
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
    def wrap[O /* <: js.Object */](fnOrObject: O, multi: Unit, suffix: String): FutureObject[O] = js.native
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
    def wrap[T](fnOrObject: js.Function1[/* repeated */ js.Any, T], multi: Unit, suffix: String): FutureFunction[T] = js.native
  }
  
  type FutureOrFutureArray = Future[js.Any] | js.Array[Future[js.Any]]
  
  type FutureResolveFunction[T] = js.Function2[/* err */ Error, /* val */ T, Unit]
  
  type _To = FutureConstructor
  
  /* This means you don't have to write `^`, but can instead just say `futureMod.foo` */
  override def _to: FutureConstructor = ^
  
  // In the future we can use this to extend the type of FutureObject if typescript
  // support for dynamic types improves
  // https://stackoverflow.com/questions/44323441/changing-property-name-in-typescript-mapped-type
  // type FutureObjectFunctions<O> = {[K in keyof O]: O[K] extends ((...args: infer P) => infer R) ?
  //     (...args: P) => Future<R> : never};
  //
  // type FutureObjectProperties<O> = {[K in keyof O]: O[K] extends (...args: any[]) => any ? never: O[K]};
  object global {
    
    @js.native
    trait Function extends StObject {
      
      /**
        * Returns a future-function which, when run, starts running the target
        * function and returns a future for the result.
        *
        * Example usage:
        * var funcy = function(arg) {
        *   return arg+1;
        * }.future();
        *
        * funcy(1).wait(); // returns 2
        */
      def future[T](): FutureFunction[T] = js.native
      def future[T](detach: Boolean): FutureFunction[T] = js.native
    }
    
    @js.native
    trait FutureFunction[T] extends StObject {
      
      def apply(args: js.Any*): Future[T] = js.native
    }
    
    type FutureObject[T] = T & js.Any
  }
}
