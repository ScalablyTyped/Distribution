package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Committed extends js.Object {
  var committed: scala.Boolean
  var snapshot: firebaseDashAdminLib.adminNs.databaseNs.DataSnapshot | scala.Null
}

object Anon_Committed {
  @scala.inline
  def apply(committed: scala.Boolean, snapshot: firebaseDashAdminLib.adminNs.databaseNs.DataSnapshot = null): Anon_Committed = {
    val __obj = js.Dynamic.literal(committed = committed)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    __obj.asInstanceOf[Anon_Committed]
  }
}

