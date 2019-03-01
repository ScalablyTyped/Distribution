package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewRowCancelEventArgs extends CancelEventArgs {
  val visibleIndex: scala.Double
}

object GridViewRowCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, sender: Control, visibleIndex: scala.Double): GridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[GridViewRowCancelEventArgs]
  }
}

