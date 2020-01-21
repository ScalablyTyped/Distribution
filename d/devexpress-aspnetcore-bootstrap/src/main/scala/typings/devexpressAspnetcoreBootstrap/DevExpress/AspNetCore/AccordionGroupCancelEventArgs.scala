package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionGroupCancelEventArgs extends ProcessingModeCancelEventArgs {
  val group: BootstrapAccordionGroup
}

object AccordionGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, group: BootstrapAccordionGroup, processOnServer: Boolean, sender: Control): AccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccordionGroupCancelEventArgs]
  }
}

