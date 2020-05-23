package typings.gapiClientDataflow.gapi.client.dataflow

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
  def apply(metricIndex: js.UndefOr[Double] = js.undefined, shortId: String = null): MetricShortId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metricIndex)) __obj.updateDynamic("metricIndex")(metricIndex.get.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricShortId]
  }
}

