package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod.DocumentSnapshot
import typings.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod.QuerySnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestIntegrationUtilEventsAccumulatorMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/events_accumulator", "EventsAccumulator")
  @js.native
  open class EventsAccumulator[T /* <: DocumentSnapshot[DocumentData] | QuerySnapshot[DocumentData] */] () extends StObject {
    
    def allowAdditionalEvents(): Unit = js.native
    
    def assertNoAdditionalEvents(): js.Promise[Unit] = js.native
    
    def awaitEvent(): js.Promise[T] = js.native
    
    def awaitEvents(length: Double): js.Promise[js.Array[T]] = js.native
    
    /** Waits for a latency compensated local snapshot. */
    def awaitLocalEvent(): js.Promise[T] = js.native
    
    /** Waits for multiple latency compensated local snapshot. */
    def awaitLocalEvents(count: Double): js.Promise[js.Array[T]] = js.native
    
    /** Waits for a snapshot that has no pending writes */
    def awaitRemoteEvent(): js.Promise[T] = js.native
    
    /* private */ var checkFulfilled: Any = js.native
    
    /* private */ var deferred: Any = js.native
    
    /* private */ var events: Any = js.native
    
    /* private */ var rejectAdditionalEvents: Any = js.native
    
    def storeEvent(evt: T): Unit = js.native
    
    /* private */ var waitingFor: Any = js.native
  }
}
