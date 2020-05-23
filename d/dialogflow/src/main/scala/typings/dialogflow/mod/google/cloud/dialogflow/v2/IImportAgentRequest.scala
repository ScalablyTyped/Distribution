package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ImportAgentRequest. */
trait IImportAgentRequest extends js.Object {
  /** ImportAgentRequest agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
  /** ImportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** ImportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IImportAgentRequest {
  @scala.inline
  def apply(
    agentContent: js.UndefOr[Null | Uint8Array | String] = js.undefined,
    agentUri: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentContent)) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (!js.isUndefined(agentUri)) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImportAgentRequest]
  }
}

