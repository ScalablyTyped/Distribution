package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(container = container, firstInvalidControl = firstInvalidControl, firstVisibleInvalidControl = firstVisibleInvalidControl, invisibleControlsValidated = invisibleControlsValidated, isValid = isValid, sender = sender, validationGroup = validationGroup)
  
    __obj.asInstanceOf[ValidationCompletedEventArgs]
  }
}

