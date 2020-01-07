package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Agents.RestoreAgent.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2RestoreAgentRequest extends js.Object {
  /**
    * The agent to restore.  Example for how to restore an agent via the
    * command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2/projects/&amp;lt;project_name&amp;gt;/agent:restore\
    * -X POST \    -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default    print-access-token) \    -H &#39;Accept:
    * application/json&#39; \    -H &#39;Content-Type: application/json&#39; \
    * --compressed \    --data-binary &quot;{        &#39;agentContent&#39;:
    * &#39;$(cat &amp;lt;agent zip file&amp;gt; | base64 -w 0)&#39;
    * }&quot;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.native
  /**
    * The URI to a Google Cloud Storage file containing the agent to restore.
    * Note: The URI must start with &quot;gs://&quot;.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2RestoreAgentRequest {
  @scala.inline
  def apply(agentContent: String = null, agentUri: String = null): Schema$GoogleCloudDialogflowV2RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2RestoreAgentRequest]
  }
}

