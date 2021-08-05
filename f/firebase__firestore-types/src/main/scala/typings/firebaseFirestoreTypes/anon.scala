package typings.firebaseFirestoreTypes

import typings.firebaseFirestoreTypes.mod.DocumentSnapshot
import typings.firebaseFirestoreTypes.mod.FirestoreError
import typings.firebaseFirestoreTypes.mod.QuerySnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complete extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
  }
  object Complete {
    
    inline def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    extension [Self <: Complete](x: Self) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* value */ Unit => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit]
  }
  object Delete {
    
    inline def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  trait Error[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
  }
  object Error {
    
    inline def apply[T](): Error[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[T]]
    }
    
    extension [Self <: Error[?], T](x: Self & Error[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ DocumentSnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait Next[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
  }
  object Next {
    
    inline def apply[T](): Next[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next[T]]
    }
    
    extension [Self <: Next[?], T](x: Self & Next[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ QuerySnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
