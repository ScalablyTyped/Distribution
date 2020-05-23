package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsBorder extends js.Object {
  /** Specifies the border color of range navigator.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the dash array of range navigator.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Specifies the border width of range navigator.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NavigatorStyleSettingsBorder {
  @scala.inline
  def apply(color: String = null, dashArray: String = null, width: js.UndefOr[Double] = js.undefined): NavigatorStyleSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsBorder]
  }
}

