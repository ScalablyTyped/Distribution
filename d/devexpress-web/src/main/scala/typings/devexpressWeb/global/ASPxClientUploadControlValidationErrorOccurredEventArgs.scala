package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
@JSGlobal("ASPxClientUploadControlValidationErrorOccurredEventArgs")
@js.native
open class ASPxClientUploadControlValidationErrorOccurredEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlValidationErrorOccurredEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlValidationErrorOccurredEventArgs class with specified settings.
    * @param errorText A string that is the error text.
    * @param invalidFiles An array of the ASPxClientUploadControlInvalidFileInfo objects that are invalid files.
    */
  def this(
    errorText: String,
    invalidFiles: js.Array[typings.devexpressWeb.ASPxClientUploadControlInvalidFileInfo]
  ) = this()
  
  /**
    * Gets or sets the error text.
    */
  /* CompleteClass */
  var errorText: String = js.native
  
  /**
    * Returns an array of invalid files.
    */
  /* CompleteClass */
  var invalidFiles: js.Array[typings.devexpressWeb.ASPxClientUploadControlInvalidFileInfo] = js.native
  
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ASPxClientUploadControl.ValidationErrorOccurred event fires.
    */
  /* CompleteClass */
  var showAlert: Boolean = js.native
  
  /**
    * Gets the validation settings for the selected files.
    */
  /* CompleteClass */
  var validationSettings: typings.devexpressWeb.ASPxClientUploadControlValidationSettings = js.native
}
