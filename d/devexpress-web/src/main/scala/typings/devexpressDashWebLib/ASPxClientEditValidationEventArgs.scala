package typings
package devexpressDashWebLib

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
  var errorText: java.lang.String
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    * Value: true if the value is valid; otherwise, false.
    */
  var isValid: scala.Boolean
  /**
    * Gets or sets the editor's value being validated.
    * Value: An object that represents the validated value.
    */
  var value: java.lang.String
}

object ASPxClientEditValidationEventArgs {
  @scala.inline
  def apply(errorText: java.lang.String, isValid: scala.Boolean, value: java.lang.String): ASPxClientEditValidationEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ASPxClientEditValidationEventArgs]
  }
}

