package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1PredictRequest extends js.Object {
  /** Required. The prediction request body. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.undefined
}

object GoogleCloudMlV1PredictRequest {
  @scala.inline
  def apply(httpBody: GoogleApiHttpBody = null): GoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    if (httpBody != null) __obj.updateDynamic("httpBody")(httpBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1PredictRequest]
  }
}

