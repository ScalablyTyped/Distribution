package typings.atFirebasePerformance.distSrcResourcesNetworkUnderscoreRequestMod

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
    httpResponseCode: Int | Double = null,
    requestPayloadBytes: Int | Double = null,
    responseContentType: String = null,
    responsePayloadBytes: Int | Double = null,
    startTimeUs: Int | Double = null,
    timeToRequestCompletedUs: Int | Double = null,
    timeToResponseCompletedUs: Int | Double = null,
    timeToResponseInitiatedUs: Int | Double = null
  ): NetworkRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (httpResponseCode != null) __obj.updateDynamic("httpResponseCode")(httpResponseCode.asInstanceOf[js.Any])
    if (requestPayloadBytes != null) __obj.updateDynamic("requestPayloadBytes")(requestPayloadBytes.asInstanceOf[js.Any])
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType.asInstanceOf[js.Any])
    if (responsePayloadBytes != null) __obj.updateDynamic("responsePayloadBytes")(responsePayloadBytes.asInstanceOf[js.Any])
    if (startTimeUs != null) __obj.updateDynamic("startTimeUs")(startTimeUs.asInstanceOf[js.Any])
    if (timeToRequestCompletedUs != null) __obj.updateDynamic("timeToRequestCompletedUs")(timeToRequestCompletedUs.asInstanceOf[js.Any])
    if (timeToResponseCompletedUs != null) __obj.updateDynamic("timeToResponseCompletedUs")(timeToResponseCompletedUs.asInstanceOf[js.Any])
    if (timeToResponseInitiatedUs != null) __obj.updateDynamic("timeToResponseInitiatedUs")(timeToResponseInitiatedUs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkRequest]
  }
}

