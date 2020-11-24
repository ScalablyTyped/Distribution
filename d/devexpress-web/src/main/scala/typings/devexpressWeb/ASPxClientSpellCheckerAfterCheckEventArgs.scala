package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
@js.native
trait ASPxClientSpellCheckerAfterCheckEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the text that has been checked.
    */
  var checkedText: String = js.native
  
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    */
  var controlId: String = js.native
  
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    */
  var reason: String = js.native
}
object ASPxClientSpellCheckerAfterCheckEventArgs {
  
  @scala.inline
  def apply(checkedText: String, controlId: String, reason: String): ASPxClientSpellCheckerAfterCheckEventArgs = {
    val __obj = js.Dynamic.literal(checkedText = checkedText.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerAfterCheckEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSpellCheckerAfterCheckEventArgsOps[Self <: ASPxClientSpellCheckerAfterCheckEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCheckedText(value: String): Self = this.set("checkedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
