package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsMajorGridLineStyle extends js.Object {
  /** Specifies the color of major grid lines in range navigator.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of major grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object NavigatorStyleSettingsMajorGridLineStyle {
  @scala.inline
  def apply(color: String = null, visible: js.UndefOr[Boolean] = js.undefined): NavigatorStyleSettingsMajorGridLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsMajorGridLineStyle]
  }
}

