package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FilesUploaded event.
  */
trait ASPxClientFileManagerFilesUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of uploaded file names.
    */
  var fileNames: js.Array[String]
  /**
    * Gets the path to the folder where files are uploaded.
    */
  var folder: String
}

object ASPxClientFileManagerFilesUploadedEventArgs {
  @scala.inline
  def apply(fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadedEventArgs]
  }
}

