package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.bundleMod.LoadBundleTask
import typings.firebaseFirestore.bundleReaderMod.BundleReader
import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.eventManagerMod.EventManager
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.mutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.objMapMod.ObjectMap
import typings.firebaseFirestore.promiseMod.Deferred
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.referenceSetMod.ReferenceSet
import typings.firebaseFirestore.remoteEventMod.RemoteEvent
import typings.firebaseFirestore.remoteStoreMod.RemoteStore
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.sortedMapMod.SortedMap
import typings.firebaseFirestore.syncEngineMod.SyncEngine
import typings.firebaseFirestore.targetIdGeneratorMod.TargetIdGenerator
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.MutationBatchState
import typings.firebaseFirestore.typesMod.OnlineState
import typings.firebaseFirestore.typesMod.OnlineStateSource
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import typings.firebaseFirestore.viewMod.View
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncEngineImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/core/sync_engine_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSyncEngine(
    localStore: LocalStore,
    remoteStore: RemoteStore,
    eventManager: EventManager,
    sharedClientState: SharedClientState,
    currentUser: User,
    maxConcurrentLimboResolutions: Double,
    isPrimary: Boolean
  ): SyncEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("newSyncEngine")(localStore.asInstanceOf[js.Any], remoteStore.asInstanceOf[js.Any], eventManager.asInstanceOf[js.Any], sharedClientState.asInstanceOf[js.Any], currentUser.asInstanceOf[js.Any], maxConcurrentLimboResolutions.asInstanceOf[js.Any], isPrimary.asInstanceOf[js.Any])).asInstanceOf[SyncEngine]
  
  inline def syncEngineApplyActiveTargetsChange(syncEngine: SyncEngine, added: js.Array[TargetId], removed: js.Array[TargetId]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyActiveTargetsChange")(syncEngine.asInstanceOf[js.Any], added.asInstanceOf[js.Any], removed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineApplyBatchState(syncEngine: SyncEngine, batchId: BatchId, batchState: MutationBatchState): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyBatchState")(syncEngine.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], batchState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def syncEngineApplyBatchState(syncEngine: SyncEngine, batchId: BatchId, batchState: MutationBatchState, error: FirestoreError): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyBatchState")(syncEngine.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], batchState.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineApplyOnlineStateChange(syncEngine: SyncEngine, onlineState: OnlineState, source: OnlineStateSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyOnlineStateChange")(syncEngine.asInstanceOf[js.Any], onlineState.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def syncEngineApplyPrimaryState(syncEngine: SyncEngine, isPrimary: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyPrimaryState")(syncEngine.asInstanceOf[js.Any], isPrimary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineApplyRemoteEvent(syncEngine: SyncEngine, remoteEvent: RemoteEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyRemoteEvent")(syncEngine.asInstanceOf[js.Any], remoteEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineApplySuccessfulWrite(syncEngine: SyncEngine, mutationBatchResult: MutationBatchResult): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplySuccessfulWrite")(syncEngine.asInstanceOf[js.Any], mutationBatchResult.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineApplyTargetState(syncEngine: SyncEngine, targetId: TargetId, state: QueryTargetState): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyTargetState")(syncEngine.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def syncEngineApplyTargetState(syncEngine: SyncEngine, targetId: TargetId, state: QueryTargetState, error: FirestoreError): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineApplyTargetState")(syncEngine.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any], state.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineEmitNewSnapsAndNotifyLocalStore(syncEngine: SyncEngine, changes: DocumentMap_): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineEmitNewSnapsAndNotifyLocalStore")(syncEngine.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def syncEngineEmitNewSnapsAndNotifyLocalStore(syncEngine: SyncEngine, changes: DocumentMap_, remoteEvent: RemoteEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineEmitNewSnapsAndNotifyLocalStore")(syncEngine.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], remoteEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineEnsureWriteCallbacks(syncEngine: SyncEngine): SyncEngineImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineEnsureWriteCallbacks")(syncEngine.asInstanceOf[js.Any]).asInstanceOf[SyncEngineImpl]
  
  inline def syncEngineGetActiveClients(syncEngine: SyncEngine): js.Promise[js.Array[ClientId]] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineGetActiveClients")(syncEngine.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ClientId]]]
  
  inline def syncEngineGetActiveLimboDocumentResolutions(syncEngine: SyncEngine): SortedMap[DocumentKey, TargetId] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineGetActiveLimboDocumentResolutions")(syncEngine.asInstanceOf[js.Any]).asInstanceOf[SortedMap[DocumentKey, TargetId]]
  
  inline def syncEngineGetEnqueuedLimboDocumentResolutions(syncEngine: SyncEngine): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineGetEnqueuedLimboDocumentResolutions")(syncEngine.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  inline def syncEngineGetRemoteKeysForTarget(syncEngine: SyncEngine, targetId: TargetId): DocumentKeySet_ = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineGetRemoteKeysForTarget")(syncEngine.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any])).asInstanceOf[DocumentKeySet_]
  
  inline def syncEngineHandleCredentialChange(syncEngine: SyncEngine, user: User): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineHandleCredentialChange")(syncEngine.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineListen(syncEngine: SyncEngine, query: Query): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineListen")(syncEngine.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  
  inline def syncEngineLoadBundle(syncEngine: SyncEngine, bundleReader: BundleReader, task: LoadBundleTask): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineLoadBundle")(syncEngine.asInstanceOf[js.Any], bundleReader.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def syncEngineRegisterPendingWritesCallback(syncEngine: SyncEngine, callback: Deferred[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineRegisterPendingWritesCallback")(syncEngine.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineRejectFailedWrite(syncEngine: SyncEngine, batchId: BatchId, error: FirestoreError): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineRejectFailedWrite")(syncEngine.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineRejectListen(syncEngine: SyncEngine, targetId: TargetId, err: FirestoreError): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineRejectListen")(syncEngine.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineSynchronizeWithChangedDocuments(syncEngine: SyncEngine, collectionGroup: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineSynchronizeWithChangedDocuments")(syncEngine.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineUnlisten(syncEngine: SyncEngine, query: Query): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineUnlisten")(syncEngine.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def syncEngineWrite(syncEngine: SyncEngine, batch: js.Array[Mutation], userCallback: Deferred[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEngineWrite")(syncEngine.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], userCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * A function that updates a QueryView with a set of document changes (and a
    * remote event if applicable).
    */
  type ApplyDocChangesHandler = js.Function3[
    /* queryView */ QueryView, 
    /* changes */ DocumentMap_, 
    /* remoteEvent */ js.UndefOr[RemoteEvent], 
    js.Promise[js.UndefOr[ViewSnapshot]]
  ]
  
  /** Tracks a limbo resolution. */
  trait LimboResolution extends StObject {
    
    var key: DocumentKey
    
    /**
      * Set to true once we've received a document. This is used in
      * getRemoteKeysForTarget() and ultimately used by WatchChangeAggregator to
      * decide whether it needs to manufacture a delete event for the target once
      * the target is CURRENT.
      */
    var receivedDocument: Boolean
  }
  object LimboResolution {
    
    inline def apply(key: DocumentKey, receivedDocument: Boolean): LimboResolution = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], receivedDocument = receivedDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimboResolution]
    }
    
    extension [Self <: LimboResolution](x: Self) {
      
      inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setReceivedDocument(value: Boolean): Self = StObject.set(x, "receivedDocument", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * QueryView contains all of the data that SyncEngine needs to keep track of for
    * a particular query.
    */
  trait QueryView extends StObject {
    
    /**
      * The query itself.
      */
    var query: Query
    
    /**
      * The target number created by the client that is used in the watch
      * stream to identify this query.
      */
    var targetId: TargetId
    
    /**
      * The view is responsible for computing the final merged truth of what
      * docs are in the query. It gets notified of local and remote changes,
      * and applies the query filters and limits to determine the most correct
      * possible results.
      */
    var view: View
  }
  object QueryView {
    
    inline def apply(query: Query, targetId: TargetId, view: View): QueryView = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryView]
    }
    
    extension [Self <: QueryView](x: Self) {
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An implementation of `SyncEngine` coordinating with other parts of SDK.
    *
    * The parts of SyncEngine that act as a callback to RemoteStore need to be
    * registered individually. This is done in `syncEngineWrite()` and
    * `syncEngineListen()` (as well as `applyPrimaryState()`) as these methods
    * serve as entry points to RemoteStore's functionality.
    *
    * Note: some field defined in this class might have public access level, but
    * the class is not exported so they are only accessible from this module.
    * This is useful to implement optional features (like bundles) in free
    * functions, such that they are tree-shakeable.
    */
  @js.native
  trait SyncEngineImpl
    extends StObject
       with SyncEngine {
    
    var _isPrimaryClient: js.UndefOr[Boolean] = js.native
    
    /**
      * Keeps track of the information about an active limbo resolution for each
      * active target ID that was started for the purpose of limbo resolution.
      */
    var activeLimboResolutionsByTarget: Map[Double, LimboResolution] = js.native
    
    /**
      * Keeps track of the target ID for each document that is in limbo with an
      * active target.
      */
    var activeLimboTargetsByKey: SortedMap[DocumentKey, Double] = js.native
    
    /**
      * A callback that updates the QueryView based on the provided change.
      *
      * PORTING NOTE: On other platforms, this logic lives in
      * `emitNewSnapshotsAndNotifyLocalStore()`, but on Web it is extracted to
      *  ensure that all view logic only exists in bundles that include views.
      */
    var applyDocChanges: js.UndefOr[ApplyDocChangesHandler] = js.native
    
    var currentUser: User = js.native
    
    /**
      * The keys of documents that are in limbo for which we haven't yet started a
      * limbo resolution query. The strings in this set are the result of calling
      * `key.path.canonicalString()` where `key` is a `DocumentKey` object.
      *
      * The `Set` type was chosen because it provides efficient lookup and removal
      * of arbitrary elements and it also maintains insertion order, providing the
      * desired queue-like FIFO semantics.
      */
    var enqueuedLimboResolutions: Set[String] = js.native
    
    val eventManager: EventManager = js.native
    
    @JSName("isPrimaryClient")
    def isPrimaryClient_MSyncEngineImpl: Boolean = js.native
    
    var limboDocumentRefs: ReferenceSet = js.native
    
    var limboTargetIdGenerator: TargetIdGenerator = js.native
    
    val localStore: LocalStore = js.native
    
    val maxConcurrentLimboResolutions: Double = js.native
    
    /** Stores user completion handlers, indexed by User and BatchId. */
    var mutationUserCallbacks: StringDictionary[SortedMap[Double, Deferred[Unit]]] = js.native
    
    var onlineState: OnlineState = js.native
    
    /** Stores user callbacks waiting for all pending writes to be acknowledged. */
    var pendingWritesCallbacks: Map[Double, js.Array[Deferred[Unit]]] = js.native
    
    var queriesByTarget: Map[Double, js.Array[Query]] = js.native
    
    var queryViewsByQuery: ObjectMap[Query, QueryView] = js.native
    
    val remoteStore: RemoteStore = js.native
    
    val sharedClientState: SharedClientState = js.native
    
    var syncEngineListener: SyncEngineListener = js.native
  }
  
  /**
    * Callbacks implemented by EventManager to handle notifications from
    * SyncEngine.
    */
  trait SyncEngineListener extends StObject {
    
    /** Handles new view snapshots. */
    var onWatchChange: js.UndefOr[js.Function1[/* snapshots */ js.Array[ViewSnapshot], Unit]] = js.undefined
    
    /** Handles the failure of a query. */
    var onWatchError: js.UndefOr[js.Function2[/* query */ Query, /* error */ FirestoreError, Unit]] = js.undefined
  }
  object SyncEngineListener {
    
    inline def apply(): SyncEngineListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncEngineListener]
    }
    
    extension [Self <: SyncEngineListener](x: Self) {
      
      inline def setOnWatchChange(value: /* snapshots */ js.Array[ViewSnapshot] => Unit): Self = StObject.set(x, "onWatchChange", js.Any.fromFunction1(value))
      
      inline def setOnWatchChangeUndefined: Self = StObject.set(x, "onWatchChange", js.undefined)
      
      inline def setOnWatchError(value: (/* query */ Query, /* error */ FirestoreError) => Unit): Self = StObject.set(x, "onWatchError", js.Any.fromFunction2(value))
      
      inline def setOnWatchErrorUndefined: Self = StObject.set(x, "onWatchError", js.undefined)
    }
  }
}
