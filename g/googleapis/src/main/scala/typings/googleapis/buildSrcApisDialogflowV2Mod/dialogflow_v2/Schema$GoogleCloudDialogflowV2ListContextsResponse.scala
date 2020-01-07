package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Contexts.ListContexts.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2ListContextsResponse extends js.Object {
  /**
    * The list of contexts. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var contexts: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Context]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2ListContextsResponse {
  @scala.inline
  def apply(contexts: js.Array[Schema$GoogleCloudDialogflowV2Context] = null, nextPageToken: String = null): Schema$GoogleCloudDialogflowV2ListContextsResponse = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2ListContextsResponse]
  }
}

