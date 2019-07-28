package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTower extends js.Object {
  /** The number of milliseconds since this cell was primary. If age is 0, the `cellId` represents a current measurement. */
  var age: js.UndefOr[Double] = js.undefined
  /**
    * Unique identifier of the cell.
    * On GSM, this is the Cell ID (CID);
    * CDMA networks use the Base Station ID (BID).
    * WCDMA networks use the UTRAN/GERAN Cell Identity (UC-Id), which is a 32-bit value concatenating the Radio Network Controller (RNC)
    * and Cell ID. Specifying only the 16-bit Cell ID value in WCDMA networks may return inaccurate results.
    */
  var cellId: Double
  /** The Location Area Code (LAC) for GSM and WCDMA networks. The Network ID (NID) for CDMA networks. */
  var locationAreaCode: Double
  /** The cell tower's Mobile Country Code (MCC). */
  var mobileCountryCode: Double
  /** The cell tower's Mobile Network Code. This is the MNC for GSM and WCDMA; CDMA uses the System ID (SID). */
  var mobileNetworkCode: Double
  /** Radio signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.undefined
  /** The [timing advance](https://en.wikipedia.org/wiki/Timing_advance) value. */
  var timingAdvance: js.UndefOr[Double] = js.undefined
}

object CellTower {
  @scala.inline
  def apply(
    cellId: Double,
    locationAreaCode: Double,
    mobileCountryCode: Double,
    mobileNetworkCode: Double,
    age: Int | Double = null,
    signalStrength: Int | Double = null,
    timingAdvance: Int | Double = null
  ): CellTower = {
    val __obj = js.Dynamic.literal(cellId = cellId, locationAreaCode = locationAreaCode, mobileCountryCode = mobileCountryCode, mobileNetworkCode = mobileNetworkCode)
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (signalStrength != null) __obj.updateDynamic("signalStrength")(signalStrength.asInstanceOf[js.Any])
    if (timingAdvance != null) __obj.updateDynamic("timingAdvance")(timingAdvance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTower]
  }
}

