package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pins extends js.Object {
  var analogChannel: scala.Double
  var mode: PIN_MODE
  var report: REPORTING
  var state: PIN_STATE | PULLUP_STATE
  var supportedModes: js.Array[PIN_MODE]
  var value: PIN_STATE | scala.Double
}

object Pins {
  @scala.inline
  def apply(
    analogChannel: scala.Double,
    mode: PIN_MODE,
    report: REPORTING,
    state: PIN_STATE | PULLUP_STATE,
    supportedModes: js.Array[PIN_MODE],
    value: PIN_STATE | scala.Double
  ): Pins = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel, mode = mode, report = report, state = state.asInstanceOf[js.Any], supportedModes = supportedModes, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pins]
  }
}

