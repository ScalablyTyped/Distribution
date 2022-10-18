package typings.firebase.anon

import typings.firebase.compatMod.firebase.firestore.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
