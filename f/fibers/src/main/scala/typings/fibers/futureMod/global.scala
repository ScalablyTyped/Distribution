package typings.fibers.futureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In the future we can use this to extend the type of FutureObject if typescript
// support for dynamic types improves
// https://stackoverflow.com/questions/44323441/changing-property-name-in-typescript-mapped-type
// type FutureObjectFunctions<O> = {[K in keyof O]: O[K] extends ((...args: infer P) => infer R) ?
//     (...args: P) => Future<R> : never};
//
// type FutureObjectProperties<O> = {[K in keyof O]: O[K] extends (...args: any[]) => any ? never: O[K]};
@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Function extends js.Object {
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
  
  type FutureFunction[T] = js.Function1[/* repeated */ js.Any, Future[T]]
  type FutureObject[T] = T with js.Any
}

