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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("menu")(menu)
    __obj.updateDynamic("objectType")(objectType)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("showBrowserMenu")(showBrowserMenu)
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
}

