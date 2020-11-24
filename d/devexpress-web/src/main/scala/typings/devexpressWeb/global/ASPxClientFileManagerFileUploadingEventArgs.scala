package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
@JSGlobal("ASPxClientFileManagerFileUploadingEventArgs")
@js.native
class ASPxClientFileManagerFileUploadingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerFileUploadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileUploadingEventArgs object with the specified parameters.
    * @param folder A string value specifying the path to which the file is being uploaded.
    * @param fileName A string value that specifies the file name.
    */
  def this(folder: String, fileName: String) = this()
}
