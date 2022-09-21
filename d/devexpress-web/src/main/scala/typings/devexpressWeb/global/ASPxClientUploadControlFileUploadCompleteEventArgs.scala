package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
@JSGlobal("ASPxClientUploadControlFileUploadCompleteEventArgs")
@js.native
open class ASPxClientUploadControlFileUploadCompleteEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlFileUploadCompleteEventArgs {
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
  var callbackData: String = js.native
  
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  /* CompleteClass */
  var errorText: String = js.native
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  /* CompleteClass */
  var inputIndex: Double = js.native
  
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  /* CompleteClass */
  var isValid: Boolean = js.native
}
