package typings
package firmataLib.firmataMod.BoardNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analogChannel")(analogChannel)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("report")(report)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("supportedModes")(supportedModes)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pins]
  }
}

