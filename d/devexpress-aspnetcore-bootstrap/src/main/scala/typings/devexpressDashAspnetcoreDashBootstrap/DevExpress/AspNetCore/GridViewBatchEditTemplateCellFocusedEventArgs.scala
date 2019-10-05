package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  val column: BootstrapGridViewColumn
  var handled: Boolean
}

object GridViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, handled: Boolean, sender: Control): GridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column, handled = handled, sender = sender)
  
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
}

