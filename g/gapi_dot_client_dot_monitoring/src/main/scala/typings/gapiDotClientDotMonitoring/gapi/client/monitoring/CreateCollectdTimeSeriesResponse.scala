package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectdTimeSeriesResponse extends js.Object {
  /**
    * Records the error status for points that were not written due to an error.Failed requests for which nothing is written will return an error response
    * instead.
    */
  var payloadErrors: js.UndefOr[js.Array[CollectdPayloadError]] = js.undefined
}

object CreateCollectdTimeSeriesResponse {
  @scala.inline
  def apply(payloadErrors: js.Array[CollectdPayloadError] = null): CreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (payloadErrors != null) __obj.updateDynamic("payloadErrors")(payloadErrors)
    __obj.asInstanceOf[CreateCollectdTimeSeriesResponse]
  }
}

