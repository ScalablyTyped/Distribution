package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabControlTabCancelEventArgs extends ProcessingModeCancelEventArgs {
  var reloadContentOnCallback: Boolean
  val tab: BootstrapTab
}

object TabControlTabCancelEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    sender: Control,
    tab: BootstrapTab
  ): TabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, processOnServer = processOnServer, reloadContentOnCallback = reloadContentOnCallback, sender = sender, tab = tab)
  
    __obj.asInstanceOf[TabControlTabCancelEventArgs]
  }
}

