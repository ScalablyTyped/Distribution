package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsHighlightSettingsBorder extends js.Object {
  /** To set the border color to the highlight.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** To set the border width to the highlight.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NavigatorStyleSettingsHighlightSettingsBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): NavigatorStyleSettingsHighlightSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettingsBorder]
  }
}

