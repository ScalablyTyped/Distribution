package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events that are related to data validation (see ASPxClientEdit.Validate).
  */
@JSGlobal("ASPxClientEditValidationEventArgs")
@js.native
class ASPxClientEditValidationEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientEditValidationEventArgs {
  /**
    * Initializes a new instance of the ASPxClientEditValidationEventArgs class with the specified settings.
    * @param value An object that represents the validated value.
    * @param errorText A string representing the error description.
    * @param isValid true if the validated value is valid; otherwise, false.
    */
  def this(value: String, errorText: String, isValid: Boolean) = this()
}
