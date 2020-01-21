package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationCompletedEventArgs extends EventArgs {
  val container: js.Any
  val firstInvalidControl: Control
  val firstVisibleInvalidControl: Control
  val invisibleControlsValidated: Boolean
  var isValid: Boolean
  val validationGroup: String
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
}

