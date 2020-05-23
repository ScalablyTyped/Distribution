package typings.firebaseDatabase.mod.firebaseAppTypesAugmentingMod

import typings.firebaseDatabase.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[Call] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: Call = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

