package typings.firebaseFirestore.componentProviderMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.datastoreMod.Datastore
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfiguration extends js.Object {
  var asyncQueue: AsyncQueue
  var clientId: ClientId
  var databaseInfo: DatabaseInfo
  var datastore: Datastore
  var initialUser: User
  var maxConcurrentLimboResolutions: Double
  var persistenceSettings: PersistenceSettings
}

object ComponentConfiguration {
  @scala.inline
  def apply(
    asyncQueue: AsyncQueue,
    clientId: ClientId,
    databaseInfo: DatabaseInfo,
    datastore: Datastore,
    initialUser: User,
    maxConcurrentLimboResolutions: Double,
    persistenceSettings: PersistenceSettings
  ): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(asyncQueue = asyncQueue.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], databaseInfo = databaseInfo.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], initialUser = initialUser.asInstanceOf[js.Any], maxConcurrentLimboResolutions = maxConcurrentLimboResolutions.asInstanceOf[js.Any], persistenceSettings = persistenceSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
}

