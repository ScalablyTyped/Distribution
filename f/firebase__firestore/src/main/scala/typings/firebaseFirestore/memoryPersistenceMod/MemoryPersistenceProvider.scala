package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.persistenceMod.GarbageCollectionScheduler
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.persistenceMod.PersistenceProvider
import typings.firebaseFirestore.platformMod.Platform
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_persistence", "MemoryPersistenceProvider")
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

