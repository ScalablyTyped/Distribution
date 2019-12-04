package typings.atFirebaseDatabase.distIndexDotNodeMod.atFirebaseAppDashTypesMod

import typings.atFirebaseDatabase.Anon_AppDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[Anon_AppDatabase] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: Anon_AppDatabase = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

