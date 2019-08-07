package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events  concerned with column processing, and that allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientGridViewColumnProcessingModeEventArgs")
@js.native
class ASPxClientGridViewColumnProcessingModeEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewColumnProcessingModeEventArgs class with the specified setting.
    * @param column A ASPxClientGridViewColumn object representing the column related to the event.
    */
  def this(column: ASPxClientGridViewColumn) = this()
  /**
    * Gets a grid column related to the event.
    */
  var column: ASPxClientGridViewColumn = js.native
}

