package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapClientEditEventMap]
  }
}

