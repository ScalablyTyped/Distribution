package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a file to save to.
  */
trait RichEditFileInfo extends js.Object {
  /**
    * Gets or sets the file's document format.
    * Value: A DocumentFormat enumeration value.
    */
  var documentFormat: js.Any
  /**
    * Gets or sets the file name.
    * Value: A string value specifying the file name.
    */
  var fileName: String
  /**
    * Gets or sets the file's folder name.
    * Value: A string value specifying the folder name.
    */
  var folderPath: String
}

object RichEditFileInfo {
  @scala.inline
  def apply(documentFormat: js.Any, fileName: String, folderPath: String): RichEditFileInfo = {
    val __obj = js.Dynamic.literal(documentFormat = documentFormat, fileName = fileName, folderPath = folderPath)
  
    __obj.asInstanceOf[RichEditFileInfo]
  }
}

