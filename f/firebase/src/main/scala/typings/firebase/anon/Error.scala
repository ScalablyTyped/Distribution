package typings.firebase.anon

import typings.firebase.mod.firebase.firestore.DocumentSnapshot
import typings.firebase.mod.firebase.firestore.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error[T] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
}
object Error {
  
  @scala.inline
  def apply[T](): Error[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error[T]]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error[?], T] (val x: Self & Error[T]) extends AnyVal {
    
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
