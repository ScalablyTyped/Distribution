package typings.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod

import typings.firebaseDatabase.anon.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var database: js.UndefOr[Database] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(database: Database = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

