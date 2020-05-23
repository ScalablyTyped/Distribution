package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairTrackballTooltipSettings extends js.Object {
  /** Options for customizing the trackball tooltip border.
    */
  var border: js.UndefOr[CrosshairTrackballTooltipSettingsBorder] = js.undefined
  /** Background color of the trackball tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Specifies the mode of the trackball tooltip.
    * @Default {float. See CrosshairMode}
    */
  var mode: js.UndefOr[CrosshairMode | String] = js.undefined
  /** Opacity value of the trackball tooltip.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Rounded corner x value of the trackball tooltip.
    * @Default {3}
    */
  var rx: js.UndefOr[Double] = js.undefined
  /** Rounded corner y value of the trackball tooltip.
    * @Default {3}
    */
  var ry: js.UndefOr[Double] = js.undefined
}

object CrosshairTrackballTooltipSettings {
  @scala.inline
  def apply(
    border: CrosshairTrackballTooltipSettingsBorder = null,
    fill: String = null,
    mode: CrosshairMode | String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined
  ): CrosshairTrackballTooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
  }
}

