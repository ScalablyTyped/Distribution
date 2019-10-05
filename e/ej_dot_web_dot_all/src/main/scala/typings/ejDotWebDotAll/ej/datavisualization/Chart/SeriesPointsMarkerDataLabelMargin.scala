package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarkerDataLabelMargin extends js.Object {
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

object SeriesPointsMarkerDataLabelMargin {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): SeriesPointsMarkerDataLabelMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsMarkerDataLabelMargin]
  }
}

