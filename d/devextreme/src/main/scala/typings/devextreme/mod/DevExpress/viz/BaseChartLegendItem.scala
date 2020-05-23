package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChartLegendItem extends BaseLegendItem {
  /** @name BaseChartLegendItem.series */
  var series: js.UndefOr[baseSeriesObject] = js.undefined
}

object BaseChartLegendItem {
  @scala.inline
  def apply(
    marker: Fill = null,
    series: baseSeriesObject = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BaseChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartLegendItem]
  }
}

