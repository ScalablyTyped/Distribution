package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events  concerned with column processing, and that allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientGridViewColumnProcessingModeEventArgs")
@js.native
class ASPxClientGridViewColumnProcessingModeEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewColumnProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewColumnProcessingModeEventArgs class with the specified setting.
    * @param column A ASPxClientGridViewColumn object representing the column related to the event.
    */
  def this(column: typings.devexpressWeb.ASPxClientGridViewColumn) = this()
  /**
    * Gets a grid column related to the event.
    */
  /* CompleteClass */
  override var column: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

