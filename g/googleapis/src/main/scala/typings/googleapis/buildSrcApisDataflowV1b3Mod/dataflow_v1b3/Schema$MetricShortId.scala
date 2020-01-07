package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metric short id is returned to the user alongside an offset into
  * ReportWorkItemStatusRequest
  */
@js.native
trait Schema$MetricShortId extends js.Object {
  /**
    * The index of the corresponding metric in the ReportWorkItemStatusRequest.
    * Required.
    */
  var metricIndex: js.UndefOr[Double] = js.native
  /**
    * The service-generated short identifier for the metric.
    */
  var shortId: js.UndefOr[String] = js.native
}

object Schema$MetricShortId {
  @scala.inline
  def apply(metricIndex: Int | Double = null, shortId: String = null): Schema$MetricShortId = {
    val __obj = js.Dynamic.literal()
    if (metricIndex != null) __obj.updateDynamic("metricIndex")(metricIndex.asInstanceOf[js.Any])
    if (shortId != null) __obj.updateDynamic("shortId")(shortId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricShortId]
  }
}

