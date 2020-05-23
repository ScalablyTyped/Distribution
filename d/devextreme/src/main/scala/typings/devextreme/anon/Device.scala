package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var device: js.UndefOr[
    typings.devextreme.mod.DevExpress.Device | js.Array[typings.devextreme.mod.DevExpress.Device] | js.Function
  ] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    device: typings.devextreme.mod.DevExpress.Device | js.Array[typings.devextreme.mod.DevExpress.Device] | js.Function = null,
    options: js.Any = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

