package typings.gamepad.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadInstance extends js.Object {
  var axisStates: js.Array[Double]
  var buttonStates: js.Array[Boolean]
  var description: String
  var deviceID: Double
  var productID: Double
  var vendorID: Double
}

object GamepadInstance {
  @scala.inline
  def apply(
    axisStates: js.Array[Double],
    buttonStates: js.Array[Boolean],
    description: String,
    deviceID: Double,
    productID: Double,
    vendorID: Double
  ): GamepadInstance = {
    val __obj = js.Dynamic.literal(axisStates = axisStates.asInstanceOf[js.Any], buttonStates = buttonStates.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceID = deviceID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], vendorID = vendorID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GamepadInstance]
  }
}

