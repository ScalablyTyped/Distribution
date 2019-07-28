package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAbi extends AbiDefinition {
  var anonymous: Boolean
  var inputs: js.Array[EventParameter]
  var name: String
  var `type`: Event
}

object EventAbi {
  @scala.inline
  def apply(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, inputs = inputs, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventAbi]
  }
}

