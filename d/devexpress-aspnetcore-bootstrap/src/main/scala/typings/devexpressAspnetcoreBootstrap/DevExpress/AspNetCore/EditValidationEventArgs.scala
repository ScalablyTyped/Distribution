package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditValidationEventArgs
  extends StObject
     with EventArgs {
  
  var errorText: String
  
  var isValid: Boolean
  
  var value: String
}
object EditValidationEventArgs {
  
  @scala.inline
  def apply(errorText: String, isValid: Boolean, sender: Control, value: String): EditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditValidationEventArgs]
  }
  
  @scala.inline
  implicit class EditValidationEventArgsMutableBuilder[Self <: EditValidationEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
