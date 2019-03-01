package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClickEventArgs extends EventArgs {
  val htmlElement: js.Object
  val interval: BootstrapTimeInterval
  val resource: java.lang.String
}

object CellClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    interval: BootstrapTimeInterval,
    resource: java.lang.String,
    sender: Control
  ): CellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[CellClickEventArgs]
  }
}

