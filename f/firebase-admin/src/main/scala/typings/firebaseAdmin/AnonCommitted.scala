package typings.firebaseAdmin

import typings.firebaseAdmin.admin.database.DataSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitted extends js.Object {
  var committed: Boolean
  var snapshot: DataSnapshot | Null
}

object AnonCommitted {
  @scala.inline
  def apply(committed: Boolean, snapshot: DataSnapshot = null): AnonCommitted = {
    val __obj = js.Dynamic.literal(committed = committed.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommitted]
  }
}

