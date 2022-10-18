package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.SharedClientStateSyncer
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.TargetIdSet_
import typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distLiteFirestoreSrcUtilSortedSetMod.SortedSet
import typings.firebaseFirestore.distLiteFirestoreSrcUtilTypesMod.WindowLike
import typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged
import typings.firebaseFirestore.firebaseFirestoreStrings.rejected
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalSharedClientStateMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "LocalClientState")
  @js.native
  open class LocalClientState ()
    extends StObject
       with ClientState {
    
    /* CompleteClass */
    override val activeTargetIds: TargetIdSet_ = js.native
    @JSName("activeTargetIds")
    var activeTargetIds_LocalClientState: SortedSet[Double] = js.native
    
    def addQueryTarget(targetId: TargetId): Unit = js.native
    
    def removeQueryTarget(targetId: TargetId): Unit = js.native
    
    /**
      * Converts this entry into a JSON-encoded format we can use for WebStorage.
      * Does not encode `clientId` as it is part of the key in WebStorage.
      */
    def toWebStorageJSON(): String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "MemorySharedClientState")
  @js.native
  open class MemorySharedClientState ()
    extends StObject
       with SharedClientState {
    
    /* private */ var localState: Any = js.native
    
    /* private */ var queryState: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "MutationMetadata")
  @js.native
  open class MutationMetadata protected () extends StObject {
    def this(user: User, batchId: BatchId, state: MutationBatchState) = this()
    def this(user: User, batchId: BatchId, state: MutationBatchState, error: FirestoreError) = this()
    
    val batchId: BatchId = js.native
    
    val error: js.UndefOr[FirestoreError] = js.native
    
    val state: MutationBatchState = js.native
    
    def toWebStorageJSON(): String = js.native
    
    val user: User = js.native
  }
  /* static members */
  object MutationMetadata {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "MutationMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a MutationMetadata from its JSON representation in WebStorage.
      * Logs a warning and returns null if the format of the data is not valid.
      */
    inline def fromWebStorageEntry(user: User, batchId: BatchId, value: String): MutationMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebStorageEntry")(user.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[MutationMetadata | Null]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "QueryTargetMetadata")
  @js.native
  open class QueryTargetMetadata protected () extends StObject {
    def this(targetId: TargetId, state: QueryTargetState) = this()
    def this(targetId: TargetId, state: QueryTargetState, error: FirestoreError) = this()
    
    val error: js.UndefOr[FirestoreError] = js.native
    
    val state: QueryTargetState = js.native
    
    val targetId: TargetId = js.native
    
    def toWebStorageJSON(): String = js.native
  }
  /* static members */
  object QueryTargetMetadata {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "QueryTargetMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a QueryTargetMetadata from its JSON representation in WebStorage.
      * Logs a warning and returns null if the format of the data is not valid.
      */
    inline def fromWebStorageEntry(targetId: TargetId, value: String): QueryTargetMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebStorageEntry")(targetId.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryTargetMetadata | Null]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "SharedOnlineState")
  @js.native
  open class SharedOnlineState protected () extends StObject {
    def this(clientId: String, onlineState: OnlineState) = this()
    
    val clientId: String = js.native
    
    val onlineState: OnlineState = js.native
  }
  /* static members */
  object SharedOnlineState {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "SharedOnlineState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a SharedOnlineState from its JSON representation in WebStorage.
      * Logs a warning and returns null if the format of the data is not valid.
      */
    inline def fromWebStorageEntry(value: String): SharedOnlineState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebStorageEntry")(value.asInstanceOf[js.Any]).asInstanceOf[SharedOnlineState | Null]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "WebStorageSharedClientState")
  @js.native
  open class WebStorageSharedClientState protected ()
    extends StObject
       with SharedClientState {
    def this(
      window: WindowLike,
      queue: AsyncQueue,
      persistenceKey: String,
      localClientId: ClientId,
      initialUser: User
    ) = this()
    
    /* private */ var activeClients: Any = js.native
    
    /* private */ val bundleLoadedKey: Any = js.native
    
    /* private */ val clientStateKeyRe: Any = js.native
    
    /* private */ var currentUser: Any = js.native
    
    /**
      * Captures WebStorage events that occur before `start()` is called. These
      * events are replayed once `WebStorageSharedClientState` is started.
      */
    /* private */ var earlyEvents: Any = js.native
    
    /* private */ var extractActiveQueryTargets: Any = js.native
    
    /**
      * Parses a client state in WebStorage. Returns 'null' if the value could not
      * be parsed.
      */
    /* private */ var fromWebStorageClientState: Any = js.native
    
    /**
      * Parses a client state key in WebStorage. Returns null if the key does not
      * match the expected key format.
      */
    /* private */ var fromWebStorageClientStateKey: Any = js.native
    
    /**
      * Parses a mutation batch state in WebStorage. Returns 'null' if the value
      * could not be parsed.
      */
    /* private */ var fromWebStorageMutationMetadata: Any = js.native
    
    /**
      * Parses an online state from WebStorage. Returns 'null' if the value
      * could not be parsed.
      */
    /* private */ var fromWebStorageOnlineState: Any = js.native
    
    /**
      * Parses a query target state from WebStorage. Returns 'null' if the value
      * could not be parsed.
      */
    /* private */ var fromWebStorageQueryTargetMetadata: Any = js.native
    
    /* private */ var fromWebStoreBundleLoadedState: Any = js.native
    
    /* private */ var getItem: Any = js.native
    
    /* private */ var handleClientStateEvent: Any = js.native
    
    /* private */ var handleMutationBatchEvent: Any = js.native
    
    /* private */ var handleOnlineStateEvent: Any = js.native
    
    /* private */ var handleQueryTargetEvent: Any = js.native
    
    /* private */ var handleWebStorageEvent: Any = js.native
    
    /* private */ val localClientId: Any = js.native
    
    /* private */ def localClientState: Any = js.native
    
    /* private */ val localClientStorageKey: Any = js.native
    
    /* private */ val mutationBatchKeyRe: Any = js.native
    
    /* private */ val onlineStateKey: Any = js.native
    
    /* private */ var persistBundleLoadedState: Any = js.native
    
    /* private */ var persistClientState: Any = js.native
    
    /* private */ var persistMutationState: Any = js.native
    
    /* private */ var persistOnlineState: Any = js.native
    
    /* private */ var persistQueryTargetState: Any = js.native
    
    /* private */ val persistenceKey: Any = js.native
    
    /* private */ val queryTargetKeyRe: Any = js.native
    
    /* private */ val queue: Any = js.native
    
    /* private */ var removeItem: Any = js.native
    
    /* private */ var removeMutationState: Any = js.native
    
    /* private */ val sequenceNumberKey: Any = js.native
    
    /* private */ var setItem: Any = js.native
    
    /* private */ var started: Any = js.native
    
    /* private */ val storage: Any = js.native
    
    /* private */ val storageListener: Any = js.native
    
    var syncEngine: SharedClientStateSyncer | Null = js.native
    
    /* private */ val window: Any = js.native
  }
  /* static members */
  object WebStorageSharedClientState {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state", "WebStorageSharedClientState")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns 'true' if WebStorage is available in the current environment. */
    inline def isAvailable(): /* is @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/util/types.WindowLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[/* is @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/util/types.WindowLike */ Boolean]
    inline def isAvailable(window: WindowLike): /* is @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/util/types.WindowLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")(window.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/util/types.WindowLike */ Boolean]
  }
  
  type ClientId = String
  
  trait ClientState extends StObject {
    
    val activeTargetIds: TargetIdSet_
  }
  object ClientState {
    
    inline def apply(activeTargetIds: TargetIdSet_): ClientState = {
      val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientState]
    }
    
    extension [Self <: ClientState](x: Self) {
      
      inline def setActiveTargetIds(value: TargetIdSet_): Self = StObject.set(x, "activeTargetIds", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedClientState extends StObject {
    
    /**
      * Associates a new Query Target ID with the local Firestore client. Returns
      * the new query state for the query (which can be 'current' if the query is
      * already associated with another tab).
      *
      * If the target id is already associated with local client, the method simply
      * returns its `QueryTargetState`.
      */
    def addLocalQueryTarget(targetId: TargetId): QueryTargetState = js.native
    
    /** Registers the Mutation Batch ID of a newly pending mutation. */
    def addPendingMutation(batchId: BatchId): Unit = js.native
    
    /**
      * Removes the target's metadata entry.
      *
      * Called by the primary client when all clients stopped listening to a query
      * target.
      */
    def clearQueryState(targetId: TargetId): Unit = js.native
    
    /**
      * Gets the active Query Targets IDs for all active clients.
      *
      * The implementation for this may require O(n) runtime, where 'n' is the size
      * of the result set.
      */
    def getAllActiveQueryTargets(): SortedSet[TargetId] = js.native
    
    /**
      * Changes the active user and removes all existing user-specific data. The
      * user change does not call back into SyncEngine (for example, no mutations
      * will be marked as removed).
      */
    def handleUserChange(user: User, removedBatchIds: js.Array[BatchId], addedBatchIds: js.Array[BatchId]): Unit = js.native
    
    /**
      * Checks whether the provided target ID is currently being listened to by
      * any of the active clients.
      *
      * The implementation may require O(n*log m) runtime, where 'n' is the number
      * of clients and 'm' the number of targets.
      */
    def isActiveQueryTarget(targetId: TargetId): Boolean = js.native
    
    /** Checks whether the target is associated with the local client. */
    def isLocalQueryTarget(targetId: TargetId): Boolean = js.native
    
    /**
      * Notifies other clients when remote documents have changed due to loading
      * a bundle.
      *
      * @param collectionGroups The collection groups affected by this bundle.
      */
    def notifyBundleLoaded(collectionGroups: Set[String]): Unit = js.native
    
    var onlineStateHandler: (js.Function1[/* onlineState */ OnlineState, Unit]) | Null = js.native
    
    /** Removes the Query Target ID association from the local client. */
    def removeLocalQueryTarget(targetId: TargetId): Unit = js.native
    
    var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null = js.native
    
    /** Changes the shared online state of all clients. */
    def setOnlineState(onlineState: OnlineState): Unit = js.native
    
    /** Shuts down the `SharedClientState` and its listeners. */
    def shutdown(): Unit = js.native
    
    /**
      * Starts the SharedClientState, reads existing client data and registers
      * listeners for updates to new and existing clients.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Records that a pending mutation has been acknowledged or rejected.
      * Called by the primary client to notify secondary clients of mutation
      * results as they come back from the backend.
      */
    def updateMutationState(batchId: BatchId, state: acknowledged | rejected): Unit = js.native
    def updateMutationState(batchId: BatchId, state: acknowledged | rejected, error: FirestoreError): Unit = js.native
    
    /**
      * Processes an update to a query target.
      *
      * Called by the primary client to notify secondary clients of document
      * changes or state transitions that affect the provided query target.
      */
    def updateQueryState(targetId: TargetId, state: QueryTargetState): Unit = js.native
    def updateQueryState(targetId: TargetId, state: QueryTargetState, error: FirestoreError): Unit = js.native
    
    def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit = js.native
  }
}
