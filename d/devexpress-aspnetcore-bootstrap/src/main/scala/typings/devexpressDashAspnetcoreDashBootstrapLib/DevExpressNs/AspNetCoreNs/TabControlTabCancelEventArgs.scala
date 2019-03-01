package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabControlTabCancelEventArgs extends ProcessingModeCancelEventArgs {
  var reloadContentOnCallback: scala.Boolean
  val tab: BootstrapTab
}

object TabControlTabCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    processOnServer: scala.Boolean,
    reloadContentOnCallback: scala.Boolean,
    sender: Control,
    tab: BootstrapTab
  ): TabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("reloadContentOnCallback")(reloadContentOnCallback)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[TabControlTabCancelEventArgs]
  }
}

