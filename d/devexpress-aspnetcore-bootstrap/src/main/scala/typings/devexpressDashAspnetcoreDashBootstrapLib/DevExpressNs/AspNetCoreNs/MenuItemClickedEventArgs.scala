package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemClickedEventArgs extends EventArgs {
  var handled: scala.Boolean
  val itemName: java.lang.String
}

object MenuItemClickedEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, itemName: java.lang.String, sender: Control): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, itemName = itemName, sender = sender)
  
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
}

