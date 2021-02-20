package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
@JSGlobal("ASPxClientValidationCompletedEventArgs")
@js.native
class ASPxClientValidationCompletedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientValidationCompletedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientValidationCompletedEventArgs class.
    * @param container An object representing the container of controls that have been validated.
    * @param validationGroup A string value that specifies the name of the group of controls that has been validated.
    * @param invisibleControlsValidated true if both visible and invisible input controls have been validated; false if only visible input controls have been validated.
    * @param isValid true if the validation has been completed successfully; otherwise, false.
    * @param firstInvalidControl An object representing the first input control that has an invalid value.
    * @param firstVisibleInvalidControl An object representing the first visible input control that has an invalid value.
    */
  def this(
    container: js.Any,
    validationGroup: String,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    firstInvalidControl: typings.devexpressWeb.ASPxClientControl,
    firstVisibleInvalidControl: typings.devexpressWeb.ASPxClientControl
  ) = this()
}
