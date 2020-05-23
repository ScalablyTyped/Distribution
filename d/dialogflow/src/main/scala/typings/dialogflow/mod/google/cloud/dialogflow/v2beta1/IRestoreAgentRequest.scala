package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RestoreAgentRequest. */
trait IRestoreAgentRequest extends js.Object {
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IRestoreAgentRequest {
  @scala.inline
  def apply(
    agentContent: js.UndefOr[Null | Uint8Array | String] = js.undefined,
    agentUri: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentContent)) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (!js.isUndefined(agentUri)) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
}

