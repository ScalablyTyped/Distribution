package typings.firebaseFirestore

import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreTypesMod.OnlineState
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localLocalStoreMod.LocalStore
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.remoteDatastoreMod.Datastore
import typings.firebaseFirestore.remoteRemoteSyncerMod.RemoteSyncer
import typings.firebaseFirestore.srcRemoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteRemoteStoreMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/remote_store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canUseNetwork(remoteStore: RemoteStore): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNetwork")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fillWritePipeline(remoteStore: RemoteStore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fillWritePipeline")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def newRemoteStore(
    localStore: LocalStore,
    datastore: Datastore,
    asyncQueue: AsyncQueue,
    onlineStateHandler: js.Function1[/* onlineState */ OnlineState, Unit],
    connectivityMonitor: ConnectivityMonitor
  ): RemoteStore = (^.asInstanceOf[js.Dynamic].applyDynamic("newRemoteStore")(localStore.asInstanceOf[js.Any], datastore.asInstanceOf[js.Any], asyncQueue.asInstanceOf[js.Any], onlineStateHandler.asInstanceOf[js.Any], connectivityMonitor.asInstanceOf[js.Any])).asInstanceOf[RemoteStore]
  
  inline def outstandingWrites(remoteStore: RemoteStore): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outstandingWrites")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def remoteStoreApplyPrimaryState(remoteStore: RemoteStore, isPrimary: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreApplyPrimaryState")(remoteStore.asInstanceOf[js.Any], isPrimary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def remoteStoreDisableNetwork(remoteStore: RemoteStore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreDisableNetwork")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def remoteStoreEnableNetwork(remoteStore: RemoteStore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreEnableNetwork")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def remoteStoreHandleCredentialChange(remoteStore: RemoteStore, user: User): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreHandleCredentialChange")(remoteStore.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def remoteStoreListen(remoteStore: RemoteStore, targetData: TargetData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreListen")(remoteStore.asInstanceOf[js.Any], targetData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remoteStoreShutdown(remoteStore: RemoteStore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreShutdown")(remoteStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def remoteStoreUnlisten(remoteStore: RemoteStore, targetId: TargetId): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStoreUnlisten")(remoteStore.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait RemoteStore extends StObject {
    
    /**
      * SyncEngine to notify of watch and write events. This must be set
      * immediately after construction.
      */
    var remoteSyncer: RemoteSyncer
  }
  object RemoteStore {
    
    inline def apply(remoteSyncer: RemoteSyncer): RemoteStore = {
      val __obj = js.Dynamic.literal(remoteSyncer = remoteSyncer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteStore]
    }
    
    extension [Self <: RemoteStore](x: Self) {
      
      inline def setRemoteSyncer(value: RemoteSyncer): Self = StObject.set(x, "remoteSyncer", value.asInstanceOf[js.Any])
    }
  }
}
