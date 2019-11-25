package typings.atGoogleMaps.atGoogleMapsMod

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
    age: Int | Double = null,
    channel: Int | Double = null,
    signalStrength: Int | Double = null,
    signalToNoiseRatio: Int | Double = null
  ): WifiAccessPoint = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (signalStrength != null) __obj.updateDynamic("signalStrength")(signalStrength.asInstanceOf[js.Any])
    if (signalToNoiseRatio != null) __obj.updateDynamic("signalToNoiseRatio")(signalToNoiseRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiAccessPoint]
  }
}

