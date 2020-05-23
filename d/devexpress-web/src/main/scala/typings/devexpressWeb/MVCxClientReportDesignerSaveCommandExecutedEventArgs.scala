package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
trait MVCxClientReportDesignerSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the operation result.
    */
  var Result: String
}

object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
}

