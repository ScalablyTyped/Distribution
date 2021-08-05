package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterativeCalculationSetting extends StObject {
  
  var convergenceThreshold: Double
  
  var maxIterations: Double
}
object IterativeCalculationSetting {
  
  inline def apply(convergenceThreshold: Double, maxIterations: Double): IterativeCalculationSetting = {
    val __obj = js.Dynamic.literal(convergenceThreshold = convergenceThreshold.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSetting]
  }
  
  extension [Self <: IterativeCalculationSetting](x: Self) {
    
    inline def setConvergenceThreshold(value: Double): Self = StObject.set(x, "convergenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
  }
}
