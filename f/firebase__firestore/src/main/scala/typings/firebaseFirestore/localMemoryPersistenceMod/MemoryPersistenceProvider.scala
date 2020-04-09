package typings.firebaseFirestore.localMemoryPersistenceMod

import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.localPersistenceMod.GarbageCollectionScheduler
import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.localPersistenceMod.PersistenceProvider
import typings.firebaseFirestore.localSharedClientStateMod.ClientId
import typings.firebaseFirestore.localSharedClientStateMod.SharedClientState
import typings.firebaseFirestore.platformPlatformMod.Platform
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_persistence", "MemoryPersistenceProvider")
@js.native
class MemoryPersistenceProvider () extends PersistenceProvider {
  var clientId: js.Any = js.native
  def clearPersistence(): scala.Nothing = js.native
  /* CompleteClass */
  override def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def getGarbageCollectionScheduler(): GarbageCollectionScheduler = js.native
  /* CompleteClass */
  override def getPersistence(): Persistence = js.native
  /* CompleteClass */
  override def getSharedClientState(): SharedClientState = js.native
  /* CompleteClass */
  override def initialize(
    asyncQueue: AsyncQueue,
    databaseInfo: DatabaseInfo,
    platform: Platform,
    clientId: ClientId,
    initialUser: User,
    settings: PersistenceSettings
  ): js.Promise[Unit] = js.native
}

