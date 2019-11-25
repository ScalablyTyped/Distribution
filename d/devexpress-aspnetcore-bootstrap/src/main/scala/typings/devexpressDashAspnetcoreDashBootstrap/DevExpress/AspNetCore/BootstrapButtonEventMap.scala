package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapButtonEventMap extends ControlEventMap {
  var checkedChanged: ProcessingModeEventArgs
  var click: ButtonClickEventArgs
  var gotFocus: EventArgs
  var lostFocus: EventArgs
}

object BootstrapButtonEventMap {
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    click: ButtonClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs
  ): BootstrapButtonEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapButtonEventMap]
  }
}

