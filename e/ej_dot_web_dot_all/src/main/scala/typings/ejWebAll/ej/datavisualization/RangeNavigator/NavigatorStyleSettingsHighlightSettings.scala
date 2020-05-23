package typings.ejWebAll.ej.datavisualization.RangeNavigator

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
    opacity: js.UndefOr[Double] = js.undefined
  ): NavigatorStyleSettingsHighlightSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettings]
  }
}

