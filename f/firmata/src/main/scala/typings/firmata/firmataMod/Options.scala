package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
trait Options extends js.Object {
  var analogPins: js.UndefOr[js.Array[Double]] = js.undefined
  var pins: js.UndefOr[js.Array[Pins]] = js.undefined
  var reportVersionTimeout: js.UndefOr[Double] = js.undefined
  var samplingInterval: js.UndefOr[Double] = js.undefined
  var serialport: js.UndefOr[Options] = js.undefined
  var skipCapabilities: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    analogPins: js.Array[Double] = null,
    pins: js.Array[Pins] = null,
    reportVersionTimeout: Int | Double = null,
    samplingInterval: Int | Double = null,
    serialport: Options = null,
    skipCapabilities: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (analogPins != null) __obj.updateDynamic("analogPins")(analogPins.asInstanceOf[js.Any])
    if (pins != null) __obj.updateDynamic("pins")(pins.asInstanceOf[js.Any])
    if (reportVersionTimeout != null) __obj.updateDynamic("reportVersionTimeout")(reportVersionTimeout.asInstanceOf[js.Any])
    if (samplingInterval != null) __obj.updateDynamic("samplingInterval")(samplingInterval.asInstanceOf[js.Any])
    if (serialport != null) __obj.updateDynamic("serialport")(serialport.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCapabilities)) __obj.updateDynamic("skipCapabilities")(skipCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

