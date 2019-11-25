package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevicePixelRatio extends js.Object {
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var renderer: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_DevicePixelRatio {
  @scala.inline
  def apply(
    devicePixelRatio: Int | Double = null,
    height: Double | String = null,
    renderer: String = null,
    width: Double | String = null
  ): Anon_DevicePixelRatio = {
    val __obj = js.Dynamic.literal()
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DevicePixelRatio]
  }
}

