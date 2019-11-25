package typings.atFirebaseDatabase.atFirebaseDatabaseMod.atFirebaseAppDashTypesMod

import typings.atFirebaseDatabase.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

