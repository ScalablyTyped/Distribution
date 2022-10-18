package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreEventManagerMod.EventManager
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSyncEngineMod.SyncEngine
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalStoreMod.LocalStore
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Scheduler
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateMod.ClientId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateMod.SharedClientState
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteDatastoreMod.Datastore
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteRemoteStoreMod.RemoteStore
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreComponentProviderMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "IndexedDbOfflineComponentProvider")
  @js.native
  open class IndexedDbOfflineComponentProvider protected () extends MemoryOfflineComponentProvider {
    def this(onlineComponentProvider: OnlineComponentProvider) = this()
    def this(onlineComponentProvider: OnlineComponentProvider, cacheSizeBytes: Double) = this()
    def this(onlineComponentProvider: OnlineComponentProvider, cacheSizeBytes: Double, forceOwnership: Boolean) = this()
    def this(onlineComponentProvider: OnlineComponentProvider, cacheSizeBytes: Unit, forceOwnership: Boolean) = this()
    
    /* protected */ val cacheSizeBytes: js.UndefOr[Double] = js.native
    
    /* protected */ val forceOwnership: js.UndefOr[Boolean] = js.native
    
    /* protected */ val onlineComponentProvider: OnlineComponentProvider = js.native
    
    @JSName("persistence")
    var persistence_IndexedDbOfflineComponentProvider: IndexedDbPersistence = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "MemoryOfflineComponentProvider")
  @js.native
  open class MemoryOfflineComponentProvider ()
    extends StObject
       with OfflineComponentProvider {
    
    def createGarbageCollectionScheduler(cfg: ComponentConfiguration, localStore: LocalStore): Scheduler | Null = js.native
    
    def createIndexBackfillerScheduler(cfg: ComponentConfiguration, localStore: LocalStore): Scheduler | Null = js.native
    
    def createLocalStore(cfg: ComponentConfiguration): LocalStore = js.native
    
    def createPersistence(cfg: ComponentConfiguration): Persistence = js.native
    
    def createSharedClientState(cfg: ComponentConfiguration): SharedClientState = js.native
    
    /* CompleteClass */
    var gcScheduler: Scheduler | Null = js.native
    
    /* CompleteClass */
    var indexBackfillerScheduler: Scheduler | Null = js.native
    
    /* CompleteClass */
    override def initialize(cfg: ComponentConfiguration): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var localStore: LocalStore = js.native
    
    /* CompleteClass */
    var persistence: Persistence = js.native
    
    var serializer: JsonProtoSerializer = js.native
    
    /* CompleteClass */
    var sharedClientState: SharedClientState = js.native
    
    /* CompleteClass */
    var synchronizeTabs: Boolean = js.native
    
    /* CompleteClass */
    override def terminate(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "MultiTabOfflineComponentProvider")
  @js.native
  open class MultiTabOfflineComponentProvider protected () extends IndexedDbOfflineComponentProvider {
    def this(onlineComponentProvider: OnlineComponentProvider) = this()
    def this(onlineComponentProvider: OnlineComponentProvider, cacheSizeBytes: Double) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "OnlineComponentProvider")
  @js.native
  open class OnlineComponentProvider () extends StObject {
    
    def createDatastore(cfg: ComponentConfiguration): Datastore = js.native
    
    def createEventManager(cfg: ComponentConfiguration): EventManager = js.native
    
    def createRemoteStore(cfg: ComponentConfiguration): RemoteStore = js.native
    
    def createSyncEngine(cfg: ComponentConfiguration, startAsPrimary: Boolean): SyncEngine = js.native
    
    var datastore: Datastore = js.native
    
    var eventManager: EventManager = js.native
    
    def initialize(offlineComponentProvider: OfflineComponentProvider, cfg: ComponentConfiguration): js.Promise[Unit] = js.native
    
    /* protected */ var localStore: LocalStore = js.native
    
    var remoteStore: RemoteStore = js.native
    
    /* protected */ var sharedClientState: SharedClientState = js.native
    
    var syncEngine: SyncEngine = js.native
    
    def terminate(): js.Promise[Unit] = js.native
  }
  
  trait ComponentConfiguration extends StObject {
    
    var appCheckCredentials: CredentialsProvider[String]
    
    var asyncQueue: AsyncQueue
    
    var authCredentials: CredentialsProvider[User]
    
    var clientId: ClientId
    
    var databaseInfo: DatabaseInfo
    
    var initialUser: User
    
    var maxConcurrentLimboResolutions: Double
  }
  object ComponentConfiguration {
    
    inline def apply(
      appCheckCredentials: CredentialsProvider[String],
      asyncQueue: AsyncQueue,
      authCredentials: CredentialsProvider[User],
      clientId: ClientId,
      databaseInfo: DatabaseInfo,
      initialUser: User,
      maxConcurrentLimboResolutions: Double
    ): ComponentConfiguration = {
      val __obj = js.Dynamic.literal(appCheckCredentials = appCheckCredentials.asInstanceOf[js.Any], asyncQueue = asyncQueue.asInstanceOf[js.Any], authCredentials = authCredentials.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], databaseInfo = databaseInfo.asInstanceOf[js.Any], initialUser = initialUser.asInstanceOf[js.Any], maxConcurrentLimboResolutions = maxConcurrentLimboResolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConfiguration]
    }
    
    extension [Self <: ComponentConfiguration](x: Self) {
      
      inline def setAppCheckCredentials(value: CredentialsProvider[String]): Self = StObject.set(x, "appCheckCredentials", value.asInstanceOf[js.Any])
      
      inline def setAsyncQueue(value: AsyncQueue): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
      
      inline def setAuthCredentials(value: CredentialsProvider[User]): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setDatabaseInfo(value: DatabaseInfo): Self = StObject.set(x, "databaseInfo", value.asInstanceOf[js.Any])
      
      inline def setInitialUser(value: User): Self = StObject.set(x, "initialUser", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentLimboResolutions(value: Double): Self = StObject.set(x, "maxConcurrentLimboResolutions", value.asInstanceOf[js.Any])
    }
  }
  
  trait OfflineComponentProvider extends StObject {
    
    var gcScheduler: Scheduler | Null
    
    var indexBackfillerScheduler: Scheduler | Null
    
    def initialize(cfg: ComponentConfiguration): js.Promise[Unit]
    
    var localStore: LocalStore
    
    var persistence: Persistence
    
    var sharedClientState: SharedClientState
    
    var synchronizeTabs: Boolean
    
    def terminate(): js.Promise[Unit]
  }
  object OfflineComponentProvider {
    
    inline def apply(
      initialize: ComponentConfiguration => js.Promise[Unit],
      localStore: LocalStore,
      persistence: Persistence,
      sharedClientState: SharedClientState,
      synchronizeTabs: Boolean,
      terminate: () => js.Promise[Unit]
    ): OfflineComponentProvider = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate), gcScheduler = null, indexBackfillerScheduler = null)
      __obj.asInstanceOf[OfflineComponentProvider]
    }
    
    extension [Self <: OfflineComponentProvider](x: Self) {
      
      inline def setGcScheduler(value: Scheduler): Self = StObject.set(x, "gcScheduler", value.asInstanceOf[js.Any])
      
      inline def setGcSchedulerNull: Self = StObject.set(x, "gcScheduler", null)
      
      inline def setIndexBackfillerScheduler(value: Scheduler): Self = StObject.set(x, "indexBackfillerScheduler", value.asInstanceOf[js.Any])
      
      inline def setIndexBackfillerSchedulerNull: Self = StObject.set(x, "indexBackfillerScheduler", null)
      
      inline def setInitialize(value: ComponentConfiguration => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setLocalStore(value: LocalStore): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
      
      inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setSharedClientState(value: SharedClientState): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
      
      inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    }
  }
}
