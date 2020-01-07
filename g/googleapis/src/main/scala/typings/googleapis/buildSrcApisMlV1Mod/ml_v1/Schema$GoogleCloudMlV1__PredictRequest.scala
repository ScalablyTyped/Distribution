package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for predictions to be issued against a trained model.
  */
@js.native
trait Schema$GoogleCloudMlV1__PredictRequest extends js.Object {
  /**
    *  Required. The prediction request body.
    */
  var httpBody: js.UndefOr[Schema$GoogleApi__HttpBody] = js.native
}

object Schema$GoogleCloudMlV1__PredictRequest {
  @scala.inline
  def apply(httpBody: Schema$GoogleApi__HttpBody = null): Schema$GoogleCloudMlV1__PredictRequest = {
    val __obj = js.Dynamic.literal()
    if (httpBody != null) __obj.updateDynamic("httpBody")(httpBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__PredictRequest]
  }
}

