package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteAgentRequest. */
trait IDeleteAgentRequest extends js.Object {
  /** DeleteAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IDeleteAgentRequest {
  @scala.inline
  def apply(parent: js.UndefOr[Null | String] = js.undefined): IDeleteAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteAgentRequest]
  }
}

