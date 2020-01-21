package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
@JSGlobal("ASPxClientUploadControlFile")
@js.native
class ASPxClientUploadControlFile () extends js.Object {
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String = js.native
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double = js.native
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any = js.native
}

