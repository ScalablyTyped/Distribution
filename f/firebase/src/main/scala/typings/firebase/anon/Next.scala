package typings.firebase.anon

import typings.firebase.mod.firebase.firestore.FirestoreError
import typings.firebase.mod.firebase.firestore.QuerySnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
