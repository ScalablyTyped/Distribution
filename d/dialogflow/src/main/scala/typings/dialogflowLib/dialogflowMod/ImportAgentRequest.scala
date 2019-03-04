package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportAgentRequest extends js.Object {
  var agentContent: js.UndefOr[java.lang.String] = js.undefined
  var agentUri: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
}

object ImportAgentRequest {
  @scala.inline
  def apply(parent: java.lang.String, agentContent: java.lang.String = null, agentUri: java.lang.String = null): ImportAgentRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent)
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri)
    __obj.asInstanceOf[ImportAgentRequest]
  }
}

