package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveViewChangingEventArgs extends EventArgs {
  var cancel: scala.Boolean
  val newView: BootstrapSchedulerViewType
  val oldView: BootstrapSchedulerViewType
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    newView: BootstrapSchedulerViewType,
    oldView: BootstrapSchedulerViewType,
    sender: Control
  ): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("newView")(newView)
    __obj.updateDynamic("oldView")(oldView)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
}

