package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectedFileOpened event.
  */
trait ASPxClientFileManagerFileOpenedEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    * Value: true to process the event on the server side; false to completely handle it on the client side.
    */
  var processOnServer: scala.Boolean
}

object ASPxClientFileManagerFileOpenedEventArgs {
  @scala.inline
  def apply(file: ASPxClientFileManagerFile, processOnServer: scala.Boolean): ASPxClientFileManagerFileOpenedEventArgs = {
    val __obj = js.Dynamic.literal(file = file, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientFileManagerFileOpenedEventArgs]
  }
}

