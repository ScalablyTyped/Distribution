package typings.firebaseFirestore

import typings.firebaseFirestore.anon.`0`
import typings.firebaseFirestore.anon.`1`
import typings.firebaseFirestore.anon.`23`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalPersistencePromiseMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/persistence_promise", "PersistencePromise")
  @js.native
  open class PersistencePromise[T] protected () extends StObject {
    def this(callback: js.Function2[/* resolve */ Resolver[T], /* reject */ Rejector, Unit]) = this()
    
    /* private */ var callbackAttached: Any = js.native
    
    def `catch`[R](fn: js.Function1[/* error */ js.Error, R | PersistencePromise[R]]): PersistencePromise[R] = js.native
    
    /* private */ var catchCallback: Any = js.native
    
    /* private */ var error: Any = js.native
    
    /* private */ var isDone: Any = js.native
    
    def next[R](): PersistencePromise[R] = js.native
    def next[R](nextFn: Unit, catchFn: RejectedHandler[R]): PersistencePromise[R] = js.native
    def next[R](nextFn: FulfilledHandler[T, R]): PersistencePromise[R] = js.native
    def next[R](nextFn: FulfilledHandler[T, R], catchFn: RejectedHandler[R]): PersistencePromise[R] = js.native
    
    /* private */ var nextCallback: Any = js.native
    
    /* private */ var result: Any = js.native
    
    def toPromise(): js.Promise[T] = js.native
    
    /* private */ var wrapFailure: Any = js.native
    
    /* private */ var wrapSuccess: Any = js.native
    
    /* private */ var wrapUserFunction: Any = js.native
  }
  /* static members */
  object PersistencePromise {
    
    @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/persistence_promise", "PersistencePromise")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An alternative to recursive PersistencePromise calls, that avoids
      * potential memory problems from unbounded chains of promises.
      *
      * The `action` will be called repeatedly while `condition` is true.
      */
    inline def doWhile(condition: js.Function0[Boolean], action: js.Function0[PersistencePromise[Unit]]): PersistencePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhile")(condition.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[Unit]]
    
    inline def forEach[R](collection: `1`[R], f: js.Function1[/* r */ R, PersistencePromise[Unit]]): PersistencePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[Unit]]
    inline def forEach[R, S](collection: `0`[R, S], f: js.Function1[/* r */ R, PersistencePromise[Unit]]): PersistencePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[Unit]]
    /**
      * Given an iterable, call the given function on each element in the
      * collection and wait for all of the resulting concurrent PersistencePromises
      * to resolve.
      */
    inline def forEach[R, S](collection: `0`[R, S], f: js.Function2[/* r */ R, /* s */ S, PersistencePromise[Unit]]): PersistencePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(collection.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[Unit]]
    
    /**
      * Concurrently map all array elements through asynchronous function.
      */
    inline def mapArray[T, U](array: js.Array[T], f: js.Function1[/* t */ T, PersistencePromise[U]]): PersistencePromise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapArray")(array.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[js.Array[U]]]
    
    /**
      * Given an array of predicate functions that asynchronously evaluate to a
      * boolean, implements a short-circuiting `or` between the results. Predicates
      * will be evaluated until one of them returns `true`, then stop. The final
      * result will be whether any of them returned `true`.
      */
    inline def or(predicates: js.Array[js.Function0[PersistencePromise[Boolean]]]): PersistencePromise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(predicates.asInstanceOf[js.Any]).asInstanceOf[PersistencePromise[Boolean]]
    
    inline def reject[R](error: js.Error): PersistencePromise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(error.asInstanceOf[js.Any]).asInstanceOf[PersistencePromise[R]]
    
    inline def resolve(): PersistencePromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[PersistencePromise[Unit]]
    inline def resolve[R](result: R): PersistencePromise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(result.asInstanceOf[js.Any]).asInstanceOf[PersistencePromise[R]]
    
    inline def waitFor(all: `23`): PersistencePromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(all.asInstanceOf[js.Any]).asInstanceOf[PersistencePromise[Unit]]
  }
  
  type FulfilledHandler[T, R] = (js.Function1[/* result */ T, R | PersistencePromise[R]]) | Null
  
  type RejectedHandler[R] = (js.Function1[/* reason */ js.Error, R | PersistencePromise[R]]) | Null
  
  type Rejector = js.Function1[/* error */ js.Error, Unit]
  
  type Resolver[T] = js.Function1[/* value */ js.UndefOr[T], Unit]
}
