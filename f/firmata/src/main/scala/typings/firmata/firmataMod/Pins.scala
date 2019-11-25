package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pins extends js.Object {
  var analogChannel: Double
  var mode: PIN_MODE
  var report: REPORTING
  var state: PIN_STATE | PULLUP_STATE
  var supportedModes: js.Array[PIN_MODE]
  var value: PIN_STATE | Double
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
}

