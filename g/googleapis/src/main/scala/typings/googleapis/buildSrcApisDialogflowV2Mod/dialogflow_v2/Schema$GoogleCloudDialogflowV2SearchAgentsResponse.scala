package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Agents.SearchAgents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2SearchAgentsResponse extends js.Object {
  /**
    * The list of agents. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var agents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Agent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2SearchAgentsResponse {
  @scala.inline
  def apply(agents: js.Array[Schema$GoogleCloudDialogflowV2Agent] = null, nextPageToken: String = null): Schema$GoogleCloudDialogflowV2SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (agents != null) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2SearchAgentsResponse]
  }
}

