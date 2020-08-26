package typings.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pins extends js.Object {
  var analogChannel: Double = js.native
  var mode: PIN_MODE = js.native
  var report: REPORTING = js.native
  var state: PIN_STATE | PULLUP_STATE = js.native
  var supportedModes: js.Array[PIN_MODE] = js.native
  var value: PIN_STATE | Double = js.native
}

object Pins {
  @scala.inline
  def apply(
    analogChannel: Double,
    mode: PIN_MODE,
    report: REPORTING,
    state: PIN_STATE | PULLUP_STATE,
    supportedModes: js.Array[PIN_MODE],
    value: PIN_STATE | Double
  ): Pins = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pins]
  }
  @scala.inline
  implicit class PinsOps[Self <: Pins] (val x: Self) extends AnyVal {
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
    def setAnalogChannel(value: Double): Self = this.set("analogChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: PIN_MODE): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: REPORTING): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: PIN_STATE | PULLUP_STATE): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModesVarargs(value: PIN_MODE*): Self = this.set("supportedModes", js.Array(value :_*))
    @scala.inline
    def setSupportedModes(value: js.Array[PIN_MODE]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: PIN_STATE | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

