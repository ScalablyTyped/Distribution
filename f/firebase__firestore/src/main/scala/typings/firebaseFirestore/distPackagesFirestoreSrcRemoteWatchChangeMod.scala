package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteExistenceFilterMod.ExistenceFilter
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteRemoteEventMod.RemoteEvent
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import typings.firebaseFirestore.firebaseFirestoreInts.`3`
import typings.firebaseFirestore.firebaseFirestoreInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcRemoteWatchChangeMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/watch_change", "DocumentWatchChange")
  @js.native
  open class DocumentWatchChange protected ()
    extends StObject
       with WatchChange {
    def this(
      /** The new document applies to all of these targets. */
    updatedTargetIds: js.Array[TargetId],
      /** The new document is removed from all of these targets. */
    removedTargetIds: js.Array[TargetId],
      /** The key of the document for this change. */
    key: DocumentKey
    ) = this()
    def this(
      /** The new document applies to all of these targets. */
    updatedTargetIds: js.Array[TargetId],
      /** The new document is removed from all of these targets. */
    removedTargetIds: js.Array[TargetId],
      /** The key of the document for this change. */
    key: DocumentKey,
      /**
      * The new document or NoDocument if it was deleted. Is null if the
      * document went out of view without the server sending a new document.
      */
    newDoc: MutableDocument
    ) = this()
    
    /** The key of the document for this change. */
    var key: DocumentKey = js.native
    
    /**
      * The new document or NoDocument if it was deleted. Is null if the
      * document went out of view without the server sending a new document.
      */
    var newDoc: MutableDocument | Null = js.native
    
    /** The new document is removed from all of these targets. */
    var removedTargetIds: js.Array[TargetId] = js.native
    
    /** The new document applies to all of these targets. */
    var updatedTargetIds: js.Array[TargetId] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/watch_change", "ExistenceFilterChange")
  @js.native
  open class ExistenceFilterChange protected ()
    extends StObject
       with WatchChange {
    def this(targetId: TargetId, existenceFilter: ExistenceFilter) = this()
    
    var existenceFilter: ExistenceFilter = js.native
    
    var targetId: TargetId = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/watch_change", "WatchChangeAggregator")
  @js.native
  open class WatchChangeAggregator protected () extends StObject {
    def this(metadataProvider: TargetMetadataProvider) = this()
    
    /**
      * Adds the provided document to the internal list of document updates and
      * its document key to the given target's mapping.
      */
    def addDocumentToTarget(targetId: TargetId, document: MutableDocument): Unit = js.native
    
    /**
      * Converts the currently accumulated state into a remote event at the
      * provided snapshot version. Resets the accumulated changes before returning.
      */
    def createRemoteEvent(snapshotVersion: SnapshotVersion): RemoteEvent = js.native
    
    /* private */ var ensureDocumentTargetMapping: Any = js.native
    
    /* private */ var ensureTargetState: Any = js.native
    
    /**
      * Iterates over all targetIds that the watch change applies to: either the
      * targetIds explicitly listed in the change or the targetIds of all currently
      * active targets.
      */
    def forEachTarget(targetChange: WatchTargetChange, fn: js.Function1[/* targetId */ TargetId, Unit]): Unit = js.native
    
    /**
      * Returns the current count of documents in the target. This includes both
      * the number of documents that the LocalStore considers to be part of the
      * target as well as any accumulated changes.
      */
    /* private */ var getCurrentDocumentCountForTarget: Any = js.native
    
    /**
      * Processes and adds the DocumentWatchChange to the current set of changes.
      */
    def handleDocumentChange(docChange: DocumentWatchChange): Unit = js.native
    
    /**
      * Handles existence filters and synthesizes deletes for filter mismatches.
      * Targets that are invalidated by filter mismatches are added to
      * `pendingTargetResets`.
      */
    def handleExistenceFilter(watchChange: ExistenceFilterChange): Unit = js.native
    
    /** Processes and adds the WatchTargetChange to the current set of changes. */
    def handleTargetChange(targetChange: WatchTargetChange): Unit = js.native
    
    /**
      * Verifies that the user is still interested in this target (by calling
      * `getTargetDataForTarget()`) and that we are not waiting for pending ADDs
      * from watch.
      */
    /* protected */ def isActiveTarget(targetId: TargetId): Boolean = js.native
    
    /* private */ var metadataProvider: Any = js.native
    
    /** A mapping of document keys to their set of target IDs. */
    /* private */ var pendingDocumentTargetMapping: Any = js.native
    
    /** Keeps track of the documents to update since the last raised snapshot. */
    /* private */ var pendingDocumentUpdates: Any = js.native
    
    /**
      * A list of targets with existence filter mismatches. These targets are
      * known to be inconsistent and their listens needs to be re-established by
      * RemoteStore.
      */
    /* private */ var pendingTargetResets: Any = js.native
    
    /**
      * Increment the number of acks needed from watch before we can consider the
      * server to be 'in-sync' with the client's active targets.
      */
    def recordPendingTargetRequest(targetId: TargetId): Unit = js.native
    
    /**
      * Removes the provided document from the target mapping. If the
      * document no longer matches the target, but the document's state is still
      * known (e.g. we know that the document was deleted or we received the change
      * that caused the filter mismatch), the new document can be provided
      * to update the remote document cache.
      */
    def removeDocumentFromTarget(targetId: TargetId, key: DocumentKey): Unit = js.native
    def removeDocumentFromTarget(targetId: TargetId, key: DocumentKey, updatedDocument: MutableDocument): Unit = js.native
    
    def removeTarget(targetId: TargetId): Unit = js.native
    
    /**
      * Resets the state of a Watch target to its initial state (e.g. sets
      * 'current' to false, clears the resume token and removes its target mapping
      * from all documents).
      */
    /* private */ var resetTarget: Any = js.native
    
    /**
      * Returns whether the LocalStore considers the document to be part of the
      * specified target.
      */
    /* private */ var targetContainsDocument: Any = js.native
    
    /**
      * Returns the TargetData for an active target (i.e. a target that the user
      * is still interested in that has no outstanding target change requests).
      */
    /* protected */ def targetDataForActiveTarget(targetId: TargetId): TargetData | Null = js.native
    
    /** The internal state of all tracked targets. */
    /* private */ var targetStates: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/watch_change", "WatchTargetChange")
  @js.native
  open class WatchTargetChange protected ()
    extends StObject
       with WatchChange {
    def this(
      /** What kind of change occurred to the watch target. */
    state: WatchTargetChangeState,
      /** The target IDs that were added/removed/set. */
    targetIds: js.Array[TargetId]
    ) = this()
    def this(
      /** What kind of change occurred to the watch target. */
    state: WatchTargetChangeState,
      /** The target IDs that were added/removed/set. */
    targetIds: js.Array[TargetId],
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString
    ) = this()
    def this(
      /** What kind of change occurred to the watch target. */
    state: WatchTargetChangeState,
      /** The target IDs that were added/removed/set. */
    targetIds: js.Array[TargetId],
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: Unit,
      /** An RPC error indicating why the watch failed. */
    cause: FirestoreError
    ) = this()
    def this(
      /** What kind of change occurred to the watch target. */
    state: WatchTargetChangeState,
      /** The target IDs that were added/removed/set. */
    targetIds: js.Array[TargetId],
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString,
      /** An RPC error indicating why the watch failed. */
    cause: FirestoreError
    ) = this()
    
    /** An RPC error indicating why the watch failed. */
    var cause: FirestoreError | Null = js.native
    
    /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    var resumeToken: ByteString = js.native
    
    /** What kind of change occurred to the watch target. */
    var state: WatchTargetChangeState = js.native
    
    /** The target IDs that were added/removed/set. */
    var targetIds: js.Array[TargetId] = js.native
  }
  
  trait TargetMetadataProvider extends StObject {
    
    /**
      * Returns the set of remote document keys for the given target ID as of the
      * last raised snapshot.
      */
    def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_
    
    /**
      * Returns the TargetData for an active target ID or 'null' if this target
      * has become inactive
      */
    def getTargetDataForTarget(targetId: TargetId): TargetData | Null
  }
  object TargetMetadataProvider {
    
    inline def apply(
      getRemoteKeysForTarget: TargetId => DocumentKeySet_,
      getTargetDataForTarget: TargetId => TargetData | Null
    ): TargetMetadataProvider = {
      val __obj = js.Dynamic.literal(getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), getTargetDataForTarget = js.Any.fromFunction1(getTargetDataForTarget))
      __obj.asInstanceOf[TargetMetadataProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetMetadataProvider] (val x: Self) extends AnyVal {
      
      inline def setGetRemoteKeysForTarget(value: TargetId => DocumentKeySet_): Self = StObject.set(x, "getRemoteKeysForTarget", js.Any.fromFunction1(value))
      
      inline def setGetTargetDataForTarget(value: TargetId => TargetData | Null): Self = StObject.set(x, "getTargetDataForTarget", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distPackagesFirestoreSrcRemoteWatchChangeMod.DocumentWatchChange
    - typings.firebaseFirestore.distPackagesFirestoreSrcRemoteWatchChangeMod.WatchTargetChange
    - typings.firebaseFirestore.distPackagesFirestoreSrcRemoteWatchChangeMod.ExistenceFilterChange
  */
  trait WatchChange extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
    - typings.firebaseFirestore.firebaseFirestoreInts.`2`
    - typings.firebaseFirestore.firebaseFirestoreInts.`3`
    - typings.firebaseFirestore.firebaseFirestoreInts.`4`
  */
  trait WatchTargetChangeState extends StObject
  object WatchTargetChangeState {
    
    inline def Added: `1` = 1.asInstanceOf[`1`]
    
    inline def Current: `3` = 3.asInstanceOf[`3`]
    
    inline def NoChange: `0` = 0.asInstanceOf[`0`]
    
    inline def Removed: `2` = 2.asInstanceOf[`2`]
    
    inline def Reset: `4` = 4.asInstanceOf[`4`]
  }
}
