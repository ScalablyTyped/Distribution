package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStatus extends js.Object {
  
  var CompletedAt: js.UndefOr[String] = js.native
  
  var Message: js.UndefOr[String] = js.native
  
  var StartedAt: js.UndefOr[String] = js.native
  
  var State: js.UndefOr[UpdateState] = js.native
}
object UpdateStatus {
  
  @scala.inline
  def apply(): UpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStatus]
  }
  
  @scala.inline
  implicit class UpdateStatusOps[Self <: UpdateStatus] (val x: Self) extends AnyVal {
    
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
    def setCompletedAt(value: String): Self = this.set("CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedAt: Self = this.set("CompletedAt", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setStartedAt(value: String): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    
    @scala.inline
    def setState(value: UpdateState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
