package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddScriptToEvaluateOnLoadRequest extends js.Object {
  
  var scriptSource: String = js.native
}
object AddScriptToEvaluateOnLoadRequest {
  
  @scala.inline
  def apply(scriptSource: String): AddScriptToEvaluateOnLoadRequest = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadRequest]
  }
  
  @scala.inline
  implicit class AddScriptToEvaluateOnLoadRequestOps[Self <: AddScriptToEvaluateOnLoadRequest] (val x: Self) extends AnyVal {
    
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
    def setScriptSource(value: String): Self = this.set("scriptSource", value.asInstanceOf[js.Any])
  }
}
