package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
trait Options extends js.Object {
  var analogPins: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var pins: js.UndefOr[js.Array[Pins]] = js.undefined
  var reportVersionTimeout: js.UndefOr[scala.Double] = js.undefined
  var samplingInterval: js.UndefOr[scala.Double] = js.undefined
  var serialport: js.UndefOr[Options] = js.undefined
  var skipCapabilities: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    analogPins: js.Array[scala.Double] = null,
    pins: js.Array[Pins] = null,
    reportVersionTimeout: scala.Int | scala.Double = null,
    samplingInterval: scala.Int | scala.Double = null,
    serialport: Options = null,
    skipCapabilities: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (analogPins != null) __obj.updateDynamic("analogPins")(analogPins)
    if (pins != null) __obj.updateDynamic("pins")(pins)
    if (reportVersionTimeout != null) __obj.updateDynamic("reportVersionTimeout")(reportVersionTimeout.asInstanceOf[js.Any])
    if (samplingInterval != null) __obj.updateDynamic("samplingInterval")(samplingInterval.asInstanceOf[js.Any])
    if (serialport != null) __obj.updateDynamic("serialport")(serialport)
    if (!js.isUndefined(skipCapabilities)) __obj.updateDynamic("skipCapabilities")(skipCapabilities)
    __obj.asInstanceOf[Options]
  }
}

