package typings.atFirebaseFirestore

import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/util/events_accumulator", JSImport.Namespace)
@js.native
object distTestIntegrationUtilEventsUnderscoreAccumulatorMod extends js.Object {
  @js.native
  class EventsAccumulator[T /* <: DocumentSnapshot[DocumentData] | QuerySnapshot[DocumentData] */] () extends js.Object {
    var checkFulfilled: js.Any = js.native
    var deferred: js.Any = js.native
    var events: js.Any = js.native
    var rejectAdditionalEvents: js.Any = js.native
    var waitingFor: js.Any = js.native
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
    def storeEvent(evt: T): Unit = js.native
  }
  
}

