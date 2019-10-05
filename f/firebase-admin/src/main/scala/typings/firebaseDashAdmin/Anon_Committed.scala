package typings.firebaseDashAdmin

import typings.firebaseDashAdmin.admin.database.DataSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Committed extends js.Object {
  var committed: Boolean
  var snapshot: DataSnapshot | Null
}

object Anon_Committed {
  @scala.inline
  def apply(committed: Boolean, snapshot: DataSnapshot = null): Anon_Committed = {
    val __obj = js.Dynamic.literal(committed = committed)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    __obj.asInstanceOf[Anon_Committed]
  }
}

