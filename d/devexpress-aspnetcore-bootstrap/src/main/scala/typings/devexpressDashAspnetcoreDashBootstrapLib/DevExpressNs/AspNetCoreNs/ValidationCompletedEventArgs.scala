package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationCompletedEventArgs extends EventArgs {
  val container: js.Any
  val firstInvalidControl: Control
  val firstVisibleInvalidControl: Control
  val invisibleControlsValidated: scala.Boolean
  var isValid: scala.Boolean
  val validationGroup: java.lang.String
}

object ValidationCompletedEventArgs {
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: Control,
    firstVisibleInvalidControl: Control,
    invisibleControlsValidated: scala.Boolean,
    isValid: scala.Boolean,
    sender: Control,
    validationGroup: java.lang.String
  ): ValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("firstInvalidControl")(firstInvalidControl)
    __obj.updateDynamic("firstVisibleInvalidControl")(firstVisibleInvalidControl)
    __obj.updateDynamic("invisibleControlsValidated")(invisibleControlsValidated)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("validationGroup")(validationGroup)
    __obj.asInstanceOf[ValidationCompletedEventArgs]
  }
}

