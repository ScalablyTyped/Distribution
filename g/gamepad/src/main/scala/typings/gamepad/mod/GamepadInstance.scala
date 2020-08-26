package typings.gamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadInstance extends js.Object {
  var axisStates: js.Array[Double] = js.native
  var buttonStates: js.Array[Boolean] = js.native
  var description: String = js.native
  var deviceID: Double = js.native
  var productID: Double = js.native
  var vendorID: Double = js.native
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
  @scala.inline
  implicit class GamepadInstanceOps[Self <: GamepadInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxisStatesVarargs(value: Double*): Self = this.set("axisStates", js.Array(value :_*))
    @scala.inline
    def setAxisStates(value: js.Array[Double]): Self = this.set("axisStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonStatesVarargs(value: Boolean*): Self = this.set("buttonStates", js.Array(value :_*))
    @scala.inline
    def setButtonStates(value: js.Array[Boolean]): Self = this.set("buttonStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceID(value: Double): Self = this.set("deviceID", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductID(value: Double): Self = this.set("productID", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorID(value: Double): Self = this.set("vendorID", value.asInstanceOf[js.Any])
  }
  
}

