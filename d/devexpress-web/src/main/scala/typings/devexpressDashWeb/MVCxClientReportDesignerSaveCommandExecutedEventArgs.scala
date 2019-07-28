package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SaveCommandExecuted event.
  */
trait MVCxClientReportDesignerSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the operation result.
    * Value: A String value, specifying the operation result.
    */
  var Result: String
}

object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result)
  
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
}

