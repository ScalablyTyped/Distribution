package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
@JSGlobal("ASPxClientFileManagerFileUploadingEventArgs")
@js.native
class ASPxClientFileManagerFileUploadingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFileUploadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileUploadingEventArgs object with the specified parameters.
    * @param folder A string value specifying the path to which the file is being uploaded.
    * @param fileName A string value that specifies the file name.
    */
  def this(folder: String, fileName: String) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the name of a file selected for upload.
    */
  /* CompleteClass */
  var fileName: String = js.native
  
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  /* CompleteClass */
  var folder: String = js.native
}
