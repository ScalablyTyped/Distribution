package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapGridBaseEventMap extends ControlEventMap {
  var toolbarItemClick: GridToolbarItemClickEventArgs
}

object BootstrapGridBaseEventMap {
  @scala.inline
  def apply(init: EventArgs, toolbarItemClick: GridToolbarItemClickEventArgs): BootstrapGridBaseEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridBaseEventMap]
  }
}

