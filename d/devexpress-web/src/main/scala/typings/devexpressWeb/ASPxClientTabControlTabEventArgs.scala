package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on tabs.
  */
@js.native
trait ASPxClientTabControlTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab = js.native
}

object ASPxClientTabControlTabEventArgs {
  @scala.inline
  def apply(tab: ASPxClientTab): ASPxClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTabControlTabEventArgsOps[Self <: ASPxClientTabControlTabEventArgs] (val x: Self) extends AnyVal {
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
    def setTab(value: ASPxClientTab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

