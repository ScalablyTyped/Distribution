package typings.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod

import typings.firebaseDatabase.AnonDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[AnonDatabase] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: AnonDatabase = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

