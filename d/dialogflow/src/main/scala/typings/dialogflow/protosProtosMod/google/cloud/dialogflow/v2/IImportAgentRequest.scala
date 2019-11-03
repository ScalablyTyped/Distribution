package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ImportAgentRequest. */
trait IImportAgentRequest extends js.Object {
  /** ImportAgentRequest agentContent */
  var agentContent: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ImportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** ImportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IImportAgentRequest {
  @scala.inline
  def apply(agentContent: Uint8Array = null, agentUri: String = null, parent: String = null): IImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent)
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IImportAgentRequest]
  }
}

