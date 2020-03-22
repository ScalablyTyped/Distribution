package typings.devextreme

import typings.devextreme.mod.DevExpress.Device
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDevice extends js.Object {
  var device: js.UndefOr[Device | js.Array[Device] | js.Function] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object AnonDevice {
  @scala.inline
  def apply(device: Device | js.Array[Device] | js.Function = null, options: js.Any = null): AnonDevice = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDevice]
  }
}

