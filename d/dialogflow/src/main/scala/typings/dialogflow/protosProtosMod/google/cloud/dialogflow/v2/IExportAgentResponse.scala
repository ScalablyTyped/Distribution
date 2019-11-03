package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExportAgentResponse. */
trait IExportAgentResponse extends js.Object {
  /** ExportAgentResponse agentContent */
  var agentContent: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ExportAgentResponse agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
}

object IExportAgentResponse {
  @scala.inline
  def apply(agentContent: Uint8Array = null, agentUri: String = null): IExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent)
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri)
    __obj.asInstanceOf[IExportAgentResponse]
  }
}

