package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapClientEditEventMap extends ControlEventMap {
  var gotFocus: EventArgs
  var lostFocus: EventArgs
  var validation: EditValidationEventArgs
  var valueChanged: ProcessingModeEventArgs
}

object BootstrapClientEditEventMap {
  @scala.inline
  def apply(
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapClientEditEventMap = {
    val __obj = js.Dynamic.literal(gotFocus = gotFocus, init = init, lostFocus = lostFocus, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapClientEditEventMap]
  }
}

