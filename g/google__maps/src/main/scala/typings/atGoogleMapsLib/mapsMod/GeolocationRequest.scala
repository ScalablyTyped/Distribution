package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeolocationRequest extends js.Object {
  /** The carrier name. */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** An array of cell tower objects. */
  var cellTowers: js.UndefOr[js.Array[CellTower]] = js.undefined
  /**
       * Specifies whether to fall back to IP geolocation if wifi and cell tower signals are not available.
       * Defaults to `true`. Set `considerIp` to `false` to disable fall back.
       */
  var considerIp: js.UndefOr[scala.Boolean] = js.undefined
  /** The mobile country code (MCC) for the device's home network. */
  var homeMobileCountryCode: js.UndefOr[scala.Double] = js.undefined
  /** The mobile network code (MNC) for the device's home network. */
  var homeMobileNetworkCode: js.UndefOr[scala.Double] = js.undefined
  /** The mobile radio type. While this field is optional, it should be included if a value is available, for more accurate results. */
  var radioType: js.UndefOr[RadioType] = js.undefined
  /** An array of WiFi access point objects. */
  var wifiAccessPoints: js.UndefOr[js.Array[WifiAccessPoint]] = js.undefined
}

