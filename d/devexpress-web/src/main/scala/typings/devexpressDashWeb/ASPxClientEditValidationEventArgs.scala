package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events that are related to data validation (see Validate).
  */
trait ASPxClientEditValidationEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error description.
    * Value: A string representing the error description.
    */
  var errorText: String
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    * Value: true if the value is valid; otherwise, false.
    */
  var isValid: Boolean
  /**
    * Gets or sets the editor's value being validated.
    * Value: An object that represents the validated value.
    */
  var value: String
}

object ASPxClientEditValidationEventArgs {
  @scala.inline
  def apply(errorText: String, isValid: Boolean, value: String): ASPxClientEditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText, isValid = isValid, value = value)
  
    __obj.asInstanceOf[ASPxClientEditValidationEventArgs]
  }
}

