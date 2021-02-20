package typings.firebaseFirestoreTypes

import typings.firebaseFirestoreTypes.mod.DocumentSnapshot
import typings.firebaseFirestoreTypes.mod.FirestoreError
import typings.firebaseFirestoreTypes.mod.QuerySnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Complete extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.native
    
    var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.native
  }
  object Complete {
    
    @scala.inline
    def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    @scala.inline
    implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* value */ Unit => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit] = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Error[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.native
    
    var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.native
  }
  object Error {
    
    @scala.inline
    def apply[T](): Error[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[T]]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error[_], T] (val x: Self with Error[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* snapshot */ DocumentSnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait Next[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.native
    
    var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.native
  }
  object Next {
    
    @scala.inline
    def apply[T](): Next[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next[T]]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next[_], T] (val x: Self with Next[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* snapshot */ QuerySnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
