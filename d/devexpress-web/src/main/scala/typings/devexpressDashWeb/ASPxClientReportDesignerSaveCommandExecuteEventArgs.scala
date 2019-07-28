package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SaveCommandExecute event.
  */
trait ASPxClientReportDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: Boolean
}

object ASPxClientReportDesignerSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: Boolean): ASPxClientReportDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled)
  
    __obj.asInstanceOf[ASPxClientReportDesignerSaveCommandExecuteEventArgs]
  }
}

