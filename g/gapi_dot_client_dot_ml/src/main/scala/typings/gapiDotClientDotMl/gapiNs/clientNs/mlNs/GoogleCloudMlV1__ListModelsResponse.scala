package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__ListModelsResponse extends js.Object {
  /** The list of models. */
  var models: js.UndefOr[js.Array[GoogleCloudMlV1__Model]] = js.undefined
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1__ListModelsResponse {
  @scala.inline
  def apply(models: js.Array[GoogleCloudMlV1__Model] = null, nextPageToken: String = null): GoogleCloudMlV1__ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GoogleCloudMlV1__ListModelsResponse]
  }
}

