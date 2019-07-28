package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
trait ASPxClientUploadControlFile extends js.Object {
  /**
    * Gets the name of the file selected for uploading.
    * Value: A string value that specifies the file's name.
    */
  var name: String
  /**
    * Gets the size of the file selected for uploading.
    * Value: An Int64 value specifying the file's size, in bytes.
    */
  var size: js.Any
  /**
    * Provides access to the file as a native Javascript object.
    * Value: A JavaScript object that is the file selected for uploading.
    */
  var sourceFileObject: js.Any
}

object ASPxClientUploadControlFile {
  @scala.inline
  def apply(name: String, size: js.Any, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name, size = size, sourceFileObject = sourceFileObject)
  
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
}

