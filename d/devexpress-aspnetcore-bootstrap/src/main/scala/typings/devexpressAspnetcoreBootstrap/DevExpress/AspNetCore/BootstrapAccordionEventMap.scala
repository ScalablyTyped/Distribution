package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapAccordionEventMap extends ControlEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var expandedChanged: AccordionGroupEventArgs = js.native
  var expandedChanging: AccordionGroupCancelEventArgs = js.native
  var headerClick: AccordionGroupClickEventArgs = js.native
  var itemClick: AccordionItemEventArgs = js.native
}

object BootstrapAccordionEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: AccordionGroupEventArgs,
    expandedChanging: AccordionGroupCancelEventArgs,
    headerClick: AccordionGroupClickEventArgs,
    init: EventArgs,
    itemClick: AccordionItemEventArgs
  ): BootstrapAccordionEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], expandedChanging = expandedChanging.asInstanceOf[js.Any], headerClick = headerClick.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapAccordionEventMap]
  }
  @scala.inline
  implicit class BootstrapAccordionEventMapOps[Self <: BootstrapAccordionEventMap] (val x: Self) extends AnyVal {
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
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanged(value: AccordionGroupEventArgs): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanging(value: AccordionGroupCancelEventArgs): Self = this.set("expandedChanging", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderClick(value: AccordionGroupClickEventArgs): Self = this.set("headerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemClick(value: AccordionItemEventArgs): Self = this.set("itemClick", value.asInstanceOf[js.Any])
  }
  
}

