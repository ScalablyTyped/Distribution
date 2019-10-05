package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemClickedEventArgs extends EventArgs {
  var handled: Boolean
  val itemName: String
}

object MenuItemClickedEventArgs {
  @scala.inline
  def apply(handled: Boolean, itemName: String, sender: Control): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, itemName = itemName, sender = sender)
  
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
}

