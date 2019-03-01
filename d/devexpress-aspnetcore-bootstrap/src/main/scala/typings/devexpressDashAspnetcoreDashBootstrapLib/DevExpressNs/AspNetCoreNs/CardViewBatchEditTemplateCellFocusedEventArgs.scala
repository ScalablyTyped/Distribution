package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  val column: BootstrapCardViewColumn
  var handled: scala.Boolean
}

object CardViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: BootstrapCardViewColumn, handled: scala.Boolean, sender: Control): CardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[CardViewBatchEditTemplateCellFocusedEventArgs]
  }
}

