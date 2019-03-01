package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricShortId extends js.Object {
  /**
    * The index of the corresponding metric in
    * the ReportWorkItemStatusRequest. Required.
    */
  var metricIndex: js.UndefOr[scala.Double] = js.undefined
  /** The service-generated short identifier for the metric. */
  var shortId: js.UndefOr[java.lang.String] = js.undefined
}

object MetricShortId {
  @scala.inline
  def apply(metricIndex: scala.Int | scala.Double = null, shortId: java.lang.String = null): MetricShortId = {
    val __obj = js.Dynamic.literal()
    if (metricIndex != null) __obj.updateDynamic("metricIndex")(metricIndex.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId)
    __obj.asInstanceOf[MetricShortId]
  }
}

