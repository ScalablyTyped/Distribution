package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddScriptToEvaluateOnLoadResponse extends js.Object {
  /**
    * Identifier of the added script.
    */
  var identifier: ScriptIdentifier = js.native
}

object AddScriptToEvaluateOnLoadResponse {
  @scala.inline
  def apply(identifier: ScriptIdentifier): AddScriptToEvaluateOnLoadResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadResponse]
  }
  @scala.inline
  implicit class AddScriptToEvaluateOnLoadResponseOps[Self <: AddScriptToEvaluateOnLoadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifier(value: ScriptIdentifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
  }
  
}

