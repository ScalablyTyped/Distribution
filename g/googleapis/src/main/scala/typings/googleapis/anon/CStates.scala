package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CStates extends StObject {
  
  var cStates: js.UndefOr[js.Array[DisplayName]] = js.undefined
  
  var currentScalingFrequencyKhz: js.UndefOr[Double] = js.undefined
  
  var idleDuration: js.UndefOr[String] = js.undefined
  
  var maxScalingFrequencyKhz: js.UndefOr[Double] = js.undefined
}
object CStates {
  
  inline def apply(): CStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CStates]
  }
  
  extension [Self <: CStates](x: Self) {
    
    inline def setCStates(value: js.Array[DisplayName]): Self = StObject.set(x, "cStates", value.asInstanceOf[js.Any])
    
    inline def setCStatesUndefined: Self = StObject.set(x, "cStates", js.undefined)
    
    inline def setCStatesVarargs(value: DisplayName*): Self = StObject.set(x, "cStates", js.Array(value*))
    
    inline def setCurrentScalingFrequencyKhz(value: Double): Self = StObject.set(x, "currentScalingFrequencyKhz", value.asInstanceOf[js.Any])
    
    inline def setCurrentScalingFrequencyKhzUndefined: Self = StObject.set(x, "currentScalingFrequencyKhz", js.undefined)
    
    inline def setIdleDuration(value: String): Self = StObject.set(x, "idleDuration", value.asInstanceOf[js.Any])
    
    inline def setIdleDurationUndefined: Self = StObject.set(x, "idleDuration", js.undefined)
    
    inline def setMaxScalingFrequencyKhz(value: Double): Self = StObject.set(x, "maxScalingFrequencyKhz", value.asInstanceOf[js.Any])
    
    inline def setMaxScalingFrequencyKhzUndefined: Self = StObject.set(x, "maxScalingFrequencyKhz", js.undefined)
  }
}
