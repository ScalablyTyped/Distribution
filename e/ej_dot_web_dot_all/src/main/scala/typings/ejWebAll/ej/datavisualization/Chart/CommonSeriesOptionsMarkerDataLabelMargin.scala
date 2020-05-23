package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerDataLabelMargin extends js.Object {
  /** Bottom margin of the text.
    * @Default {5}
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Left margin of the text.
    * @Default {5}
    */
  var left: js.UndefOr[Double] = js.undefined
  /** Right margin of the text.
    * @Default {5}
    */
  var right: js.UndefOr[Double] = js.undefined
  /** Top margin of the text.
    * @Default {5}
    */
  var top: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsMarkerDataLabelMargin {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): CommonSeriesOptionsMarkerDataLabelMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelMargin]
  }
}

