package typings.firebaseFirestore

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/persistence_promise", JSImport.Namespace)
@js.native
object persistencePromiseMod extends js.Object {
  @js.native
  class PersistencePromise[T] protected () extends js.Object {
    def this(callback: js.Function2[/* resolve */ Resolver[T], /* reject */ Rejector, Unit]) = this()
    var callbackAttached: js.Any = js.native
    var catchCallback: js.Any = js.native
    var error: js.Any = js.native
    var isDone: js.Any = js.native
    var nextCallback: js.Any = js.native
    var result: js.Any = js.native
    var wrapFailure: js.Any = js.native
    var wrapSuccess: js.Any = js.native
    var wrapUserFunction: js.Any = js.native
    def `catch`[R](fn: js.Function1[/* error */ Error, R | PersistencePromise[R]]): PersistencePromise[R] = js.native
    def next[R](): PersistencePromise[R] = js.native
    def next[R](nextFn: FulfilledHandler[T, R]): PersistencePromise[R] = js.native
    def next[R](nextFn: FulfilledHandler[T, R], catchFn: RejectedHandler[R]): PersistencePromise[R] = js.native
    def toPromise(): js.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object PersistencePromise extends js.Object {
    def forEach[R](collection: Anon1[R], f: js.Function1[/* r */ R, PersistencePromise[Unit]]): PersistencePromise[Unit] = js.native
    def forEach[R, S](collection: Anon0[R, S], f: js.Function1[/* r */ R, PersistencePromise[Unit]]): PersistencePromise[Unit] = js.native
    /**
      * Given an iterable, call the given function on each element in the
      * collection and wait for all of the resulting concurrent PersistencePromises
      * to resolve.
      */
    def forEach[R, S](collection: Anon0[R, S], f: js.Function2[/* r */ R, /* s */ S, PersistencePromise[Unit]]): PersistencePromise[Unit] = js.native
    /**
      * Given an array of predicate functions that asynchronously evaluate to a
      * boolean, implements a short-circuiting `or` between the results. Predicates
      * will be evaluated until one of them returns `true`, then stop. The final
      * result will be whether any of them returned `true`.
      */
    def or(predicates: js.Array[js.Function0[PersistencePromise[Boolean]]]): PersistencePromise[Boolean] = js.native
    def reject[R](error: Error): PersistencePromise[R] = js.native
    def resolve(): PersistencePromise[Unit] = js.native
    def resolve[R](result: R): PersistencePromise[R] = js.native
    def waitFor(all: AnonForEach): PersistencePromise[Unit] = js.native
  }
  
  type FulfilledHandler[T, R] = (js.Function1[/* result */ T, R | PersistencePromise[R]]) | Null
  type RejectedHandler[R] = (js.Function1[/* reason */ Error, R | PersistencePromise[R]]) | Null
  type Rejector = js.Function1[/* error */ Error, Unit]
  type Resolver[T] = js.Function1[/* value */ js.UndefOr[T], Unit]
}

