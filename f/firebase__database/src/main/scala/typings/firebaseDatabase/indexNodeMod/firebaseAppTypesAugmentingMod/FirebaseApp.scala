package typings.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod

import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var database: js.UndefOr[js.Function0[FirebaseDatabase]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(database: () => FirebaseDatabase = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(js.Any.fromFunction0(database))
    __obj.asInstanceOf[FirebaseApp]
  }
}

