package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  val column: BootstrapCardViewColumn
  var handled: Boolean
}

object CardViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: BootstrapCardViewColumn, handled: Boolean, sender: Control): CardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CardViewBatchEditTemplateCellFocusedEventArgs]
  }
}

