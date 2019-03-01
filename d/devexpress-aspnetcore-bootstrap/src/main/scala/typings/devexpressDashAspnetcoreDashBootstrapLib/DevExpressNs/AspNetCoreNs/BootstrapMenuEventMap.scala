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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeUp")(closeUp)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("itemClick")(itemClick)
    __obj.updateDynamic("itemMouseOut")(itemMouseOut)
    __obj.updateDynamic("itemMouseOver")(itemMouseOver)
    __obj.updateDynamic("popUp")(popUp)
    __obj.asInstanceOf[BootstrapMenuEventMap]
  }
}

