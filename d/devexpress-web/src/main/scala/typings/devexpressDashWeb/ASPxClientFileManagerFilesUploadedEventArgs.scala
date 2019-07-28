package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FilesUploaded event.
  */
trait ASPxClientFileManagerFilesUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of uploaded file names.
    * Value: An array of string values that are the file names.
    */
  var fileNames: js.Array[String]
  /**
    * Gets the path to the folder where files are uploaded.
    * Value: A string value specifying the uploaded files path.
    */
  var folder: String
}

object ASPxClientFileManagerFilesUploadedEventArgs {
  @scala.inline
  def apply(fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileNames = fileNames, folder = folder)
  
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadedEventArgs]
  }
}

