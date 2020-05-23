package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
@JSGlobal("ASPxClientFileManagerFileEventArgs")
@js.native
class ASPxClientFileManagerFileEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerFileEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileEventArgs class.
    * @param file An ASPxClientFileManagerFile object representing the file related to the event.
    */
  def this(file: typings.devexpressWeb.ASPxClientFileManagerFile) = this()
  /**
    * Gets a file related to the event.
    */
  /* CompleteClass */
  override var file: typings.devexpressWeb.ASPxClientFileManagerFile = js.native
}

