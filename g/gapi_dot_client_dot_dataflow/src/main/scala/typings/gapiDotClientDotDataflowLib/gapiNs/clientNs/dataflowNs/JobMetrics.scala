package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobMetrics extends js.Object {
  /** Timestamp as of which metric values are current. */
  var metricTime: js.UndefOr[java.lang.String] = js.undefined
  /** All metrics for this job. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
}

