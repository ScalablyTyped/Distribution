package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HistogramChartSpec extends js.Object {
  /**
               * By default the bucket size (the range of values stacked in a single
               * column) is chosen automatically, but it may be overridden here.
               * E.g., A bucket size of 1.5 results in buckets from 0 - 1.5, 1.5 - 3.0, etc.
               * Cannot be negative.
               * This field is optional.
               */
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The outlier percentile is used to ensure that outliers do not adversely
               * affect the calculation of bucket sizes.  For example, setting an outlier
               * percentile of 0.05 indicates that the top and bottom 5% of values when
               * calculating buckets.  The values are still included in the chart, they will
               * be added to the first or last buckets instead of their own buckets.
               * Must be between 0.0 and 0.5.
               */
  var outlierPercentile: js.UndefOr[scala.Double] = js.undefined
  /**
               * The series for a histogram may be either a single series of values to be
               * bucketed or multiple series, each of the same length, containing the name
               * of the series followed by the values to be bucketed for that series.
               */
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.undefined
  /**
               * Whether horizontal divider lines should be displayed between items in each
               * column.
               */
  var showItemDividers: js.UndefOr[scala.Boolean] = js.undefined
}

