package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapCheckBoxEventMap extends BootstrapClientEditEventMap {
  var checkedChanged: ProcessingModeEventArgs = js.native
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
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCheckBoxEventMap]
  }
  @scala.inline
  implicit class BootstrapCheckBoxEventMapOps[Self <: BootstrapCheckBoxEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckedChanged(value: ProcessingModeEventArgs): Self = this.set("checkedChanged", value.asInstanceOf[js.Any])
  }
  
}

