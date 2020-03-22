package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonFill
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartLegendItem extends BaseLegendItem {
  /** The argument of the point(s) that the legend item represents. */
  var argument: js.UndefOr[String | Date | Double] = js.undefined
  /** The zero-based index of the legend item used to identify the item among other legend items with the same argument. */
  var argumentIndex: js.UndefOr[Double] = js.undefined
  /** An array of points that the legend item represents. Can contain more than one point only in a multi-series PieChart. */
  var points: js.UndefOr[js.Array[piePointObject]] = js.undefined
  /** The text that the legend item displays. */
  @JSName("text")
  var text_PieChartLegendItem: js.UndefOr[js.Any] = js.undefined
}

object PieChartLegendItem {
  @scala.inline
  def apply(
    argument: String | Date | Double = null,
    argumentIndex: Int | Double = null,
    marker: AnonFill = null,
    points: js.Array[piePointObject] = null,
    text: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PieChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (argumentIndex != null) __obj.updateDynamic("argumentIndex")(argumentIndex.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartLegendItem]
  }
}

