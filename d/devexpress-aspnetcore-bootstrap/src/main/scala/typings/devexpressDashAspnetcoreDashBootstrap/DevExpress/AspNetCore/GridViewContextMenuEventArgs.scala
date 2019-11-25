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
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
}

