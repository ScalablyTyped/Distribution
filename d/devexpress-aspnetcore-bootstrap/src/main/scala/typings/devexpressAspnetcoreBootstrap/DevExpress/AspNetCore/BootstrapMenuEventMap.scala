package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenuEventMap extends ControlEventMap {
  var closeUp: MenuItemEventArgs
  var itemClick: MenuItemClickEventArgs
  var itemMouseOut: MenuItemMouseEventArgs
  var itemMouseOver: MenuItemMouseEventArgs
  var popUp: MenuItemEventArgs
}

object BootstrapMenuEventMap {
  @scala.inline
  def apply(
    closeUp: MenuItemEventArgs,
    init: EventArgs,
    itemClick: MenuItemClickEventArgs,
    itemMouseOut: MenuItemMouseEventArgs,
    itemMouseOver: MenuItemMouseEventArgs,
    popUp: MenuItemEventArgs
  ): BootstrapMenuEventMap = {
    val __obj = js.Dynamic.literal(closeUp = closeUp.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any], itemMouseOut = itemMouseOut.asInstanceOf[js.Any], itemMouseOver = itemMouseOver.asInstanceOf[js.Any], popUp = popUp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapMenuEventMap]
  }
}

