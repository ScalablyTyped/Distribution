package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellTower extends js.Object {
  /** The number of milliseconds since this cell was primary. If age is 0, the `cellId` represents a current measurement. */
  var age: js.UndefOr[scala.Double] = js.undefined
  /**
       * Unique identifier of the cell.
       * On GSM, this is the Cell ID (CID);
       * CDMA networks use the Base Station ID (BID).
       * WCDMA networks use the UTRAN/GERAN Cell Identity (UC-Id), which is a 32-bit value concatenating the Radio Network Controller (RNC)
       * and Cell ID. Specifying only the 16-bit Cell ID value in WCDMA networks may return inaccurate results.
       */
  var cellId: scala.Double
  /** The Location Area Code (LAC) for GSM and WCDMA networks. The Network ID (NID) for CDMA networks. */
  var locationAreaCode: scala.Double
  /** The cell tower's Mobile Country Code (MCC). */
  var mobileCountryCode: scala.Double
  /** The cell tower's Mobile Network Code. This is the MNC for GSM and WCDMA; CDMA uses the System ID (SID). */
  var mobileNetworkCode: scala.Double
  /** Radio signal strength measured in dBm. */
  var signalStrength: js.UndefOr[scala.Double] = js.undefined
  /** The [timing advance](https://en.wikipedia.org/wiki/Timing_advance) value. */
  var timingAdvance: js.UndefOr[scala.Double] = js.undefined
}

