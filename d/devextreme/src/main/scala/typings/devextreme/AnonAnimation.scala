package typings.devextreme

import typings.devextreme.mod.DevExpress.Device
import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: js.UndefOr[animationConfig] = js.undefined
  var device: js.UndefOr[Device] = js.undefined
}

object AnonAnimation {
  @scala.inline
  def apply(animation: animationConfig = null, device: Device = null): AnonAnimation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimation]
  }
}

