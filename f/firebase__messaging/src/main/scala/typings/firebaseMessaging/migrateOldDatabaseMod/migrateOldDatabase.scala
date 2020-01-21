package typings.firebaseMessaging.migrateOldDatabaseMod

import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/helpers/migrate-old-database", "migrateOldDatabase")
@js.native
object migrateOldDatabase extends js.Object {
  def apply(senderId: String): js.Promise[TokenDetails | Null] = js.native
}

