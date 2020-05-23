package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientChartDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  var handled: Boolean
}

object ASPxClientChartDesignerSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: Boolean): ASPxClientChartDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerSaveCommandExecuteEventArgs]
  }
}

