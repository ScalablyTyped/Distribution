package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationCompletedEventArgs extends EventArgs {
  
  val container: js.Any = js.native
  
  val firstInvalidControl: Control = js.native
  
  val firstVisibleInvalidControl: Control = js.native
  
  val invisibleControlsValidated: Boolean = js.native
  
  var isValid: Boolean = js.native
  
  val validationGroup: String = js.native
}
object ValidationCompletedEventArgs {
  
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: Control,
    firstVisibleInvalidControl: Control,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    sender: Control,
    validationGroup: String
  ): ValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], firstInvalidControl = firstInvalidControl.asInstanceOf[js.Any], firstVisibleInvalidControl = firstVisibleInvalidControl.asInstanceOf[js.Any], invisibleControlsValidated = invisibleControlsValidated.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], validationGroup = validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class ValidationCompletedEventArgsOps[Self <: ValidationCompletedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInvalidControl(value: Control): Self = this.set("firstInvalidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleInvalidControl(value: Control): Self = this.set("firstVisibleInvalidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleControlsValidated(value: Boolean): Self = this.set("invisibleControlsValidated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationGroup(value: String): Self = this.set("validationGroup", value.asInstanceOf[js.Any])
  }
}
