package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
trait ASPxClientUploadControlFile extends js.Object {
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any
}

object ASPxClientUploadControlFile {
  @scala.inline
  def apply(name: String, size: Double, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceFileObject = sourceFileObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
}

