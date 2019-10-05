package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricShortId extends js.Object {
  /**
    * The index of the corresponding metric in
    * the ReportWorkItemStatusRequest. Required.
    */
  var metricIndex: js.UndefOr[Double] = js.undefined
  /** The service-generated short identifier for the metric. */
  var shortId: js.UndefOr[String] = js.undefined
}

object MetricShortId {
  @scala.inline
  def apply(metricIndex: Int | Double = null, shortId: String = null): MetricShortId = {
    val __obj = js.Dynamic.literal()
    if (metricIndex != null) __obj.updateDynamic("metricIndex")(metricIndex.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId)
    __obj.asInstanceOf[MetricShortId]
  }
}

