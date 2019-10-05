package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionItemEventArgs extends ProcessingModeEventArgs {
  val htmlElement: js.Object
  val htmlEvent: js.Object
  val item: BootstrapAccordionItem
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
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, item = item, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[AccordionItemEventArgs]
  }
}

