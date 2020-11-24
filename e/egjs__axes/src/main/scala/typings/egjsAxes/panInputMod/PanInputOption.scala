package typings.egjsAxes.panInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanInputOption extends js.Object {
  
  var inputType: js.UndefOr[js.Array[String]] = js.native
  
  var scale: js.UndefOr[js.Array[Double]] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var thresholdAngle: js.UndefOr[Double] = js.native
}
object PanInputOption {
  
  @scala.inline
  def apply(): PanInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInputOption]
  }
  
  @scala.inline
  implicit class PanInputOptionOps[Self <: PanInputOption] (val x: Self) extends AnyVal {
    
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
    def setInputTypeVarargs(value: String*): Self = this.set("inputType", js.Array(value :_*))
    
    @scala.inline
    def setInputType(value: js.Array[String]): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: Double*): Self = this.set("scale", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: js.Array[Double]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setThresholdAngle(value: Double): Self = this.set("thresholdAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdAngle: Self = this.set("thresholdAngle", js.undefined)
  }
}
