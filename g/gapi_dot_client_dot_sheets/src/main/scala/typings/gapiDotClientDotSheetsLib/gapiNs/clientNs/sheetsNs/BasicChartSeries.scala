package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BasicChartSeries extends js.Object {
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.undefined
  /**
               * The minor axis that will specify the range of values for this series.
               * For example, if charting stocks over time, the "Volume" series
               * may want to be pinned to the right with the prices pinned to the left,
               * because the scale of trading volume is different than the scale of
               * prices.
               * It is an error to specify an axis that isn't a valid minor axis
               * for the chart's type.
               */
  var targetAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The type of this series. Valid only if the
               * chartType is
               * COMBO.
               * Different types will change the way the series is visualized.
               * Only LINE, AREA,
               * and COLUMN are supported.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

