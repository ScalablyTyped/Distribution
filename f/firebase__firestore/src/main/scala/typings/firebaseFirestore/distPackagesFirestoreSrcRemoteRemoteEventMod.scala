package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalTargetDataMod.TargetPurpose
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.MutableDocumentMap_
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilSortedMapMod.SortedMap
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcRemoteRemoteEventMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/remote_event", "RemoteEvent")
  @js.native
  open class RemoteEvent protected () extends StObject {
    def this(
      /**
      * The snapshot version this event brings us up to, or MIN if not set.
      */
    snapshotVersion: SnapshotVersion,
      /**
      * A map from target to changes to the target. See TargetChange.
      */
    targetChanges: Map[TargetId, TargetChange],
      /**
      * A map of targets that is known to be inconsistent, and the purpose for
      * re-listening. Listens for these targets should be re-established without
      * resume tokens.
      */
    targetMismatches: SortedMap[TargetId, TargetPurpose],
      /**
      * A set of which documents have changed or been deleted, along with the
      * doc's new values (if not deleted).
      */
    documentUpdates: MutableDocumentMap_,
      /**
      * A set of which document updates are due only to limbo resolution targets.
      */
    resolvedLimboDocuments: DocumentKeySet_
    ) = this()
    
    /**
      * A set of which documents have changed or been deleted, along with the
      * doc's new values (if not deleted).
      */
    val documentUpdates: MutableDocumentMap_ = js.native
    
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
    val targetChanges: Map[TargetId, TargetChange] = js.native
    
    /**
      * A map of targets that is known to be inconsistent, and the purpose for
      * re-listening. Listens for these targets should be re-established without
      * resume tokens.
      */
    val targetMismatches: SortedMap[TargetId, TargetPurpose] = js.native
  }
  /* static members */
  object RemoteEvent {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/remote_event", "RemoteEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * HACK: Views require RemoteEvents in order to determine whether the view is
      * CURRENT, but secondary tabs don't receive remote events. So this method is
      * used to create a synthesized RemoteEvent that can be used to apply a
      * CURRENT status change to a View, for queries executed in a different tab.
      */
    inline def createSynthesizedRemoteEventForCurrentChange(targetId: TargetId, current: Boolean, resumeToken: ByteString): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createSynthesizedRemoteEventForCurrentChange")(targetId.asInstanceOf[js.Any], current.asInstanceOf[js.Any], resumeToken.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/remote_event", "TargetChange")
  @js.native
  open class TargetChange protected () extends StObject {
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
  object TargetChange {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/remote_event", "TargetChange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method is used to create a synthesized TargetChanges that can be used to
      * apply a CURRENT status change to a View (for queries executed in a different
      * tab) or for new queries (to raise snapshots with correct CURRENT status).
      */
    inline def createSynthesizedTargetChangeForCurrentChange(targetId: TargetId, current: Boolean, resumeToken: ByteString): TargetChange = (^.asInstanceOf[js.Dynamic].applyDynamic("createSynthesizedTargetChangeForCurrentChange")(targetId.asInstanceOf[js.Any], current.asInstanceOf[js.Any], resumeToken.asInstanceOf[js.Any])).asInstanceOf[TargetChange]
  }
}
