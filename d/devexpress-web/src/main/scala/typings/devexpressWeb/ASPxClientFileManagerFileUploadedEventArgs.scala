package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploaded event.
  */
trait ASPxClientFileManagerFileUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the uploaded file.
    */
  var fileName: String
  /**
    * Gets the path to the folder where a file is uploaded.
    */
  var folder: String
}

object ASPxClientFileManagerFileUploadedEventArgs {
  @scala.inline
  def apply(fileName: String, folder: String): ASPxClientFileManagerFileUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadedEventArgs]
  }
}

