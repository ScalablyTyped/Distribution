package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartSeriesTypes extends js.Object {
  /** An object that defines configuration options for chart series. */
  var CommonPieChartSeries: js.UndefOr[dxPieChartSeriesTypesCommonPieChartSeries] = js.undefined
  /** An object defining a series of the doughnut type. */
  var DoughnutSeries: js.UndefOr[js.Any] = js.undefined
  /** An object defining a series of the pie type. */
  var PieSeries: js.UndefOr[js.Any] = js.undefined
}

object dxPieChartSeriesTypes {
  @scala.inline
  def apply(
    CommonPieChartSeries: dxPieChartSeriesTypesCommonPieChartSeries = null,
    DoughnutSeries: js.Any = null,
    PieSeries: js.Any = null
  ): dxPieChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    if (CommonPieChartSeries != null) __obj.updateDynamic("CommonPieChartSeries")(CommonPieChartSeries.asInstanceOf[js.Any])
    if (DoughnutSeries != null) __obj.updateDynamic("DoughnutSeries")(DoughnutSeries.asInstanceOf[js.Any])
    if (PieSeries != null) __obj.updateDynamic("PieSeries")(PieSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartSeriesTypes]
  }
}

