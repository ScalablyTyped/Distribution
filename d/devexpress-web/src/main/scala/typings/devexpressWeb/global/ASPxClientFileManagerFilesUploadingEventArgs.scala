package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
@JSGlobal("ASPxClientFileManagerFilesUploadingEventArgs")
@js.native
class ASPxClientFileManagerFilesUploadingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerFilesUploadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFilesUploadingEventArgs object with the specified parameters.
    * @param folder A string value specifying the folder path.
    * @param fileNames An array of string values that are the file names.
    */
  def this(folder: String, fileNames: js.Array[String]) = this()
}
