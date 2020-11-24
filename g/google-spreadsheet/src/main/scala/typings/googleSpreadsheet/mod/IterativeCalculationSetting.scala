package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterativeCalculationSetting extends js.Object {
  
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
  implicit class IterativeCalculationSettingOps[Self <: IterativeCalculationSetting] (val x: Self) extends AnyVal {
    
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
    def setConvergenceThreshold(value: Double): Self = this.set("convergenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
  }
}
