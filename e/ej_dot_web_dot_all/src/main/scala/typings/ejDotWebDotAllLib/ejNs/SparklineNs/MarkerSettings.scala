package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSettings extends js.Object {
  /** Options for customizing the border of the marker shape.
    */
  var border: js.UndefOr[MarkerSettingsBorder] = js.undefined
  /** Color of the marker shape.
    * @Default {white}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** width of the marker shape.
    * @Default {2}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MarkerSettings {
  @scala.inline
  def apply(
    border: MarkerSettingsBorder = null,
    fill: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): MarkerSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSettings]
  }
}

