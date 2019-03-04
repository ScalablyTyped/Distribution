package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged, click = click, gotFocus = gotFocus, init = init, lostFocus = lostFocus)
  
    __obj.asInstanceOf[BootstrapButtonEventMap]
  }
}

