package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListModelsResponse extends js.Object {
  /**
    * Models in the requested dataset. Only the following fields are populated:
    * model_reference, model_type, creation_time, last_modified_time and
    * labels.
    */
  var models: js.UndefOr[js.Array[Schema$Model]] = js.native
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListModelsResponse {
  @scala.inline
  def apply(models: js.Array[Schema$Model] = null, nextPageToken: String = null): Schema$ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListModelsResponse]
  }
}

