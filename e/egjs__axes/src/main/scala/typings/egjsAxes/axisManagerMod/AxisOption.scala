package typings.egjsAxes.axisManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisOption extends js.Object {
  
  var bounce: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var circular: js.UndefOr[Boolean | js.Array[Boolean]] = js.native
  
  var range: js.UndefOr[js.Array[Double]] = js.native
}
object AxisOption {
  
  @scala.inline
  def apply(): AxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisOption]
  }
  
  @scala.inline
  implicit class AxisOptionOps[Self <: AxisOption] (val x: Self) extends AnyVal {
    
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
    def setBounceVarargs(value: Double*): Self = this.set("bounce", js.Array(value :_*))
    
    @scala.inline
    def setBounce(value: Double | js.Array[Double]): Self = this.set("bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    
    @scala.inline
    def setCircularVarargs(value: Boolean*): Self = this.set("circular", js.Array(value :_*))
    
    @scala.inline
    def setCircular(value: Boolean | js.Array[Boolean]): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
