package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__PredictRequest extends js.Object {
  /** Required. The prediction request body. */
  var httpBody: js.UndefOr[GoogleApi__HttpBody] = js.undefined
}

object GoogleCloudMlV1__PredictRequest {
  @scala.inline
  def apply(httpBody: GoogleApi__HttpBody = null): GoogleCloudMlV1__PredictRequest = {
    val __obj = js.Dynamic.literal()
    if (httpBody != null) __obj.updateDynamic("httpBody")(httpBody)
    __obj.asInstanceOf[GoogleCloudMlV1__PredictRequest]
  }
}

