package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterativeCalculationSetting extends StObject {
  
  var convergenceThreshold: Double = js.native
  
  var maxIterations: Double = js.native
}
object IterativeCalculationSetting {
  
  @scala.inline
  def apply(convergenceThreshold: Double, maxIterations: Double): IterativeCalculationSetting = {
    val __obj = js.Dynamic.literal(convergenceThreshold = convergenceThreshold.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSetting]
  }
  
  @scala.inline
  implicit class IterativeCalculationSettingMutableBuilder[Self <: IterativeCalculationSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvergenceThreshold(value: Double): Self = StObject.set(x, "convergenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
  }
}
