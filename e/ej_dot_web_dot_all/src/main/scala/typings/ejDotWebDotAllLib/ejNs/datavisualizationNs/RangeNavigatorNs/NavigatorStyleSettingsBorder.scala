package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsBorder extends js.Object {
  /** Specifies the border color of range navigator.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dash array of range navigator.
    * @Default {null}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border width of range navigator.
    * @Default {0.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NavigatorStyleSettingsBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashArray: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): NavigatorStyleSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsBorder]
  }
}

