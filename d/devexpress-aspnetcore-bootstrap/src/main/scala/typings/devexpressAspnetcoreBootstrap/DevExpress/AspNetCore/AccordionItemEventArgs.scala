package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionItemEventArgs extends ProcessingModeEventArgs {
  val htmlElement: js.Object = js.native
  val htmlEvent: js.Object = js.native
  val item: BootstrapAccordionItem = js.native
}

object AccordionItemEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: BootstrapAccordionItem,
    processOnServer: Boolean,
    sender: Control
  ): AccordionItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionItemEventArgs]
  }
  @scala.inline
  implicit class AccordionItemEventArgsOps[Self <: AccordionItemEventArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setItem(value: BootstrapAccordionItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

