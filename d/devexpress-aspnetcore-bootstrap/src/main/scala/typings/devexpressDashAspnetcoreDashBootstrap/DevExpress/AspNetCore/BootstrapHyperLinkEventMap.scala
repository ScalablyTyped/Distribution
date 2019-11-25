package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapHyperLinkEventMap extends ControlEventMap {
  var click: EditClickEventArgs
}

object BootstrapHyperLinkEventMap {
  @scala.inline
  def apply(click: EditClickEventArgs, init: EventArgs): BootstrapHyperLinkEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapHyperLinkEventMap]
  }
}

