package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSettingsBorder extends js.Object {
  /** Border color of the marker shape.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the opacity of the marker border.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Border width of the marker shape.
    * @Default {null}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MarkerSettingsBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): MarkerSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSettingsBorder]
  }
}

