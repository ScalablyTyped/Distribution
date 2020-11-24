package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTargetInfoRequest extends js.Object {
  
  var targetId: js.UndefOr[TargetID] = js.native
}
object GetTargetInfoRequest {
  
  @scala.inline
  def apply(): GetTargetInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetInfoRequest]
  }
  
  @scala.inline
  implicit class GetTargetInfoRequestOps[Self <: GetTargetInfoRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
