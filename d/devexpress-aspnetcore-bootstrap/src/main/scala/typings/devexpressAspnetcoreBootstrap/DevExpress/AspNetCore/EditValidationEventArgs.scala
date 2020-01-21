package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditValidationEventArgs extends EventArgs {
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
}

