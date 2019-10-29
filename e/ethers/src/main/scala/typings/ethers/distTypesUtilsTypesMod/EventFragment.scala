package typings.ethers.distTypesUtilsTypesMod

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
    val __obj = js.Dynamic.literal(anonymous = anonymous, inputs = inputs, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventFragment]
  }
}

