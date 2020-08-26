package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
@JSGlobal("ASPxClientUploadControlValidationErrorOccurredEventArgs")
@js.native
class ASPxClientUploadControlValidationErrorOccurredEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientUploadControlValidationErrorOccurredEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlValidationErrorOccurredEventArgs class with specified settings.
    * @param errorText A string that is the error text.
    * @param invalidFiles An array of the ASPxClientUploadControlInvalidFileInfo objects that are invalid files.
    */
  def this(
    errorText: String,
    invalidFiles: js.Array[typings.devexpressWeb.ASPxClientUploadControlInvalidFileInfo]
  ) = this()
}

