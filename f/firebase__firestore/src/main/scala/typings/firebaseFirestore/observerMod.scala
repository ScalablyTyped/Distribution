package typings.firebaseFirestore

import typings.firebaseFirestore.errorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPartialObserver[T](obj: Any): /* is @firebase/firestore.@firebase/firestore/dist/firestore/src/api/observer.PartialObserver<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPartialObserver")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.@firebase/firestore/dist/firestore/src/api/observer.PartialObserver<T> */ Boolean]
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ FirestoreError, Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  trait PartialObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn] = js.undefined
    
    var error: js.UndefOr[ErrorFn] = js.undefined
    
    var next: js.UndefOr[NextFn[T]] = js.undefined
  }
  object PartialObserver {
    
    inline def apply[T](): PartialObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialObserver[T]]
    }
    
    extension [Self <: PartialObserver[?], T](x: Self & PartialObserver[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
