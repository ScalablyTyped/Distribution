package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectedFileOpened events.
  */
trait ASPxClientFileManagerFileEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a file related to the event.
    * Value: An ASPxClientFileManagerFile object that represents a file currently being processed.
    */
  var file: ASPxClientFileManagerFile
}

object ASPxClientFileManagerFileEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile): ASPxClientFileManagerFileEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[ASPxClientFileManagerFileEventArgs]
  }
}

