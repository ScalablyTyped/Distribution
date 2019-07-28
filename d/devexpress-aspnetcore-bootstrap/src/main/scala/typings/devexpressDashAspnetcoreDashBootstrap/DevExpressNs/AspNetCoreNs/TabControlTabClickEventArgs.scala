package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabControlTabClickEventArgs extends TabControlTabCancelEventArgs {
  val htmlElement: js.Object
  val htmlEvent: js.Object
}

object TabControlTabClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    sender: Control,
    tab: BootstrapTab
  ): TabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer, reloadContentOnCallback = reloadContentOnCallback, sender = sender, tab = tab)
  
    __obj.asInstanceOf[TabControlTabClickEventArgs]
  }
}

