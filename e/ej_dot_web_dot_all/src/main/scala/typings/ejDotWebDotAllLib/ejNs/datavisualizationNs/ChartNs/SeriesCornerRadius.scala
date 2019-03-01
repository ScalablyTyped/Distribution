package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesCornerRadius extends js.Object {
  /** Specifies the radius for the bottom left corner.
    * @Default {0}
    */
  var bottomLeft: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the radius for the bottom right corner.
    * @Default {0}
    */
  var bottomRight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the radius for the top left corner.
    * @Default {0}
    */
  var topLeft: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the radius for the top right corner.
    * @Default {0}
    */
  var topRight: js.UndefOr[scala.Double] = js.undefined
}

object SeriesCornerRadius {
  @scala.inline
  def apply(
    bottomLeft: scala.Int | scala.Double = null,
    bottomRight: scala.Int | scala.Double = null,
    topLeft: scala.Int | scala.Double = null,
    topRight: scala.Int | scala.Double = null
  ): SeriesCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCornerRadius]
  }
}

