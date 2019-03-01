package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapGridBaseEventMap extends ControlEventMap {
  var toolbarItemClick: GridToolbarItemClickEventArgs
}

object BootstrapGridBaseEventMap {
  @scala.inline
  def apply(init: EventArgs, toolbarItemClick: GridToolbarItemClickEventArgs): BootstrapGridBaseEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("toolbarItemClick")(toolbarItemClick)
    __obj.asInstanceOf[BootstrapGridBaseEventMap]
  }
}

