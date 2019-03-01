package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportAgentRequest extends js.Object {
  var agentUri: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
}

object ExportAgentRequest {
  @scala.inline
  def apply(parent: java.lang.String, agentUri: java.lang.String = null): ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri)
    __obj.asInstanceOf[ExportAgentRequest]
  }
}

