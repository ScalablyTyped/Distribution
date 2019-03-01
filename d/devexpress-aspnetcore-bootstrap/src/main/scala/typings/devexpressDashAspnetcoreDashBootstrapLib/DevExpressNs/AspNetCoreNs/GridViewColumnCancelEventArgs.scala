package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnCancelEventArgs extends CancelEventArgs {
  val column: BootstrapGridViewColumn
}

object GridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, column: BootstrapGridViewColumn, sender: Control): GridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[GridViewColumnCancelEventArgs]
  }
}

