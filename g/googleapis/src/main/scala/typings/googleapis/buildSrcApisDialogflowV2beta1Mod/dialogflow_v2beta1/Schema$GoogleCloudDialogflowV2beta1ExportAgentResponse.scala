package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Agents.ExportAgent.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ExportAgentResponse extends js.Object {
  /**
    * The exported agent.  Example for how to export an agent to a zip file via
    * a command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2beta1/projects/&amp;lt;project_name&amp;gt;/agent:export&#39;\
    * -X POST \   -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default   print-access-token) \   -H &#39;Accept:
    * application/json&#39; \   -H &#39;Content-Type: application/json&#39; \
    * --compressed \   --data-binary &#39;{}&#39; \ | grep agentContent | sed
    * -e &#39;s/.*&quot;agentContent&quot;:
    * &quot;\([^&quot;]*\)&quot;.x/\1/&#39; \ | base64 --decode &gt;
    * &amp;lt;agent zip file&amp;gt;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.native
  /**
    * The URI to a file containing the exported agent. This field is populated
    * only if `agent_uri` is specified in `ExportAgentRequest`.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ExportAgentResponse {
  @scala.inline
  def apply(agentContent: String = null, agentUri: String = null): Schema$GoogleCloudDialogflowV2beta1ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ExportAgentResponse]
  }
}

