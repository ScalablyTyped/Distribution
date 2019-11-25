package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capacity extends js.Object {
  var capacity: Double
  var metadata: js.Any
  var owner: Anon_Id | String
  var `type`: String
}

object Anon_Capacity {
  @scala.inline
  def apply(capacity: Double, metadata: js.Any, owner: Anon_Id | String, `type`: String): Anon_Capacity = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Capacity]
  }
}

