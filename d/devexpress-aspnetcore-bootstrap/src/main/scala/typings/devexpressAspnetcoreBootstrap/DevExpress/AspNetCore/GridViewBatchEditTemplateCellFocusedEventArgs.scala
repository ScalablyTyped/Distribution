package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
}

