package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SetAgentRequest. */
trait ISetAgentRequest extends js.Object {
  /** SetAgentRequest agent */
  var agent: js.UndefOr[IAgent | Null] = js.undefined
  /** SetAgentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object ISetAgentRequest {
  @scala.inline
  def apply(
    agent: js.UndefOr[Null | IAgent] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): ISetAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agent)) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetAgentRequest]
  }
}

