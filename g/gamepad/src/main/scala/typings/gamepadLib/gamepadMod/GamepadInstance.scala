package typings
package gamepadLib.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadInstance extends js.Object {
  var axisStates: js.Array[scala.Double]
  var buttonStates: js.Array[scala.Boolean]
  var description: java.lang.String
  var deviceID: scala.Double
  var productID: scala.Double
  var vendorID: scala.Double
}

object GamepadInstance {
  @scala.inline
  def apply(
    axisStates: js.Array[scala.Double],
    buttonStates: js.Array[scala.Boolean],
    description: java.lang.String,
    deviceID: scala.Double,
    productID: scala.Double,
    vendorID: scala.Double
  ): GamepadInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisStates")(axisStates)
    __obj.updateDynamic("buttonStates")(buttonStates)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("deviceID")(deviceID)
    __obj.updateDynamic("productID")(productID)
    __obj.updateDynamic("vendorID")(vendorID)
    __obj.asInstanceOf[GamepadInstance]
  }
}

