package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's SaveCommandExecute event.
  */
trait ASPxClientChartDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value specifying whether an event has been handled.
    * Value: true, if the event hasn't been handled by a control; otherwise, false.
    */
  var handled: scala.Boolean
}

object ASPxClientChartDesignerSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean): ASPxClientChartDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.asInstanceOf[ASPxClientChartDesignerSaveCommandExecuteEventArgs]
  }
}

