package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAbi extends AbiDefinition {
  var anonymous: scala.Boolean
  var inputs: js.Array[EventParameter]
  var name: java.lang.String
  var `type`: AbiType
}

object EventAbi {
  @scala.inline
  def apply(
    anonymous: scala.Boolean,
    inputs: js.Array[EventParameter],
    name: java.lang.String,
    `type`: AbiType
  ): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, inputs = inputs, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventAbi]
  }
}

