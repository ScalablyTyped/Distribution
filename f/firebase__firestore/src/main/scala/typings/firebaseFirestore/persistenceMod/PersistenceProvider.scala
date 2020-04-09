package typings.firebaseFirestore.persistenceMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.platformMod.Platform
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceProvider extends js.Object {
  def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit]
  def getGarbageCollectionScheduler(): GarbageCollectionScheduler
  def getPersistence(): Persistence
  def getSharedClientState(): SharedClientState
  def initialize(
    asyncQueue: AsyncQueue,
    databaseInfo: DatabaseInfo,
    platform: Platform,
    clientId: ClientId,
    initialUser: User,
    settings: PersistenceSettings
  ): js.Promise[Unit]
}

object PersistenceProvider {
  @scala.inline
  def apply(
    clearPersistence: DatabaseInfo => js.Promise[Unit],
    getGarbageCollectionScheduler: () => GarbageCollectionScheduler,
    getPersistence: () => Persistence,
    getSharedClientState: () => SharedClientState,
    initialize: (AsyncQueue, DatabaseInfo, Platform, ClientId, User, PersistenceSettings) => js.Promise[Unit]
  ): PersistenceProvider = {
    val __obj = js.Dynamic.literal(clearPersistence = js.Any.fromFunction1(clearPersistence), getGarbageCollectionScheduler = js.Any.fromFunction0(getGarbageCollectionScheduler), getPersistence = js.Any.fromFunction0(getPersistence), getSharedClientState = js.Any.fromFunction0(getSharedClientState), initialize = js.Any.fromFunction6(initialize))
  
    __obj.asInstanceOf[PersistenceProvider]
  }
}

