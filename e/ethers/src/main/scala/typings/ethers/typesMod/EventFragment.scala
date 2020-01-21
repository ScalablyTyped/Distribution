package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventFragment extends js.Object {
  var anonymous: Boolean
  var inputs: js.Array[ParamType]
  var name: String
  var `type`: String
}

object EventFragment {
  @scala.inline
  def apply(anonymous: Boolean, inputs: js.Array[ParamType], name: String, `type`: String): EventFragment = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFragment]
  }
}

