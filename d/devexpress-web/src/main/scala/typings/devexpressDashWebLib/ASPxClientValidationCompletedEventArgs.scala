package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
trait ASPxClientValidationCompletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a container object that holds the validated control(s).
    * Value: An object that represents a container of the validated control(s).
    */
  var container: js.Object
  /**
    * Gets the first control (either visible or invisible) that hasn't passed the validation applied.
    * Value: An ASPxClientControl object that represents the first invalid control.
    */
  var firstInvalidControl: ASPxClientControl
  /**
    * Gets the first visible control that hasn't passed the validation applied.
    * Value: An ASPxClientControl object that represents the first visible invalid control.
    */
  var firstVisibleInvalidControl: ASPxClientControl
  /**
    * Gets a value that indicates whether validation has been applied to both visible and invisible controls.
    * Value: true if validation has been applied to both visible and invisible controls; false if only visible controls have been validated.
    */
  var invisibleControlsValidated: scala.Boolean
  /**
    * Gets a value specifying whether the validation has been completed successfully.
    * Value: true if the validation has been completed successfully; otherwise, false.
    */
  var isValid: scala.Boolean
  /**
    * Gets the name of the validation group name to which validation has been applied.
    * Value: A string value that represents the name of the validation group that has been validated.
    */
  var validationGroup: java.lang.String
}

object ASPxClientValidationCompletedEventArgs {
  @scala.inline
  def apply(
    container: js.Object,
    firstInvalidControl: ASPxClientControl,
    firstVisibleInvalidControl: ASPxClientControl,
    invisibleControlsValidated: scala.Boolean,
    isValid: scala.Boolean,
    validationGroup: java.lang.String
  ): ASPxClientValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container, firstInvalidControl = firstInvalidControl, firstVisibleInvalidControl = firstVisibleInvalidControl, invisibleControlsValidated = invisibleControlsValidated, isValid = isValid, validationGroup = validationGroup)
  
    __obj.asInstanceOf[ASPxClientValidationCompletedEventArgs]
  }
}

