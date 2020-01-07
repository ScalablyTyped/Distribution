package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListModels method.
  */
@js.native
trait Schema$GoogleCloudMlV1__ListModelsResponse extends js.Object {
  /**
    * The list of models.
    */
  var models: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__Model]] = js.native
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__ListModelsResponse {
  @scala.inline
  def apply(models: js.Array[Schema$GoogleCloudMlV1__Model] = null, nextPageToken: String = null): Schema$GoogleCloudMlV1__ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ListModelsResponse]
  }
}

