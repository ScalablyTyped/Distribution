package typings
package atFirebaseDatabaseLib.atFirebaseDatabaseMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[atFirebaseDatabaseLib.Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: atFirebaseDatabaseLib.Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

