package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExportAgentRequest. */
trait IExportAgentRequest extends js.Object {
  /** ExportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** ExportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IExportAgentRequest {
  @scala.inline
  def apply(agentUri: String = null, parent: String = null): IExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportAgentRequest]
  }
}

