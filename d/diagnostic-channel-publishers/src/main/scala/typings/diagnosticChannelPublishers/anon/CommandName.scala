package typings.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandName extends js.Object {
  
  var commandName: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var failure: js.UndefOr[String] = js.native
  
  var reply: js.UndefOr[js.Any] = js.native
}
object CommandName {
  
  @scala.inline
  def apply(): CommandName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandName]
  }
  
  @scala.inline
  implicit class CommandNameOps[Self <: CommandName] (val x: Self) extends AnyVal {
    
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
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandName: Self = this.set("commandName", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFailure(value: String): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setReply(value: js.Any): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
  }
}
