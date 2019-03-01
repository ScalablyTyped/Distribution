package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemClickEventArgs extends ProcessingModeEventArgs {
  val htmlElement: js.Object
  val htmlEvent: js.Object
  val item: BootstrapMenuItem
}

object MenuItemClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: BootstrapMenuItem,
    processOnServer: scala.Boolean,
    sender: Control
  ): MenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[MenuItemClickEventArgs]
  }
}

