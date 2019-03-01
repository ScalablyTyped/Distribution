package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerDataLabelMargin extends js.Object {
  /** Bottom margin of the text.
    * @Default {5}
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /** Left margin of the text.
    * @Default {5}
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Right margin of the text.
    * @Default {5}
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /** Top margin of the text.
    * @Default {5}
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsMarkerDataLabelMargin {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): CommonSeriesOptionsMarkerDataLabelMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelMargin]
  }
}

