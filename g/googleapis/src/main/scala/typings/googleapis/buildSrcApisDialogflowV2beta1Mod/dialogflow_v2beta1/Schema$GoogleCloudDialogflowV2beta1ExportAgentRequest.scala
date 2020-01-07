package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Agents.ExportAgent.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ExportAgentRequest extends js.Object {
  /**
    * Optional. The [Google Cloud
    * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
    * to. The format of this URI must be
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left unspecified, the
    * serialized agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ExportAgentRequest {
  @scala.inline
  def apply(agentUri: String = null): Schema$GoogleCloudDialogflowV2beta1ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ExportAgentRequest]
  }
}

