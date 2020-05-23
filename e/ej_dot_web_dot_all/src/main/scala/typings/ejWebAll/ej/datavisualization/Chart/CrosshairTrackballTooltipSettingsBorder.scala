package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairTrackballTooltipSettingsBorder extends js.Object {
  /** Border color of the trackball tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the trackball tooltip.
    * @Default {null}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CrosshairTrackballTooltipSettingsBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): CrosshairTrackballTooltipSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairTrackballTooltipSettingsBorder]
  }
}

