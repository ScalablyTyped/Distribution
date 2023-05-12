package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistencePromise is essentially a re-implementation of Promise except
  * it has a .next() method instead of .then() and .next() and .catch() callbacks
  * are executed synchronously when a PersistencePromise resolves rather than
  * asynchronously (Promise implementations use setImmediate() or similar).
  *
  * This is necessary to interoperate with IndexedDB which will automatically
  * commit transactions if control is returned to the event loop without
  * synchronously initiating another operation on the transaction.
  *
  * NOTE: .then() and .catch() only allow a single consumer, unlike normal
  * Promises.
  */
@js.native
trait PersistencePromise[T] extends StObject {
  
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
