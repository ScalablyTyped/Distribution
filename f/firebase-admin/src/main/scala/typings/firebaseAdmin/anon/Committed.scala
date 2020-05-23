package typings.firebaseAdmin.anon

import typings.firebaseAdmin.admin.database.DataSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Committed extends js.Object {
  var committed: Boolean
  var snapshot: DataSnapshot | Null
}

object Committed {
  @scala.inline
  def apply(committed: Boolean, snapshot: DataSnapshot = null): Committed = {
    val __obj = js.Dynamic.literal(committed = committed.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Committed]
  }
}

