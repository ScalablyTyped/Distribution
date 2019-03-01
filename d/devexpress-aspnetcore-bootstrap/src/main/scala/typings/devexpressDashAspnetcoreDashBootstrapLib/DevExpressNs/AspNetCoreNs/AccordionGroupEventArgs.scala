package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionGroupEventArgs extends EventArgs {
  val group: BootstrapAccordionGroup
}

object AccordionGroupEventArgs {
  @scala.inline
  def apply(group: BootstrapAccordionGroup, sender: Control): AccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AccordionGroupEventArgs]
  }
}

