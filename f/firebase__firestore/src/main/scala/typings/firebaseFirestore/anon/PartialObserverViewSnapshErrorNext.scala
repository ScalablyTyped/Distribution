package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.firestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.firestoreSrcUtilMiscMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/packages/firestore/src/core/event_manager.Observer<@firebase/firestore.@firebase/firestore/dist/packages/firestore/src/core/view_snapshot.ViewSnapshot>> */
trait PartialObserverViewSnapshErrorNext extends StObject {
  
  var error: js.UndefOr[EventHandler[FirestoreError]] = js.undefined
  
  var next: js.UndefOr[EventHandler[ViewSnapshot]] = js.undefined
}
object PartialObserverViewSnapshErrorNext {
  
  inline def apply(): PartialObserverViewSnapshErrorNext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObserverViewSnapshErrorNext]
  }
  
  extension [Self <: PartialObserverViewSnapshErrorNext](x: Self) {
    
    inline def setError(value: FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: ViewSnapshot => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
