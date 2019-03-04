package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewContextMenuEventArgs extends EventArgs {
  val htmlEvent: js.Any
  val index: scala.Double
  val menu: js.Any
  val objectType: java.lang.String
  var showBrowserMenu: scala.Boolean
}

object GridViewContextMenuEventArgs {
  @scala.inline
  def apply(
    htmlEvent: js.Any,
    index: scala.Double,
    menu: js.Any,
    objectType: java.lang.String,
    sender: Control,
    showBrowserMenu: scala.Boolean
  ): GridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent, index = index, menu = menu, objectType = objectType, sender = sender, showBrowserMenu = showBrowserMenu)
  
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
}

