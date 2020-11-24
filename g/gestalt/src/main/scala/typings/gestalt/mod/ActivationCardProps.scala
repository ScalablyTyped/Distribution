package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.anon.Href
import typings.gestalt.gestaltStrings.complete
import typings.gestalt.gestaltStrings.needsAttention
import typings.gestalt.gestaltStrings.notStarted
import typings.gestalt.gestaltStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivationCardProps extends js.Object {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.native
  
  var link: js.UndefOr[Href] = js.native
  
  var message: String = js.native
  
  var status: notStarted | pending | needsAttention | complete = js.native
  
  var statusMessage: String = js.native
  
  var title: String = js.native
}
object ActivationCardProps {
  
  @scala.inline
  def apply(
    message: String,
    status: notStarted | pending | needsAttention | complete,
    statusMessage: String,
    title: String
  ): ActivationCardProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationCardProps]
  }
  
  @scala.inline
  implicit class ActivationCardPropsOps[Self <: ActivationCardProps] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: notStarted | pending | needsAttention | complete): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissButton(value: AccessibilityLabel): Self = this.set("dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissButton: Self = this.set("dismissButton", js.undefined)
    
    @scala.inline
    def setLink(value: Href): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
