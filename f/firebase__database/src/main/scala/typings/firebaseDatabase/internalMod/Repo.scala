package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A connection to a single data repository.
  */
trait Repo extends StObject {
  
  var appCheckProvider_ : AppCheckTokenProvider
  
  var authTokenProvider_ : AuthTokenProvider
  
  var dataUpdateCount: Double
  
  var eventQueue_ : EventQueue
  
  var forceRestClient_ : Boolean
  
  var infoData_ : SnapshotHolder
  
  var infoSyncTree_ : SyncTree
  
  var interceptServerDataCallback_ : (js.Function2[/* a */ String, /* b */ Any, Unit]) | Null
  
  /** Key for uniquely identifying this repo, used in RepoManager */
  val key: String
  
  var nextWriteId_ : Double
  
  /** A list of data pieces and paths to be set when this client disconnects. */
  var onDisconnect_ : SparseSnapshotTree
  
  var persistentConnection_ : PersistentConnection | Null
  
  var repoInfo_ : RepoInfo
  
  var serverSyncTree_ : SyncTree
  
  var server_ : ServerActions
  
  var statsListener_ : StatsListener | Null
  
  var statsReporter_ : StatsReporter
  
  var stats_ : StatsCollection
  
  /** Stores queues of outstanding transactions for Firebase locations. */
  var transactionQueueTree_ : Tree[js.Array[Transaction]]
}
object Repo {
  
  inline def apply(
    appCheckProvider_ : AppCheckTokenProvider,
    authTokenProvider_ : AuthTokenProvider,
    dataUpdateCount: Double,
    eventQueue_ : EventQueue,
    forceRestClient_ : Boolean,
    infoData_ : SnapshotHolder,
    infoSyncTree_ : SyncTree,
    key: String,
    nextWriteId_ : Double,
    onDisconnect_ : SparseSnapshotTree,
    repoInfo_ : RepoInfo,
    serverSyncTree_ : SyncTree,
    server_ : ServerActions,
    statsReporter_ : StatsReporter,
    stats_ : StatsCollection,
    transactionQueueTree_ : Tree[js.Array[Transaction]]
  ): Repo = {
    val __obj = js.Dynamic.literal(appCheckProvider_ = appCheckProvider_.asInstanceOf[js.Any], authTokenProvider_ = authTokenProvider_.asInstanceOf[js.Any], dataUpdateCount = dataUpdateCount.asInstanceOf[js.Any], eventQueue_ = eventQueue_.asInstanceOf[js.Any], forceRestClient_ = forceRestClient_.asInstanceOf[js.Any], infoData_ = infoData_.asInstanceOf[js.Any], infoSyncTree_ = infoSyncTree_.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextWriteId_ = nextWriteId_.asInstanceOf[js.Any], onDisconnect_ = onDisconnect_.asInstanceOf[js.Any], repoInfo_ = repoInfo_.asInstanceOf[js.Any], serverSyncTree_ = serverSyncTree_.asInstanceOf[js.Any], server_ = server_.asInstanceOf[js.Any], statsReporter_ = statsReporter_.asInstanceOf[js.Any], stats_ = stats_.asInstanceOf[js.Any], transactionQueueTree_ = transactionQueueTree_.asInstanceOf[js.Any], interceptServerDataCallback_ = null, persistentConnection_ = null, statsListener_ = null)
    __obj.asInstanceOf[Repo]
  }
  
  extension [Self <: Repo](x: Self) {
    
    inline def setAppCheckProvider_(value: AppCheckTokenProvider): Self = StObject.set(x, "appCheckProvider_", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenProvider_(value: AuthTokenProvider): Self = StObject.set(x, "authTokenProvider_", value.asInstanceOf[js.Any])
    
    inline def setDataUpdateCount(value: Double): Self = StObject.set(x, "dataUpdateCount", value.asInstanceOf[js.Any])
    
    inline def setEventQueue_(value: EventQueue): Self = StObject.set(x, "eventQueue_", value.asInstanceOf[js.Any])
    
    inline def setForceRestClient_(value: Boolean): Self = StObject.set(x, "forceRestClient_", value.asInstanceOf[js.Any])
    
    inline def setInfoData_(value: SnapshotHolder): Self = StObject.set(x, "infoData_", value.asInstanceOf[js.Any])
    
    inline def setInfoSyncTree_(value: SyncTree): Self = StObject.set(x, "infoSyncTree_", value.asInstanceOf[js.Any])
    
    inline def setInterceptServerDataCallback_(value: (/* a */ String, /* b */ Any) => Unit): Self = StObject.set(x, "interceptServerDataCallback_", js.Any.fromFunction2(value))
    
    inline def setInterceptServerDataCallback_Null: Self = StObject.set(x, "interceptServerDataCallback_", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNextWriteId_(value: Double): Self = StObject.set(x, "nextWriteId_", value.asInstanceOf[js.Any])
    
    inline def setOnDisconnect_(value: SparseSnapshotTree): Self = StObject.set(x, "onDisconnect_", value.asInstanceOf[js.Any])
    
    inline def setPersistentConnection_(value: PersistentConnection): Self = StObject.set(x, "persistentConnection_", value.asInstanceOf[js.Any])
    
    inline def setPersistentConnection_Null: Self = StObject.set(x, "persistentConnection_", null)
    
    inline def setRepoInfo_(value: RepoInfo): Self = StObject.set(x, "repoInfo_", value.asInstanceOf[js.Any])
    
    inline def setServerSyncTree_(value: SyncTree): Self = StObject.set(x, "serverSyncTree_", value.asInstanceOf[js.Any])
    
    inline def setServer_(value: ServerActions): Self = StObject.set(x, "server_", value.asInstanceOf[js.Any])
    
    inline def setStatsListener_(value: StatsListener): Self = StObject.set(x, "statsListener_", value.asInstanceOf[js.Any])
    
    inline def setStatsListener_Null: Self = StObject.set(x, "statsListener_", null)
    
    inline def setStatsReporter_(value: StatsReporter): Self = StObject.set(x, "statsReporter_", value.asInstanceOf[js.Any])
    
    inline def setStats_(value: StatsCollection): Self = StObject.set(x, "stats_", value.asInstanceOf[js.Any])
    
    inline def setTransactionQueueTree_(value: Tree[js.Array[Transaction]]): Self = StObject.set(x, "transactionQueueTree_", value.asInstanceOf[js.Any])
  }
}
