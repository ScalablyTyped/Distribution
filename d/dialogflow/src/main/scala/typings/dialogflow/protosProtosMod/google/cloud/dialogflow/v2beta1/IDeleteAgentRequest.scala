package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(parent: String = null): IDeleteAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IDeleteAgentRequest]
  }
}

