package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploaded event.
  */
@JSGlobal("ASPxClientFileManagerFilesUploadedEventArgs")
@js.native
class ASPxClientFileManagerFilesUploadedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFilesUploadedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFilesUploadedEventArgs object with the specified parameters.
    * @param folder A string value specifying the uploaded file path.
    * @param fileNames An array of string values that are the file names.
    */
  def this(folder: String, fileNames: js.Array[String]) = this()
  
  /**
    * Gets an array of uploaded file names.
    */
  /* CompleteClass */
  var fileNames: js.Array[String] = js.native
  
  /**
    * Gets the path to the folder where files are uploaded.
    */
  /* CompleteClass */
  var folder: String = js.native
}
