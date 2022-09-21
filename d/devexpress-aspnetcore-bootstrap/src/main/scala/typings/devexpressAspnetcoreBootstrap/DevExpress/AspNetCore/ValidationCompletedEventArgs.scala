package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationCompletedEventArgs
  extends StObject
     with EventArgs {
  
  val container: Any
  
  val firstInvalidControl: Control
  
  val firstVisibleInvalidControl: Control
  
  val invisibleControlsValidated: Boolean
  
  var isValid: Boolean
  
  val validationGroup: String
}
object ValidationCompletedEventArgs {
  
  inline def apply(
    container: Any,
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
  
  extension [Self <: ValidationCompletedEventArgs](x: Self) {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setFirstInvalidControl(value: Control): Self = StObject.set(x, "firstInvalidControl", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleInvalidControl(value: Control): Self = StObject.set(x, "firstVisibleInvalidControl", value.asInstanceOf[js.Any])
    
    inline def setInvisibleControlsValidated(value: Boolean): Self = StObject.set(x, "invisibleControlsValidated", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
  }
}
