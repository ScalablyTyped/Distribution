package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Contexts.ListContexts.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ListContextsResponse extends js.Object {
  /**
    * The list of contexts. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var contexts: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1Context]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ListContextsResponse {
  @scala.inline
  def apply(
    contexts: js.Array[Schema$GoogleCloudDialogflowV2beta1Context] = null,
    nextPageToken: String = null
  ): Schema$GoogleCloudDialogflowV2beta1ListContextsResponse = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ListContextsResponse]
  }
}

