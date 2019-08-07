package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploaded event.
  */
@JSGlobal("ASPxClientFileManagerFileUploadedEventArgs")
@js.native
class ASPxClientFileManagerFileUploadedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileUploadedEventArgs object with the specified parameters.
    * @param folder A string value specifying the uploaded file path.
    * @param fileName A  string value that specifies the file name.
    */
  def this(folder: String, fileName: String) = this()
  /**
    * Gets the name of the uploaded file.
    */
  var fileName: String = js.native
  /**
    * Gets the path to the folder where a file is uploaded.
    */
  var folder: String = js.native
}

