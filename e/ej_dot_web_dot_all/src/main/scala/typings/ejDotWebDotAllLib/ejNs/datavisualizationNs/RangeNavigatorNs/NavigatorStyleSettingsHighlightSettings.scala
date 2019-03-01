package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsHighlightSettings extends js.Object {
  /** Contains the border properties for highlighting rectangle.
    */
  var border: js.UndefOr[NavigatorStyleSettingsHighlightSettingsBorder] = js.undefined
  /** To set the color to the highlight.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Enable the highlight settings in range navigator.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** To set the opacity to the highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object NavigatorStyleSettingsHighlightSettings {
  @scala.inline
  def apply(
    border: NavigatorStyleSettingsHighlightSettingsBorder = null,
    color: java.lang.String = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null
  ): NavigatorStyleSettingsHighlightSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettings]
  }
}

