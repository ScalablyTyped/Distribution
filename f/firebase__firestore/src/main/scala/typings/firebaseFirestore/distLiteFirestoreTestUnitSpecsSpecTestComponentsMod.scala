package typings.firebaseFirestore

import org.scalablytyped.runtime.NumberDictionary
import typings.firebaseFirestore.distLiteFirestoreSrcCoreComponentProviderMod.ComponentConfiguration
import typings.firebaseFirestore.distLiteFirestoreSrcCoreComponentProviderMod.MemoryOfflineComponentProvider
import typings.firebaseFirestore.distLiteFirestoreSrcCoreComponentProviderMod.MultiTabOfflineComponentProvider
import typings.firebaseFirestore.distLiteFirestoreSrcCoreComponentProviderMod.OnlineComponentProvider
import typings.firebaseFirestore.distLiteFirestoreSrcCoreEventManagerMod.Observer
import typings.firebaseFirestore.distLiteFirestoreSrcCoreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.distLiteFirestoreSrcLocalMemoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.distLiteFirestoreSrcLocalMemoryPersistenceMod.MemoryReferenceDelegate
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.Scheduler
import typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateMod.ClientId
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ListenRequest
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ListenResponse
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.WriteRequest
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.WriteResponse
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.WriteResult
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteStreamBridgeMod.StreamBridge
import typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distLiteFirestoreSrcUtilMiscMod.EventHandler
import typings.firebaseFirestore.distLiteFirestoreSrcUtilPromiseMod.Deferred
import typings.firebaseFirestore.distLiteFirestoreSrcUtilTypesMod.DocumentLike
import typings.firebaseFirestore.distLiteFirestoreSrcUtilTypesMod.WindowLike
import typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
import typings.firebaseFirestore.distLiteFirestoreTestUtilTestPlatformMod.FakeDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestUnitSpecsSpecTestComponentsMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "EventAggregator")
  @js.native
  open class EventAggregator protected ()
    extends StObject
       with Observer[ViewSnapshot] {
    def this(query: Query, pushEvent: js.Function1[/* e */ QueryEvent, Unit]) = this()
    
    def error(error: js.Error): Unit = js.native
    /* CompleteClass */
    override def error(value: FirestoreError): Unit = js.native
    /* CompleteClass */
    @JSName("error")
    var error_Original: EventHandler[FirestoreError] = js.native
    
    /* CompleteClass */
    override def next(value: ViewSnapshot): Unit = js.native
    /* CompleteClass */
    @JSName("next")
    var next_Original: EventHandler[ViewSnapshot] = js.native
    
    /* private */ var pushEvent: Any = js.native
    
    /* private */ var query: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends StObject
       with Connection {
    def this(queue: AsyncQueue) = this()
    
    def ackWrite(): Unit = js.native
    def ackWrite(commitTime: Unit, mutationResults: js.Array[WriteResult]): Unit = js.native
    def ackWrite(commitTime: Timestamp): Unit = js.native
    def ackWrite(commitTime: Timestamp, mutationResults: js.Array[WriteResult]): Unit = js.native
    
    /**
      * Tracks the currently active watch targets as detected by the mock watch
      * stream, as a mapping from target ID to query Target.
      */
    var activeTargets: NumberDictionary[Target] = js.native
    
    /**
      * The set of mutations sent out before there was a corresponding
      * writeSendBarrier.
      */
    var earlyWrites: js.Array[WriteRequest] = js.native
    
    def failWatchStream(): Unit = js.native
    def failWatchStream(err: FirestoreError): Unit = js.native
    
    def failWrite(err: FirestoreError): Unit = js.native
    
    def invokeRPC[Req](rpcName: String, request: Req): scala.Nothing = js.native
    
    def invokeStreamingRPC[Req](rpcName: String, request: Req): scala.Nothing = js.native
    
    /** Whether the Watch stream is open. */
    var isWatchOpen: Boolean = js.native
    
    var nextWriteStreamToken: Double = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var resetAndCloseWatchStream: Any = js.native
    
    /* private */ var resetAndCloseWriteStream: Any = js.native
    
    def waitForWatchOpen(): js.Promise[Unit] = js.native
    
    def waitForWriteRequest(): js.Promise[WriteRequest] = js.native
    
    /** A Deferred that is resolved once watch opens. */
    var watchOpen: Deferred[Unit] = js.native
    
    var watchStream: (StreamBridge[ListenRequest, ListenResponse]) | Null = js.native
    
    /** The total number of requests sent to the watch stream. */
    var watchStreamRequestCount: Double = js.native
    
    /**
      * Used to make sure a write was actually sent out on the network before the
      * test runner continues.
      */
    var writeSendBarriers: js.Array[Deferred[WriteRequest]] = js.native
    
    var writeStream: (StreamBridge[WriteRequest, WriteResponse]) | Null = js.native
    
    /** The total number of requests sent to the write stream. */
    var writeStreamRequestCount: Double = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockIndexedDbPersistence")
  @js.native
  open class MockIndexedDbPersistence protected () extends IndexedDbPersistence {
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: Null,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: Null,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    def this(
      /**
      * Whether to synchronize the in-memory state of multiple tabs and share
      * access to local persistence.
      */
    allowTabSynchronization: Boolean,
      persistenceKey: String,
      clientId: ClientId,
      lruParams: LruParams,
      queue: AsyncQueue,
      window: WindowLike,
      document: DocumentLike,
      serializer: JsonProtoSerializer,
      sequenceNumberSyncer: SequenceNumberSyncer,
      /**
      * If set to true, forcefully obtains database access. Existing tabs will
      * no longer be able to access IndexedDB.
      */
    forceOwningTab: Boolean,
      schemaVersion: Double
    ) = this()
    
    var injectFailures: js.Array[PersistenceAction] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockMemoryOfflineComponentProvider")
  @js.native
  open class MockMemoryOfflineComponentProvider protected () extends MemoryOfflineComponentProvider {
    def this(gcEnabled: Boolean) = this()
    
    var connection: MockConnection = js.native
    
    def createGarbageCollectionScheduler(cfg: ComponentConfiguration): Scheduler | Null = js.native
    
    /* private */ val gcEnabled: Any = js.native
    
    @JSName("persistence")
    var persistence_MockMemoryOfflineComponentProvider: MockMemoryPersistence = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockMemoryPersistence")
  @js.native
  open class MockMemoryPersistence protected () extends MemoryPersistence {
    /**
      * The constructor accepts a factory for creating a reference delegate. This
      * allows both the delegate and this instance to have strong references to
      * each other without having nullable fields that would then need to be
      * checked or asserted on every access.
      */
    def this(
      referenceDelegateFactory: js.Function1[/* p */ MemoryPersistence, MemoryReferenceDelegate],
      serializer: JsonProtoSerializer
    ) = this()
    
    var injectFailures: js.Array[PersistenceAction] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockMultiTabOfflineComponentProvider")
  @js.native
  open class MockMultiTabOfflineComponentProvider protected () extends MultiTabOfflineComponentProvider {
    def this(window: WindowLike, document: FakeDocument, onlineComponentProvider: OnlineComponentProvider) = this()
    
    /* private */ val document: Any = js.native
    
    @JSName("persistence")
    var persistence_MockMultiTabOfflineComponentProvider: MockIndexedDbPersistence = js.native
    
    /* private */ val window: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "MockOnlineComponentProvider")
  @js.native
  open class MockOnlineComponentProvider protected () extends OnlineComponentProvider {
    def this(connection: MockConnection) = this()
    
    /* private */ val connection: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_test_components", "SharedWriteTracker")
  @js.native
  open class SharedWriteTracker () extends StObject {
    
    def peek(): js.Array[Mutation] = js.native
    
    def push(write: js.Array[Mutation]): Unit = js.native
    
    def shift(): js.Array[Mutation] = js.native
    
    /* private */ var writes: Any = js.native
  }
  
  trait QueryEvent extends StObject {
    
    var error: js.UndefOr[FirestoreError] = js.undefined
    
    var query: Query
    
    var view: js.UndefOr[ViewSnapshot] = js.undefined
  }
  object QueryEvent {
    
    inline def apply(query: Query): QueryEvent = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryEvent]
    }
    
    extension [Self <: QueryEvent](x: Self) {
      
      inline def setError(value: FirestoreError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setView(value: ViewSnapshot): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
