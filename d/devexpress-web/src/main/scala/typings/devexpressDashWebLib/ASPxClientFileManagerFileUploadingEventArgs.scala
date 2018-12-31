package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FileUploading event.
  */
trait ASPxClientFileManagerFileUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
  /**
    * Gets the name of a file selected for upload.
    * Value: A string value that specifies the file name.
    */
  var fileName: java.lang.String
  /**
    * Gets the path to the folder where a file is being uploaded.
    * Value: A string value specifying the path where a file is being uploaded.
    */
  var folder: java.lang.String
}

