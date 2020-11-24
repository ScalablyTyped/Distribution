package typings.expo.notificationsTypesMod

import typings.expo.anon.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionType extends js.Object {
  
  var actionId: String = js.native
  
  var buttonTitle: String = js.native
  
  var doNotOpenInForeground: js.UndefOr[Boolean] = js.native
  
  var isAuthenticationRequired: js.UndefOr[Boolean] = js.native
  
  var isDestructive: js.UndefOr[Boolean] = js.native
  
  var textInput: js.UndefOr[Placeholder] = js.native
}
object ActionType {
  
  @scala.inline
  def apply(actionId: String, buttonTitle: String): ActionType = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], buttonTitle = buttonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  
  @scala.inline
  implicit class ActionTypeOps[Self <: ActionType] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTitle(value: String): Self = this.set("buttonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotOpenInForeground(value: Boolean): Self = this.set("doNotOpenInForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotOpenInForeground: Self = this.set("doNotOpenInForeground", js.undefined)
    
    @scala.inline
    def setIsAuthenticationRequired(value: Boolean): Self = this.set("isAuthenticationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuthenticationRequired: Self = this.set("isAuthenticationRequired", js.undefined)
    
    @scala.inline
    def setIsDestructive(value: Boolean): Self = this.set("isDestructive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDestructive: Self = this.set("isDestructive", js.undefined)
    
    @scala.inline
    def setTextInput(value: Placeholder): Self = this.set("textInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInput: Self = this.set("textInput", js.undefined)
  }
}
