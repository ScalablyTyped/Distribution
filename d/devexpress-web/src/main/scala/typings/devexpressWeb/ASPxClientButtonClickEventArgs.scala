package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientButton.Click event.
  */
@js.native
trait ASPxClientButtonClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  var cancelEventAndBubble: Boolean = js.native
}
object ASPxClientButtonClickEventArgs {
  
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientButtonClickEventArgsOps[Self <: ASPxClientButtonClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancelEventAndBubble(value: Boolean): Self = this.set("cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
}
