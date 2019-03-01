package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capacity extends js.Object {
  var capacity: scala.Double
  var metadata: js.Any
  var owner: Anon_Id | java.lang.String
  var `type`: java.lang.String
}

object Anon_Capacity {
  @scala.inline
  def apply(
    capacity: scala.Double,
    metadata: js.Any,
    owner: Anon_Id | java.lang.String,
    `type`: java.lang.String
  ): Anon_Capacity = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("capacity")(capacity)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Capacity]
  }
}

