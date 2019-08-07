package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
@JSGlobal("ASPxClientFileManagerFileDownloadingEventArgs")
@js.native
class ASPxClientFileManagerFileDownloadingEventArgs protected () extends ASPxClientFileManagerFileEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileDownloadingEventArgs object.
    * @param file An ASPxClientFileManagerFile object that is the file currently being processed.
    */
  def this(file: ASPxClientFileManagerFile) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean = js.native
}

