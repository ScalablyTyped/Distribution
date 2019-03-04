package typings
package devexpressDashWebLib

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
  var fileName: java.lang.String
  /**
    * Gets or sets the file's folder name.
    * Value: A string value specifying the folder name.
    */
  var folderPath: java.lang.String
}

object RichEditFileInfo {
  @scala.inline
  def apply(documentFormat: js.Any, fileName: java.lang.String, folderPath: java.lang.String): RichEditFileInfo = {
    val __obj = js.Dynamic.literal(documentFormat = documentFormat, fileName = fileName, folderPath = folderPath)
  
    __obj.asInstanceOf[RichEditFileInfo]
  }
}

