package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellTower extends StObject {
  
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
  
  inline def apply(cellId: Double, locationAreaCode: Double, mobileCountryCode: Double, mobileNetworkCode: Double): CellTower = {
    val __obj = js.Dynamic.literal(cellId = cellId.asInstanceOf[js.Any], locationAreaCode = locationAreaCode.asInstanceOf[js.Any], mobileCountryCode = mobileCountryCode.asInstanceOf[js.Any], mobileNetworkCode = mobileNetworkCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTower]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellTower] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setCellId(value: Double): Self = StObject.set(x, "cellId", value.asInstanceOf[js.Any])
    
    inline def setLocationAreaCode(value: Double): Self = StObject.set(x, "locationAreaCode", value.asInstanceOf[js.Any])
    
    inline def setMobileCountryCode(value: Double): Self = StObject.set(x, "mobileCountryCode", value.asInstanceOf[js.Any])
    
    inline def setMobileNetworkCode(value: Double): Self = StObject.set(x, "mobileNetworkCode", value.asInstanceOf[js.Any])
    
    inline def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    inline def setSignalStrengthUndefined: Self = StObject.set(x, "signalStrength", js.undefined)
    
    inline def setTimingAdvance(value: Double): Self = StObject.set(x, "timingAdvance", value.asInstanceOf[js.Any])
    
    inline def setTimingAdvanceUndefined: Self = StObject.set(x, "timingAdvance", js.undefined)
  }
}
