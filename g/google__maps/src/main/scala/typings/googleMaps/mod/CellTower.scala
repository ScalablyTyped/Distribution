package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTower extends js.Object {
  
  /** The number of milliseconds since this cell was primary. If age is 0, the `cellId` represents a current measurement. */
  var age: js.UndefOr[Double] = js.native
  
  /**
    * Unique identifier of the cell.
    * On GSM, this is the Cell ID (CID);
    * CDMA networks use the Base Station ID (BID).
    * WCDMA networks use the UTRAN/GERAN Cell Identity (UC-Id), which is a 32-bit value concatenating the Radio Network Controller (RNC)
    * and Cell ID. Specifying only the 16-bit Cell ID value in WCDMA networks may return inaccurate results.
    */
  var cellId: Double = js.native
  
  /** The Location Area Code (LAC) for GSM and WCDMA networks. The Network ID (NID) for CDMA networks. */
  var locationAreaCode: Double = js.native
  
  /** The cell tower's Mobile Country Code (MCC). */
  var mobileCountryCode: Double = js.native
  
  /** The cell tower's Mobile Network Code. This is the MNC for GSM and WCDMA; CDMA uses the System ID (SID). */
  var mobileNetworkCode: Double = js.native
  
  /** Radio signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.native
  
  /** The [timing advance](https://en.wikipedia.org/wiki/Timing_advance) value. */
  var timingAdvance: js.UndefOr[Double] = js.native
}
object CellTower {
  
  @scala.inline
  def apply(cellId: Double, locationAreaCode: Double, mobileCountryCode: Double, mobileNetworkCode: Double): CellTower = {
    val __obj = js.Dynamic.literal(cellId = cellId.asInstanceOf[js.Any], locationAreaCode = locationAreaCode.asInstanceOf[js.Any], mobileCountryCode = mobileCountryCode.asInstanceOf[js.Any], mobileNetworkCode = mobileNetworkCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTower]
  }
  
  @scala.inline
  implicit class CellTowerOps[Self <: CellTower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellId(value: Double): Self = this.set("cellId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAreaCode(value: Double): Self = this.set("locationAreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileCountryCode(value: Double): Self = this.set("mobileCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileNetworkCode(value: Double): Self = this.set("mobileNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: Double): Self = this.set("signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalStrength: Self = this.set("signalStrength", js.undefined)
    
    @scala.inline
    def setTimingAdvance(value: Double): Self = this.set("timingAdvance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingAdvance: Self = this.set("timingAdvance", js.undefined)
  }
}
