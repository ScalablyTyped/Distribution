package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a file to save to.
  */
trait RichEditFileInfo extends js.Object {
  /**
    * Gets or sets the file's document format.
    */
  var documentFormat: DocumentFormat
  /**
    * Gets or sets the file name.
    */
  var fileName: String
  /**
    * Gets or sets the file's folder name.
    */
  var folderPath: String
}

object RichEditFileInfo {
  @scala.inline
  def apply(documentFormat: DocumentFormat, fileName: String, folderPath: String): RichEditFileInfo = {
    val __obj = js.Dynamic.literal(documentFormat = documentFormat.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditFileInfo]
  }
}

