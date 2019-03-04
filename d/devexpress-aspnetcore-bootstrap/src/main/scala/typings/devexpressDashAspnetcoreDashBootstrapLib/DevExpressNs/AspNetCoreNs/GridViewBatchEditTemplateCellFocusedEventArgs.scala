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
    val __obj = js.Dynamic.literal(column = column, handled = handled, sender = sender)
  
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
}

