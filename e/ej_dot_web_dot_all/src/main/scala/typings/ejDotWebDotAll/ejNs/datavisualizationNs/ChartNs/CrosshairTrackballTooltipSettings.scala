package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
    opacity: Int | Double = null,
    rx: Int | Double = null,
    ry: Int | Double = null
  ): CrosshairTrackballTooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
  }
}

