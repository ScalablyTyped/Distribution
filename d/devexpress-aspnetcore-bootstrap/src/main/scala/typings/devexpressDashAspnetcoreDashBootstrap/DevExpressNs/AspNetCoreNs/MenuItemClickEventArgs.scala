package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    processOnServer: Boolean,
    sender: Control
  ): MenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, item = item, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[MenuItemClickEventArgs]
  }
}

