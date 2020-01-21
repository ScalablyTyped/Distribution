package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(parent: String = null): IGetAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetAgentRequest]
  }
}

