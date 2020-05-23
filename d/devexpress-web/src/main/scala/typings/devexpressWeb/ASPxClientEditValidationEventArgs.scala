package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events that are related to data validation (see ASPxClientEdit.Validate).
  */
trait ASPxClientEditValidationEventArgs extends ASPxClientEventArgs {
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
}

