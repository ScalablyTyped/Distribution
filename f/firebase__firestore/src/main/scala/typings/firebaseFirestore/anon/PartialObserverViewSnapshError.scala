package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distLiteFirestoreSrcUtilMiscMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/lite/firestore/src/core/event_manager.Observer<@firebase/firestore.@firebase/firestore/dist/lite/firestore/src/core/view_snapshot.ViewSnapshot>> */
trait PartialObserverViewSnapshError extends StObject {
  
  var error: js.UndefOr[EventHandler[FirestoreError]] = js.undefined
  
  var next: js.UndefOr[EventHandler[ViewSnapshot]] = js.undefined
}
object PartialObserverViewSnapshError {
  
  inline def apply(): PartialObserverViewSnapshError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObserverViewSnapshError]
  }
  
  extension [Self <: PartialObserverViewSnapshError](x: Self) {
    
    inline def setError(value: FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: ViewSnapshot => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
