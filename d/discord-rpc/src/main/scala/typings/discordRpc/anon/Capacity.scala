package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capacity extends js.Object {
  var capacity: Double
  var metadata: js.Any
  var owner: Id | String
  var `type`: String
}

object Capacity {
  @scala.inline
  def apply(capacity: Double, metadata: js.Any, owner: Id | String, `type`: String): Capacity = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
}

