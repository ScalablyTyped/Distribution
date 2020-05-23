package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
@JSGlobal("ASPxClientFileManagerFileUploadingEventArgs")
@js.native
class ASPxClientFileManagerFileUploadingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerFileUploadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileUploadingEventArgs object with the specified parameters.
    * @param folder A string value specifying the path to which the file is being uploaded.
    * @param fileName A string value that specifies the file name.
    */
  def this(folder: String, fileName: String) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the name of a file selected for upload.
    */
  /* CompleteClass */
  override var fileName: String = js.native
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  /* CompleteClass */
  override var folder: String = js.native
}

