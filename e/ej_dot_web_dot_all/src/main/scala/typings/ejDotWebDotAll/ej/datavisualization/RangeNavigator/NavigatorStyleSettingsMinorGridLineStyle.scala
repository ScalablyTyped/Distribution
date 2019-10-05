package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsMinorGridLineStyle extends js.Object {
  /** Specifies the color of minor grid lines in range navigator.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of minor grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object NavigatorStyleSettingsMinorGridLineStyle {
  @scala.inline
  def apply(color: String = null, visible: js.UndefOr[Boolean] = js.undefined): NavigatorStyleSettingsMinorGridLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[NavigatorStyleSettingsMinorGridLineStyle]
  }
}

