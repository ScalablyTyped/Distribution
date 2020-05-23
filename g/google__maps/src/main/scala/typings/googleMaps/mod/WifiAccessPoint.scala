package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WifiAccessPoint extends js.Object {
  /** The number of milliseconds since this access point was detected. */
  var age: js.UndefOr[Double] = js.undefined
  /** The channel over which the client is communicating with the acces. */
  var channel: js.UndefOr[Double] = js.undefined
  /** The MAC address of the WiFi node. It's typically called a BSS, BSSID or MAC address. Separators must be `:` (colon). */
  var macAddress: String
  /** The current signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.undefined
  /** The current signal to noise ratio measured in dB. */
  var signalToNoiseRatio: js.UndefOr[Double] = js.undefined
}

object WifiAccessPoint {
  @scala.inline
  def apply(
    macAddress: String,
    age: js.UndefOr[Double] = js.undefined,
    channel: js.UndefOr[Double] = js.undefined,
    signalStrength: js.UndefOr[Double] = js.undefined,
    signalToNoiseRatio: js.UndefOr[Double] = js.undefined
  ): WifiAccessPoint = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(age)) __obj.updateDynamic("age")(age.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signalStrength)) __obj.updateDynamic("signalStrength")(signalStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signalToNoiseRatio)) __obj.updateDynamic("signalToNoiseRatio")(signalToNoiseRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiAccessPoint]
  }
}

