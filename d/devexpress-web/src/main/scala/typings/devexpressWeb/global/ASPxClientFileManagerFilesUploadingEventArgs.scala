package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
@JSGlobal("ASPxClientFileManagerFilesUploadingEventArgs")
@js.native
class ASPxClientFileManagerFilesUploadingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFilesUploadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFilesUploadingEventArgs object with the specified parameters.
    * @param folder A string value specifying the folder path.
    * @param fileNames An array of string values that are the file names.
    */
  def this(folder: String, fileNames: js.Array[String]) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the names of files selected for upload.
    */
  /* CompleteClass */
  var fileNames: js.Array[String] = js.native
  
  /**
    * Gets the path to the folder where files are being uploaded.
    */
  /* CompleteClass */
  var folder: String = js.native
}
