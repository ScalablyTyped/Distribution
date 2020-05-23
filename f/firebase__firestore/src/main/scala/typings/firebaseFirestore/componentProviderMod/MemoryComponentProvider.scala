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

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "MemoryComponentProvider")
@js.native
class MemoryComponentProvider () extends ComponentProvider {
  /* CompleteClass */
  override var eventManager: EventManager = js.native
  /* CompleteClass */
  override var gcScheduler: GarbageCollectionScheduler | Null = js.native
  /* CompleteClass */
  override var localStore: LocalStore = js.native
  /* CompleteClass */
  override var persistence: Persistence = js.native
  /* CompleteClass */
  override var remoteStore: RemoteStore = js.native
  /* CompleteClass */
  override var sharedClientState: SharedClientState = js.native
  /* CompleteClass */
  override var syncEngine: SyncEngine = js.native
  /* CompleteClass */
  override def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit] = js.native
  def createEventManager(cfg: ComponentConfiguration): EventManager = js.native
  def createGarbageCollectionScheduler(cfg: ComponentConfiguration): GarbageCollectionScheduler | Null = js.native
  def createLocalStore(cfg: ComponentConfiguration): LocalStore = js.native
  def createPersistence(cfg: ComponentConfiguration): Persistence = js.native
  def createRemoteStore(cfg: ComponentConfiguration): RemoteStore = js.native
  def createSharedClientState(cfg: ComponentConfiguration): SharedClientState = js.native
  def createSyncEngine(cfg: ComponentConfiguration): SyncEngine = js.native
  /* CompleteClass */
  override def initialize(cfg: ComponentConfiguration): js.Promise[Unit] = js.native
}

