package typings
package devexpressDashWebLib

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
  var Result: java.lang.String
}

object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: java.lang.String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
}

