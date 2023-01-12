package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
import typings.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.DocumentChangeSet
import typings.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLocalStoreImplMod.QueryResult
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentSetMod.DocumentSet
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteRemoteEventMod.TargetChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreViewMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/view", "AddedLimboDocument")
  @js.native
  open class AddedLimboDocument protected ()
    extends StObject
       with LimboDocumentChange {
    def this(key: DocumentKey) = this()
    
    var key: DocumentKey = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/view", "RemovedLimboDocument")
  @js.native
  open class RemovedLimboDocument protected ()
    extends StObject
       with LimboDocumentChange {
    def this(key: DocumentKey) = this()
    
    var key: DocumentKey = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/view", "View")
  @js.native
  open class View protected () extends StObject {
    def this(query: Query, /** Documents included in the remote target */
    _syncedDocuments: DocumentKeySet_) = this()
    
    /** Documents included in the remote target */
    /* private */ var _syncedDocuments: Any = js.native
    
    /**
      * Updates the view with the given ViewDocumentChanges and optionally updates
      * limbo docs and sync state from the provided target change.
      * @param docChanges - The set of changes to make to the view's docs.
      * @param updateLimboDocuments - Whether to update limbo documents based on
      *        this change.
      * @param targetChange - A target change to apply for computing limbo docs and
      *        sync state.
      * @returns A new ViewChange with the given docs, changes, and sync state.
      */
    def applyChanges(docChanges: ViewDocumentChanges, updateLimboDocuments: Boolean): ViewChange = js.native
    def applyChanges(docChanges: ViewDocumentChanges, updateLimboDocuments: Boolean, targetChange: TargetChange): ViewChange = js.native
    
    /**
      * Applies an OnlineState change to the view, potentially generating a
      * ViewChange if the view's syncState changes as a result.
      */
    def applyOnlineStateChange(onlineState: OnlineState): ViewChange = js.native
    
    /**
      * Updates syncedDocuments, current, and limbo docs based on the given change.
      * Returns the list of changes to which docs are in limbo.
      */
    /* private */ var applyTargetChange: Any = js.native
    
    /**
      * Iterates over a set of doc changes, applies the query limit, and computes
      * what the new results should be, what the changes were, and whether we may
      * need to go back to the local cache for more results. Does not make any
      * changes to the view.
      * @param docChanges - The doc changes to apply to this view.
      * @param previousChanges - If this is being called with a refill, then start
      *        with this set of docs and changes instead of the current view.
      * @returns a new set of docs, changes, and refill flag.
      */
    def computeDocChanges(docChanges: DocumentMap_): ViewDocumentChanges = js.native
    def computeDocChanges(docChanges: DocumentMap_, previousChanges: ViewDocumentChanges): ViewDocumentChanges = js.native
    
    /**
      * Returns a view snapshot as if this query was just listened to. Contains
      * a document add for every existing document and the `fromCache` and
      * `hasPendingWrites` status of the already established view.
      */
    def computeInitialSnapshot(): ViewSnapshot = js.native
    
    /**
      * A flag whether the view is current with the backend. A view is considered
      * current after it has seen the current flag from the backend and did not
      * lose consistency within the watch stream (e.g. because of an existence
      * filter mismatch).
      */
    /* private */ var current: Any = js.native
    
    /** Query comparator that defines the document order in this view. */
    /* private */ var docComparator: Any = js.native
    
    /* private */ var documentSet: Any = js.native
    
    /* private */ var hasCachedResults: Any = js.native
    
    /** Documents in the view but not in the remote target */
    /* private */ var limboDocuments: Any = js.native
    
    /** Document Keys that have local changes */
    /* private */ var mutatedKeys: Any = js.native
    
    /* private */ var query: Any = js.native
    
    /**
      * Returns whether the doc for the given key should be in limbo.
      */
    /* private */ var shouldBeInLimbo: Any = js.native
    
    /* private */ var shouldWaitForSyncedDocument: Any = js.native
    
    /* private */ var syncState: Any = js.native
    
    /**
      * The set of remote documents that the server has told us belongs to the target associated with
      * this view.
      */
    def syncedDocuments: DocumentKeySet_ = js.native
    
    /**
      * Update the in-memory state of the current view with the state read from
      * persistence.
      *
      * We update the query view whenever a client's primary status changes:
      * - When a client transitions from primary to secondary, it can miss
      *   LocalStorage updates and its query views may temporarily not be
      *   synchronized with the state on disk.
      * - For secondary to primary transitions, the client needs to update the list
      *   of `syncedDocuments` since secondary clients update their query views
      *   based purely on synthesized RemoteEvents.
      *
      * @param queryResult.documents - The documents that match the query according
      * to the LocalStore.
      * @param queryResult.remoteKeys - The keys of the documents that match the
      * query according to the backend.
      *
      * @returns The ViewChange that resulted from this synchronization.
      */
    def synchronizeWithPersistedState(queryResult: QueryResult): ViewChange = js.native
    
    /* private */ var updateLimboDocuments: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distLiteFirestoreSrcCoreViewMod.AddedLimboDocument
    - typings.firebaseFirestore.distLiteFirestoreSrcCoreViewMod.RemovedLimboDocument
  */
  trait LimboDocumentChange extends StObject
  
  trait ViewChange extends StObject {
    
    var limboChanges: js.Array[LimboDocumentChange]
    
    var snapshot: js.UndefOr[ViewSnapshot] = js.undefined
  }
  object ViewChange {
    
    inline def apply(limboChanges: js.Array[LimboDocumentChange]): ViewChange = {
      val __obj = js.Dynamic.literal(limboChanges = limboChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewChange] (val x: Self) extends AnyVal {
      
      inline def setLimboChanges(value: js.Array[LimboDocumentChange]): Self = StObject.set(x, "limboChanges", value.asInstanceOf[js.Any])
      
      inline def setLimboChangesVarargs(value: LimboDocumentChange*): Self = StObject.set(x, "limboChanges", js.Array(value*))
      
      inline def setSnapshot(value: ViewSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    }
  }
  
  trait ViewDocumentChanges extends StObject {
    
    /** The diff of these docs with the previous set of docs. */
    var changeSet: DocumentChangeSet
    
    /** The new set of docs that should be in the view. */
    var documentSet: DocumentSet
    
    var mutatedKeys: DocumentKeySet_
    
    /**
      * Whether the set of documents passed in was not sufficient to calculate the
      * new state of the view and there needs to be another pass based on the
      * local cache.
      */
    var needsRefill: Boolean
  }
  object ViewDocumentChanges {
    
    inline def apply(
      changeSet: DocumentChangeSet,
      documentSet: DocumentSet,
      mutatedKeys: DocumentKeySet_,
      needsRefill: Boolean
    ): ViewDocumentChanges = {
      val __obj = js.Dynamic.literal(changeSet = changeSet.asInstanceOf[js.Any], documentSet = documentSet.asInstanceOf[js.Any], mutatedKeys = mutatedKeys.asInstanceOf[js.Any], needsRefill = needsRefill.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewDocumentChanges]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewDocumentChanges] (val x: Self) extends AnyVal {
      
      inline def setChangeSet(value: DocumentChangeSet): Self = StObject.set(x, "changeSet", value.asInstanceOf[js.Any])
      
      inline def setDocumentSet(value: DocumentSet): Self = StObject.set(x, "documentSet", value.asInstanceOf[js.Any])
      
      inline def setMutatedKeys(value: DocumentKeySet_): Self = StObject.set(x, "mutatedKeys", value.asInstanceOf[js.Any])
      
      inline def setNeedsRefill(value: Boolean): Self = StObject.set(x, "needsRefill", value.asInstanceOf[js.Any])
    }
  }
}
