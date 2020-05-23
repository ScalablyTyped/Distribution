package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileOpened event.
  */
trait ASPxClientFileManagerFileOpenedEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean
}

object ASPxClientFileManagerFileOpenedEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile, processOnServer: Boolean): ASPxClientFileManagerFileOpenedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileOpenedEventArgs]
  }
}

