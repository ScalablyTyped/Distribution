package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeaderEntry extends js.Object {
  /** The name of the dimensions in the pivot response. */
  var dimensionNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The values for the dimensions in the pivot. */
  var dimensionValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The metric header for the metric in the pivot. */
  var metric: js.UndefOr[MetricHeaderEntry] = js.undefined
}

