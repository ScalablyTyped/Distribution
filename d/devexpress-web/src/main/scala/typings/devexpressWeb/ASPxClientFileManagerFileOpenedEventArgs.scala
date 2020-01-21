package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectedFileOpened event.
  */
@JSGlobal("ASPxClientFileManagerFileOpenedEventArgs")
@js.native
class ASPxClientFileManagerFileOpenedEventArgs protected () extends ASPxClientFileManagerFileEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileOpenedEventArgs class.
    * @param file An ASPxClientFileManagerFile object is the file related to the event.
    */
  def this(file: ASPxClientFileManagerFile) = this()
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean = js.native
}

