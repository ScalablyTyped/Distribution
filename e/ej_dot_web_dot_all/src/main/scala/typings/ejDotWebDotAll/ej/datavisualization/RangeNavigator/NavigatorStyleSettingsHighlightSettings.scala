package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

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
  var color: js.UndefOr[String] = js.undefined
  /** Enable the highlight settings in range navigator.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** To set the opacity to the highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object NavigatorStyleSettingsHighlightSettings {
  @scala.inline
  def apply(
    border: NavigatorStyleSettingsHighlightSettingsBorder = null,
    color: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null
  ): NavigatorStyleSettingsHighlightSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettings]
  }
}

