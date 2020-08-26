package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabControlTabClickEventArgs extends TabControlTabCancelEventArgs {
  val htmlElement: js.Object = js.native
  val htmlEvent: js.Object = js.native
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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabControlTabClickEventArgs]
  }
  @scala.inline
  implicit class TabControlTabClickEventArgsOps[Self <: TabControlTabClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtmlElement(value: js.Object): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlEvent(value: js.Object): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
  }
  
}

