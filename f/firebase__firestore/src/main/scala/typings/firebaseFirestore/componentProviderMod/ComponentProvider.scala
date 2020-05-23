package typings.firebaseFirestore.componentProviderMod

import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.eventManagerMod.EventManager
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.persistenceMod.GarbageCollectionScheduler
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.remoteStoreMod.RemoteStore
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.syncEngineMod.SyncEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProvider extends js.Object {
  var eventManager: EventManager
  var gcScheduler: GarbageCollectionScheduler | Null
  var localStore: LocalStore
  var persistence: Persistence
  var remoteStore: RemoteStore
  var sharedClientState: SharedClientState
  var syncEngine: SyncEngine
  def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit]
  def initialize(cfg: ComponentConfiguration): js.Promise[Unit]
}

object ComponentProvider {
  @scala.inline
  def apply(
    clearPersistence: DatabaseInfo => js.Promise[Unit],
    eventManager: EventManager,
    initialize: ComponentConfiguration => js.Promise[Unit],
    localStore: LocalStore,
    persistence: Persistence,
    remoteStore: RemoteStore,
    sharedClientState: SharedClientState,
    syncEngine: SyncEngine,
    gcScheduler: GarbageCollectionScheduler = null
  ): ComponentProvider = {
    val __obj = js.Dynamic.literal(clearPersistence = js.Any.fromFunction1(clearPersistence), eventManager = eventManager.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], remoteStore = remoteStore.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], syncEngine = syncEngine.asInstanceOf[js.Any], gcScheduler = gcScheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProvider]
  }
}

