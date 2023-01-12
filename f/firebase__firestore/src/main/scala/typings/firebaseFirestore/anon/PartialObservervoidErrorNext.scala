package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilMiscMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/packages/firestore/src/core/event_manager.Observer<void>> */
trait PartialObservervoidErrorNext extends StObject {
  
  var error: js.UndefOr[EventHandler[FirestoreError]] = js.undefined
  
  var next: js.UndefOr[EventHandler[Unit]] = js.undefined
}
object PartialObservervoidErrorNext {
  
  inline def apply(): PartialObservervoidErrorNext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObservervoidErrorNext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialObservervoidErrorNext] (val x: Self) extends AnyVal {
    
    inline def setError(value: FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: Unit => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
