package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
@JSGlobal("ASPxClientUploadControlFilesUploadCompleteEventArgs")
@js.native
class ASPxClientUploadControlFilesUploadCompleteEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlFilesUploadCompleteEventArgs {
  /**
    * For internal use only.
    */
  def this(errorText: String, callbackData: String) = this()
  
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  /* CompleteClass */
  var callbackData: String = js.native
  
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    */
  /* CompleteClass */
  var errorText: String = js.native
}
