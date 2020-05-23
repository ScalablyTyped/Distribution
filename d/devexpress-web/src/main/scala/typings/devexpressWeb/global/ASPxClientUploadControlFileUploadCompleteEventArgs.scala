package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
@JSGlobal("ASPxClientUploadControlFileUploadCompleteEventArgs")
@js.native
class ASPxClientUploadControlFileUploadCompleteEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientUploadControlFileUploadCompleteEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlFileUploadCompleteEventArgs class.
    * @param inputIndex An integer value that specifies the file input element's index.
    * @param isValid true if the uploaded file is valid; otherwise, false.
    * @param errorText A String value representing the error description.
    * @param callbackData A String value that contains the callback data.
    */
  def this(inputIndex: Double, isValid: Boolean, errorText: String, callbackData: String) = this()
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  /* CompleteClass */
  override var callbackData: String = js.native
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  /* CompleteClass */
  override var errorText: String = js.native
  /**
    * Gets the index of a <strong>file input element</strong> within the ASPxUploadControl.
    */
  /* CompleteClass */
  override var inputIndex: Double = js.native
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  /* CompleteClass */
  override var isValid: Boolean = js.native
}

