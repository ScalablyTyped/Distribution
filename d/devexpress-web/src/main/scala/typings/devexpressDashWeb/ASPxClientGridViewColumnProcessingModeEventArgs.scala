package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events  concerned with column processing, and that allow the event's processing to be passed to the server side.
  */
trait ASPxClientGridViewColumnProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets a grid column related to the event.
    * Value: An ASPxClientGridViewColumn object representing the column related to the event.
    */
  var column: ASPxClientGridViewColumn
}

object ASPxClientGridViewColumnProcessingModeEventArgs {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, processOnServer: Boolean): ASPxClientGridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientGridViewColumnProcessingModeEventArgs]
  }
}

