package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalibrationFactor extends StObject {
  
  var calibrationFactor: Double
  
  var precision: Double
  
  var units: String
}
object CalibrationFactor {
  
  inline def apply(calibrationFactor: Double, precision: Double, units: String): CalibrationFactor = {
    val __obj = js.Dynamic.literal(calibrationFactor = calibrationFactor.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalibrationFactor]
  }
  
  extension [Self <: CalibrationFactor](x: Self) {
    
    inline def setCalibrationFactor(value: Double): Self = StObject.set(x, "calibrationFactor", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
