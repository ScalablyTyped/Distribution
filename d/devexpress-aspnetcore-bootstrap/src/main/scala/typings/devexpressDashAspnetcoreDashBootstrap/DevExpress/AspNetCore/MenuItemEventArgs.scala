package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemEventArgs extends EventArgs {
  val item: BootstrapMenuItem
}

object MenuItemEventArgs {
  @scala.inline
  def apply(item: BootstrapMenuItem, sender: Control): MenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuItemEventArgs]
  }
}

