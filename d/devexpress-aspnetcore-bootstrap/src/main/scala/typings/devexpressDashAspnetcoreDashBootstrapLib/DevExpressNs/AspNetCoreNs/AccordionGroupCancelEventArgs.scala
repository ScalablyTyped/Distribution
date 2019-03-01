package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionGroupCancelEventArgs extends ProcessingModeCancelEventArgs {
  val group: BootstrapAccordionGroup
}

object AccordionGroupCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    group: BootstrapAccordionGroup,
    processOnServer: scala.Boolean,
    sender: Control
  ): AccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AccordionGroupCancelEventArgs]
  }
}

