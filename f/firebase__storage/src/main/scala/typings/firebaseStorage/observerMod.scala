package typings.firebaseStorage

import typings.firebaseStorage.errorMod.FirebaseStorageError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/observer", "Observer")
  @js.native
  class Observer[T] () extends StorageObserver[T] {
    def this(nextOrObserver: NextFn[T]) = this()
    def this(nextOrObserver: StorageObserver[T]) = this()
    def this(nextOrObserver: js.UndefOr[scala.Nothing], error: ErrorFn) = this()
    def this(nextOrObserver: NextFn[T], error: ErrorFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: ErrorFn) = this()
    def this(nextOrObserver: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
    def this(nextOrObserver: js.UndefOr[scala.Nothing], error: ErrorFn, complete: CompleteFn) = this()
    def this(nextOrObserver: NextFn[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
    def this(nextOrObserver: NextFn[T], error: ErrorFn, complete: CompleteFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: ErrorFn, complete: CompleteFn) = this()
  }
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ FirebaseStorageError, Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  @js.native
  trait StorageObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn] = js.native
    
    var error: js.UndefOr[ErrorFn] = js.native
    
    var next: js.UndefOr[NextFn[T]] = js.native
  }
  object StorageObserver {
    
    @scala.inline
    def apply[T](): StorageObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageObserver[T]]
    }
    
    @scala.inline
    implicit class StorageObserverMutableBuilder[Self <: StorageObserver[_], T] (val x: Self with StorageObserver[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ FirebaseStorageError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[NextFn[T] | StorageObserver[T]], 
    /* error */ js.UndefOr[ErrorFn], 
    /* complete */ js.UndefOr[CompleteFn], 
    Unsubscribe
  ]
  
  type Unsubscribe = js.Function0[Unit]
}
