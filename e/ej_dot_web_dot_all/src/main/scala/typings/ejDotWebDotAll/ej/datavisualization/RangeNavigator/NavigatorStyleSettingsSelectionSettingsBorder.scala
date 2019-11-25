package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsSelectionSettingsBorder extends js.Object {
  /** To set the border color to the selection.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** To set the border width to the selection.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NavigatorStyleSettingsSelectionSettingsBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): NavigatorStyleSettingsSelectionSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsSelectionSettingsBorder]
  }
}

