package typings.firebaseFirestore

import org.scalablytyped.runtime.NumberDictionary
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.firebaseFirestore.utilSortedSetMod.SortedSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/remote_event", JSImport.Namespace)
@js.native
object remoteRemoteEventMod extends js.Object {
  @js.native
  class RemoteEvent protected () extends js.Object {
    def this(
      /**
      * The snapshot version this event brings us up to, or MIN if not set.
      */
    snapshotVersion: SnapshotVersion,
      /**
      * A map from target to changes to the target. See TargetChange.
      */
    targetChanges: NumberDictionary[TargetChange],
      /**
      * A set of targets that is known to be inconsistent. Listens for these
      * targets should be re-established without resume tokens.
      */
    targetMismatches: SortedSet[TargetId],
      /**
      * A set of which documents have changed or been deleted, along with the
      * doc's new values (if not deleted).
      */
    documentUpdates: MaybeDocumentMap_,
      /**
      * A set of which document updates are due only to limbo resolution targets.
      */
    resolvedLimboDocuments: DocumentKeySet_
    ) = this()
    /**
      * A set of which documents have changed or been deleted, along with the
      * doc's new values (if not deleted).
      */
    val documentUpdates: MaybeDocumentMap_ = js.native
    /**
      * A set of which document updates are due only to limbo resolution targets.
      */
    val resolvedLimboDocuments: DocumentKeySet_ = js.native
    /**
      * The snapshot version this event brings us up to, or MIN if not set.
      */
    val snapshotVersion: SnapshotVersion = js.native
    /**
      * A map from target to changes to the target. See TargetChange.
      */
    val targetChanges: NumberDictionary[TargetChange] = js.native
    /**
      * A set of targets that is known to be inconsistent. Listens for these
      * targets should be re-established without resume tokens.
      */
    val targetMismatches: SortedSet[TargetId] = js.native
  }
  
  @js.native
  class TargetChange protected () extends js.Object {
    def this(
      /**
      * An opaque, server-assigned token that allows watching a query to be resumed
      * after disconnecting without retransmitting all the data that matches the
      * query. The resume token essentially identifies a point in time from which
      * the server should resume sending results.
      */
    resumeToken: ByteString,
      /**
      * The "current" (synced) status of this target. Note that "current"
      * has special meaning in the RPC protocol that implies that a target is
      * both up-to-date and consistent with the rest of the watch stream.
      */
    current: Boolean,
      /**
      * The set of documents that were newly assigned to this target as part of
      * this remote event.
      */
    addedDocuments: DocumentKeySet_,
      /**
      * The set of documents that were already assigned to this target but received
      * an update during this remote event.
      */
    modifiedDocuments: DocumentKeySet_,
      /**
      * The set of documents that were removed from this target as part of this
      * remote event.
      */
    removedDocuments: DocumentKeySet_
    ) = this()
    /**
      * The set of documents that were newly assigned to this target as part of
      * this remote event.
      */
    val addedDocuments: DocumentKeySet_ = js.native
    /**
      * The "current" (synced) status of this target. Note that "current"
      * has special meaning in the RPC protocol that implies that a target is
      * both up-to-date and consistent with the rest of the watch stream.
      */
    val current: Boolean = js.native
    /**
      * The set of documents that were already assigned to this target but received
      * an update during this remote event.
      */
    val modifiedDocuments: DocumentKeySet_ = js.native
    /**
      * The set of documents that were removed from this target as part of this
      * remote event.
      */
    val removedDocuments: DocumentKeySet_ = js.native
    /**
      * An opaque, server-assigned token that allows watching a query to be resumed
      * after disconnecting without retransmitting all the data that matches the
      * query. The resume token essentially identifies a point in time from which
      * the server should resume sending results.
      */
    val resumeToken: ByteString = js.native
  }
  
  /* static members */
  @js.native
  object RemoteEvent extends js.Object {
    /**
      * HACK: Views require RemoteEvents in order to determine whether the view is
      * CURRENT, but secondary tabs don't receive remote events. So this method is
      * used to create a synthesized RemoteEvent that can be used to apply a
      * CURRENT status change to a View, for queries executed in a different tab.
      */
    def createSynthesizedRemoteEventForCurrentChange(targetId: TargetId, current: Boolean): RemoteEvent = js.native
  }
  
  /* static members */
  @js.native
  object TargetChange extends js.Object {
    /**
      * This method is used to create a synthesized TargetChanges that can be used to
      * apply a CURRENT status change to a View (for queries executed in a different
      * tab) or for new queries (to raise snapshots with correct CURRENT status).
      */
    def createSynthesizedTargetChangeForCurrentChange(targetId: TargetId, current: Boolean): TargetChange = js.native
  }
  
}

