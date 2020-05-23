package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartLegendItem extends BaseLegendItem {
  /** @name PieChartLegendItem.argument */
  var argument: js.UndefOr[String | Date | Double] = js.undefined
  /** @name PieChartLegendItem.argumentIndex */
  var argumentIndex: js.UndefOr[Double] = js.undefined
  /** @name PieChartLegendItem.points */
  var points: js.UndefOr[js.Array[piePointObject]] = js.undefined
  /** @name PieChartLegendItem.text */
  @JSName("text")
  var text_PieChartLegendItem: js.UndefOr[js.Any] = js.undefined
}

object PieChartLegendItem {
  @scala.inline
  def apply(
    argument: String | Date | Double = null,
    argumentIndex: js.UndefOr[Double] = js.undefined,
    marker: Fill = null,
    points: js.Array[piePointObject] = null,
    text: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PieChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (!js.isUndefined(argumentIndex)) __obj.updateDynamic("argumentIndex")(argumentIndex.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartLegendItem]
  }
}

