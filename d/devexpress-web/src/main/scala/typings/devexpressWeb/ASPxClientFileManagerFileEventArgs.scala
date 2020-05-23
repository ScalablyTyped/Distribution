package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
trait ASPxClientFileManagerFileEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a file related to the event.
    */
  var file: ASPxClientFileManagerFile
}

object ASPxClientFileManagerFileEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile): ASPxClientFileManagerFileEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileEventArgs]
  }
}

