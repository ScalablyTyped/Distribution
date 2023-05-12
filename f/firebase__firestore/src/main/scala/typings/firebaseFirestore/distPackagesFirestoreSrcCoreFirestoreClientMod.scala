package typings.firebaseFirestore

import typings.firebaseFirestore.anon.OfflineKindOnline
import typings.firebaseFirestore.anon.PartialObserverViewSnapshErrorNext
import typings.firebaseFirestore.anon.PartialObservervoidErrorNext
import typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask
import typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreAggregateMod.Aggregate
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.NamedQuery
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.ComponentConfiguration
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.OfflineComponentProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.OnlineComponentProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreEventManagerMod.EventManager
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreEventManagerMod.ListenOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSyncEngineMod.SyncEngine
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTransactionMod.Transaction
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalStoreMod.LocalStore
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestoreTypes.mod.GetOptions
import typings.std.DOMException
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreFirestoreClientMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/firestore_client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/firestore_client", "FirestoreClient")
  @js.native
  open class FirestoreClient protected () extends StObject {
    def this(
      authCredentials: CredentialsProvider[User],
      appCheckCredentials: CredentialsProvider[String],
      /**
      * Asynchronous queue responsible for all of our internal processing. When
      * we get incoming work from the user (via public API) or the network
      * (incoming GRPC messages), we should always schedule onto this queue.
      * This ensures all of our work is properly serialized (e.g. we don't
      * start processing a new operation while the previous one is waiting for
      * an async I/O to complete).
      */
    asyncQueue: AsyncQueue,
      databaseInfo: DatabaseInfo
    ) = this()
    
    var _offlineComponents: js.UndefOr[OfflineComponentProvider] = js.native
    
    var _onlineComponents: js.UndefOr[OnlineComponentProvider] = js.native
    
    var _uninitializedComponentsProvider: js.UndefOr[OfflineKindOnline] = js.native
    
    /* private */ var appCheckCredentialListener: Any = js.native
    
    /* private */ var appCheckCredentials: Any = js.native
    
    /**
      * Asynchronous queue responsible for all of our internal processing. When
      * we get incoming work from the user (via public API) or the network
      * (incoming GRPC messages), we should always schedule onto this queue.
      * This ensures all of our work is properly serialized (e.g. we don't
      * start processing a new operation while the previous one is waiting for
      * an async I/O to complete).
      */
    var asyncQueue: AsyncQueue = js.native
    
    /* private */ var authCredentialListener: Any = js.native
    
    /* private */ var authCredentials: Any = js.native
    
    /* private */ val clientId: Any = js.native
    
    /* private */ var databaseInfo: Any = js.native
    
    def getConfiguration(): js.Promise[ComponentConfiguration] = js.native
    
    def setAppCheckTokenChangeListener(listener: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]]): Unit = js.native
    
    def setCredentialChangeListener(listener: js.Function1[/* user */ User, js.Promise[Unit]]): Unit = js.native
    
    def terminate(): js.Promise[Unit] = js.native
    
    /* private */ var user: Any = js.native
    
    /**
      * Checks that the client has not been terminated. Ensures that other methods on //
      * this class cannot be called after the client is terminated. //
      */
    def verifyNotTerminated(): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/firestore_client", "MAX_CONCURRENT_LIMBO_RESOLUTIONS")
  @js.native
  val MAX_CONCURRENT_LIMBO_RESOLUTIONS: /* 100 */ Double = js.native
  
  inline def canFallbackFromIndexedDbError(error: FirestoreError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canFallbackFromIndexedDbError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def canFallbackFromIndexedDbError(error: DOMException): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canFallbackFromIndexedDbError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def firestoreClientAddSnapshotsInSyncListener(client: FirestoreClient, observer: PartialObservervoidErrorNext): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientAddSnapshotsInSyncListener")(client.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def firestoreClientDisableNetwork(client: FirestoreClient): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientDisableNetwork")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def firestoreClientEnableNetwork(client: FirestoreClient): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientEnableNetwork")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def firestoreClientGetDocumentFromLocalCache(client: FirestoreClient, docKey: DocumentKey): js.Promise[Document | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentFromLocalCache")(client.asInstanceOf[js.Any], docKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document | Null]]
  
  inline def firestoreClientGetDocumentViaSnapshotListener(client: FirestoreClient, key: DocumentKey): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentViaSnapshotListener")(client.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  inline def firestoreClientGetDocumentViaSnapshotListener(client: FirestoreClient, key: DocumentKey, options: GetOptions): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentViaSnapshotListener")(client.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  
  inline def firestoreClientGetDocumentsFromLocalCache(client: FirestoreClient, query: Query): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentsFromLocalCache")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  
  inline def firestoreClientGetDocumentsViaSnapshotListener(client: FirestoreClient, query: Query): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentsViaSnapshotListener")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  inline def firestoreClientGetDocumentsViaSnapshotListener(client: FirestoreClient, query: Query, options: GetOptions): js.Promise[ViewSnapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetDocumentsViaSnapshotListener")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ViewSnapshot]]
  
  inline def firestoreClientGetNamedQuery(client: FirestoreClient, queryName: String): js.Promise[js.UndefOr[NamedQuery]] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientGetNamedQuery")(client.asInstanceOf[js.Any], queryName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[NamedQuery]]]
  
  inline def firestoreClientListen(
    client: FirestoreClient,
    query: Query,
    options: ListenOptions,
    observer: PartialObserverViewSnapshErrorNext
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientListen")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def firestoreClientLoadBundle(client: FirestoreClient, databaseId: DatabaseId, data: String, resultTask: LoadBundleTask): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientLoadBundle")(client.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultTask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def firestoreClientLoadBundle(
    client: FirestoreClient,
    databaseId: DatabaseId,
    data: js.typedarray.ArrayBuffer,
    resultTask: LoadBundleTask
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientLoadBundle")(client.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultTask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def firestoreClientLoadBundle(
    client: FirestoreClient,
    databaseId: DatabaseId,
    data: ReadableStream[js.typedarray.Uint8Array],
    resultTask: LoadBundleTask
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientLoadBundle")(client.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultTask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def firestoreClientRunAggregateQuery(client: FirestoreClient, query: Query, aggregates: js.Array[Aggregate]): js.Promise[ApiClientObjectMap[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientRunAggregateQuery")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], aggregates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiClientObjectMap[Value]]]
  
  inline def firestoreClientSetIndexConfiguration(client: FirestoreClient, indexes: js.Array[FieldIndex]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientSetIndexConfiguration")(client.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def firestoreClientTransaction[T](
    client: FirestoreClient,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientTransaction")(client.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def firestoreClientWaitForPendingWrites(client: FirestoreClient): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientWaitForPendingWrites")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def firestoreClientWrite(client: FirestoreClient, mutations: js.Array[Mutation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("firestoreClientWrite")(client.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getEventManager(client: FirestoreClient): js.Promise[EventManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventManager")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EventManager]]
  
  inline def getLocalStore(client: FirestoreClient): js.Promise[LocalStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalStore")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalStore]]
  
  inline def getSyncEngine(client: FirestoreClient): js.Promise[SyncEngine] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyncEngine")(client.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SyncEngine]]
  
  inline def setOfflineComponentProvider(client: FirestoreClient, offlineComponentProvider: OfflineComponentProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setOfflineComponentProvider")(client.asInstanceOf[js.Any], offlineComponentProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setOnlineComponentProvider(client: FirestoreClient, onlineComponentProvider: OnlineComponentProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setOnlineComponentProvider")(client.asInstanceOf[js.Any], onlineComponentProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
