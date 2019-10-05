package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewContextMenuEventArgs extends EventArgs {
  val htmlEvent: js.Any
  val index: Double
  val menu: js.Any
  val objectType: String
  var showBrowserMenu: Boolean
}

object GridViewContextMenuEventArgs {
  @scala.inline
  def apply(
    htmlEvent: js.Any,
    index: Double,
    menu: js.Any,
    objectType: String,
    sender: Control,
    showBrowserMenu: Boolean
  ): GridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent, index = index, menu = menu, objectType = objectType, sender = sender, showBrowserMenu = showBrowserMenu)
  
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
}

