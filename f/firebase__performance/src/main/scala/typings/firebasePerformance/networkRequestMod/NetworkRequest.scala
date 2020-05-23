package typings.firebasePerformance.networkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkRequest extends js.Object {
  var httpMethod: js.UndefOr[HttpMethod] = js.undefined
  var httpResponseCode: js.UndefOr[Double] = js.undefined
  var requestPayloadBytes: js.UndefOr[Double] = js.undefined
  var responseContentType: js.UndefOr[String] = js.undefined
  var responsePayloadBytes: js.UndefOr[Double] = js.undefined
  var startTimeUs: js.UndefOr[Double] = js.undefined
  var timeToRequestCompletedUs: js.UndefOr[Double] = js.undefined
  var timeToResponseCompletedUs: js.UndefOr[Double] = js.undefined
  var timeToResponseInitiatedUs: js.UndefOr[Double] = js.undefined
  var url: String
}

object NetworkRequest {
  @scala.inline
  def apply(
    url: String,
    httpMethod: HttpMethod = null,
    httpResponseCode: js.UndefOr[Double] = js.undefined,
    requestPayloadBytes: js.UndefOr[Double] = js.undefined,
    responseContentType: String = null,
    responsePayloadBytes: js.UndefOr[Double] = js.undefined,
    startTimeUs: js.UndefOr[Double] = js.undefined,
    timeToRequestCompletedUs: js.UndefOr[Double] = js.undefined,
    timeToResponseCompletedUs: js.UndefOr[Double] = js.undefined,
    timeToResponseInitiatedUs: js.UndefOr[Double] = js.undefined
  ): NetworkRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(httpResponseCode)) __obj.updateDynamic("httpResponseCode")(httpResponseCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayloadBytes)) __obj.updateDynamic("requestPayloadBytes")(requestPayloadBytes.get.asInstanceOf[js.Any])
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType.asInstanceOf[js.Any])
    if (!js.isUndefined(responsePayloadBytes)) __obj.updateDynamic("responsePayloadBytes")(responsePayloadBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimeUs)) __obj.updateDynamic("startTimeUs")(startTimeUs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToRequestCompletedUs)) __obj.updateDynamic("timeToRequestCompletedUs")(timeToRequestCompletedUs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToResponseCompletedUs)) __obj.updateDynamic("timeToResponseCompletedUs")(timeToResponseCompletedUs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToResponseInitiatedUs)) __obj.updateDynamic("timeToResponseInitiatedUs")(timeToResponseInitiatedUs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkRequest]
  }
}

