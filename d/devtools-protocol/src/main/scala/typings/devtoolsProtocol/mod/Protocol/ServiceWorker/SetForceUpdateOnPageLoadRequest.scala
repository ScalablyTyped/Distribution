package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetForceUpdateOnPageLoadRequest extends js.Object {
  
  var forceUpdateOnPageLoad: Boolean = js.native
}
object SetForceUpdateOnPageLoadRequest {
  
  @scala.inline
  def apply(forceUpdateOnPageLoad: Boolean): SetForceUpdateOnPageLoadRequest = {
    val __obj = js.Dynamic.literal(forceUpdateOnPageLoad = forceUpdateOnPageLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetForceUpdateOnPageLoadRequest]
  }
  
  @scala.inline
  implicit class SetForceUpdateOnPageLoadRequestOps[Self <: SetForceUpdateOnPageLoadRequest] (val x: Self) extends AnyVal {
    
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
    def setForceUpdateOnPageLoad(value: Boolean): Self = this.set("forceUpdateOnPageLoad", value.asInstanceOf[js.Any])
  }
}
