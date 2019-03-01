package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  val column: BootstrapGridViewColumn
  var handled: scala.Boolean
}

object GridViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, handled: scala.Boolean, sender: Control): GridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
}

