package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemEventArgs extends EventArgs {
  val item: BootstrapMenuItem
}

object MenuItemEventArgs {
  @scala.inline
  def apply(item: BootstrapMenuItem, sender: Control): MenuItemEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[MenuItemEventArgs]
  }
}

