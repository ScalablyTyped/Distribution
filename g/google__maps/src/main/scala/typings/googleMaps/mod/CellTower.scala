package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTower extends StObject {
  
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
  implicit class CellTowerMutableBuilder[Self <: CellTower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setCellId(value: Double): Self = StObject.set(x, "cellId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAreaCode(value: Double): Self = StObject.set(x, "locationAreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileCountryCode(value: Double): Self = StObject.set(x, "mobileCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileNetworkCode(value: Double): Self = StObject.set(x, "mobileNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "signalStrength", js.undefined)
    
    @scala.inline
    def setTimingAdvance(value: Double): Self = StObject.set(x, "timingAdvance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingAdvanceUndefined: Self = StObject.set(x, "timingAdvance", js.undefined)
  }
}
