package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapRadioButtonEventMap extends BootstrapClientEditEventMap {
  var checkedChanged: ProcessingModeEventArgs
}

object BootstrapRadioButtonEventMap {
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapRadioButtonEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged, gotFocus = gotFocus, init = init, lostFocus = lostFocus, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapRadioButtonEventMap]
  }
}

