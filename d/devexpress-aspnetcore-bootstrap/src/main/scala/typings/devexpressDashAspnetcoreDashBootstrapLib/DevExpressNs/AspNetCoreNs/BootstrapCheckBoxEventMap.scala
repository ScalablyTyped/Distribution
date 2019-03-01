package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapCheckBoxEventMap extends BootstrapClientEditEventMap {
  var checkedChanged: ProcessingModeEventArgs
}

object BootstrapCheckBoxEventMap {
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapCheckBoxEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkedChanged")(checkedChanged)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapCheckBoxEventMap]
  }
}

