package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(closeUp = closeUp, init = init, itemClick = itemClick, itemMouseOut = itemMouseOut, itemMouseOver = itemMouseOver, popUp = popUp)
  
    __obj.asInstanceOf[BootstrapMenuEventMap]
  }
}

