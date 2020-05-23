package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePixelRatio extends js.Object {
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var renderer: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object DevicePixelRatio {
  @scala.inline
  def apply(
    devicePixelRatio: js.UndefOr[Double] = js.undefined,
    height: Double | String = null,
    renderer: String = null,
    width: Double | String = null
  ): DevicePixelRatio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(devicePixelRatio)) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePixelRatio]
  }
}

