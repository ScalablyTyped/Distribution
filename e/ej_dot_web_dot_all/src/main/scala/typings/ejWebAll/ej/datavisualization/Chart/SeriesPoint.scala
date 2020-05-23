package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPoint extends js.Object {
  /** Options for customizing the border of a point. This is applicable only for column type series and accumulation type series.
    */
  var border: js.UndefOr[SeriesPointsBorder] = js.undefined
  /** Close value of the point. Close value is applicable only for financial type series.
    * @Default {null}
    */
  var close: js.UndefOr[Double] = js.undefined
  /** Background color of the point. This is applicable only for column type series and accumulation type series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** High value of the point. High value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var high: js.UndefOr[Double] = js.undefined
  /** Low value of the point. Low value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var low: js.UndefOr[Double] = js.undefined
  /** Options for displaying and customizing marker for a data point. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[SeriesPointsMarker] = js.undefined
  /** Open value of the point. This is applicable only for financial type series.
    * @Default {null}
    */
  var open: js.UndefOr[Double] = js.undefined
  /** To show/hide the intermediate summary from the last intermediate point.
    * @Default {false}
    */
  var showIntermediateSum: js.UndefOr[Boolean] = js.undefined
  /** To show/hide the total summary of the waterfall series.
    * @Default {false}
    */
  var showTotalSum: js.UndefOr[Boolean] = js.undefined
  /** Size of a bubble in the bubble series. This is applicable only for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Datalabel text for the point.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.undefined
  /** X value of the point.
    * @Default {null}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Y value of the point.
    * @Default {null}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesPoint {
  @scala.inline
  def apply(
    border: SeriesPointsBorder = null,
    close: js.UndefOr[Double] = js.undefined,
    fill: String = null,
    high: js.UndefOr[Double] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    marker: SeriesPointsMarker = null,
    open: js.UndefOr[Double] = js.undefined,
    showIntermediateSum: js.UndefOr[Boolean] = js.undefined,
    showTotalSum: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    text: String = null,
    visibleOnLegend: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): SeriesPoint = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIntermediateSum)) __obj.updateDynamic("showIntermediateSum")(showIntermediateSum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotalSum)) __obj.updateDynamic("showTotalSum")(showTotalSum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (visibleOnLegend != null) __obj.updateDynamic("visibleOnLegend")(visibleOnLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPoint]
  }
}

