package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetAgentRequest. */
trait IGetAgentRequest extends js.Object {
  /** GetAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IGetAgentRequest {
  @scala.inline
  def apply(parent: js.UndefOr[Null | String] = js.undefined): IGetAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetAgentRequest]
  }
}

