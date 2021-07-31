package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events that are related to data validation (see ASPxClientEdit.Validate).
  */
trait ASPxClientEditValidationEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets the error description.
    */
  var errorText: String
  
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean
  
  /**
    * Gets or sets the editor's value being validated.
    */
  var value: String
}
object ASPxClientEditValidationEventArgs {
  
  @scala.inline
  def apply(errorText: String, isValid: Boolean, value: String): ASPxClientEditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditValidationEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientEditValidationEventArgsMutableBuilder[Self <: ASPxClientEditValidationEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
