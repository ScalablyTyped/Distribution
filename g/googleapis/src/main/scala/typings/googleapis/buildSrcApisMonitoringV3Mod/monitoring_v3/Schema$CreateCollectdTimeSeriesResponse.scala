package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateCollectdTimeSeries response.
  */
@js.native
trait Schema$CreateCollectdTimeSeriesResponse extends js.Object {
  /**
    * Records the error status for points that were not written due to an
    * error.Failed requests for which nothing is written will return an error
    * response instead.
    */
  var payloadErrors: js.UndefOr[js.Array[Schema$CollectdPayloadError]] = js.native
}

object Schema$CreateCollectdTimeSeriesResponse {
  @scala.inline
  def apply(payloadErrors: js.Array[Schema$CollectdPayloadError] = null): Schema$CreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (payloadErrors != null) __obj.updateDynamic("payloadErrors")(payloadErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateCollectdTimeSeriesResponse]
  }
}

