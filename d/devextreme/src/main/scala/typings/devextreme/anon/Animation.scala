package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: js.UndefOr[animationConfig] = js.undefined
  var device: js.UndefOr[typings.devextreme.mod.DevExpress.Device] = js.undefined
}

object Animation {
  @scala.inline
  def apply(animation: animationConfig = null, device: typings.devextreme.mod.DevExpress.Device = null): Animation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

