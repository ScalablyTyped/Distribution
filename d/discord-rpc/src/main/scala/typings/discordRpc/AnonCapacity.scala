package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapacity extends js.Object {
  var capacity: Double
  var metadata: js.Any
  var owner: AnonId | String
  var `type`: String
}

object AnonCapacity {
  @scala.inline
  def apply(capacity: Double, metadata: js.Any, owner: AnonId | String, `type`: String): AnonCapacity = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapacity]
  }
}

