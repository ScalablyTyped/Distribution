package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
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
  def apply(agent: IAgent = null, updateMask: IFieldMask = null): ISetAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[ISetAgentRequest]
  }
}

