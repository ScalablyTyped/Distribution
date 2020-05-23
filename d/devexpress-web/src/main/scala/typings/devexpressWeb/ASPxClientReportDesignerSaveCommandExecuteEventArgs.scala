package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.SaveCommandExecute event.
  */
trait ASPxClientReportDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean
}

object ASPxClientReportDesignerSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: Boolean): ASPxClientReportDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerSaveCommandExecuteEventArgs]
  }
}

