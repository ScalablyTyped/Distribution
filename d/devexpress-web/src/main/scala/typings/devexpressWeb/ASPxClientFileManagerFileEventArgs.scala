package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
@JSGlobal("ASPxClientFileManagerFileEventArgs")
@js.native
class ASPxClientFileManagerFileEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileEventArgs class.
    * @param file An ASPxClientFileManagerFile object representing the file related to the event.
    */
  def this(file: ASPxClientFileManagerFile) = this()
  /**
    * Gets a file related to the event.
    */
  var file: ASPxClientFileManagerFile = js.native
}

