package typings.firebaseFirestore.apiDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDatabase extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var projectId: String
}

object FirestoreDatabase {
  @scala.inline
  def apply(projectId: String, database: String = null): FirestoreDatabase = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirestoreDatabase]
  }
}

