package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for EntityTypes.ListEntityTypes.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse extends js.Object {
  /**
    * The list of agent entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var entityTypes: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1EntityType]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse {
  @scala.inline
  def apply(
    entityTypes: js.Array[Schema$GoogleCloudDialogflowV2beta1EntityType] = null,
    nextPageToken: String = null
  ): Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse]
  }
}

