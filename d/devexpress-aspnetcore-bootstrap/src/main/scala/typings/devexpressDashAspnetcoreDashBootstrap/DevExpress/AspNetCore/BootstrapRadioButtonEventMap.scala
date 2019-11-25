package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapRadioButtonEventMap]
  }
}

