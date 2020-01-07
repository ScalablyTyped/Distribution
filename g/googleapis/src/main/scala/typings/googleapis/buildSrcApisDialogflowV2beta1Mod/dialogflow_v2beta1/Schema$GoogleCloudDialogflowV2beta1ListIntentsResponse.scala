package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.ListIntents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ListIntentsResponse extends js.Object {
  /**
    * The list of agent intents. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var intents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1Intent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ListIntentsResponse {
  @scala.inline
  def apply(intents: js.Array[Schema$GoogleCloudDialogflowV2beta1Intent] = null, nextPageToken: String = null): Schema$GoogleCloudDialogflowV2beta1ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ListIntentsResponse]
  }
}

