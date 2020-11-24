package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorRegion extends js.Object {
  
  val loops: js.Array[js.Array[Double]] = js.native
  
  val windingRule: WindingRule = js.native
}
object VectorRegion {
  
  @scala.inline
  def apply(loops: js.Array[js.Array[Double]], windingRule: WindingRule): VectorRegion = {
    val __obj = js.Dynamic.literal(loops = loops.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorRegion]
  }
  
  @scala.inline
  implicit class VectorRegionOps[Self <: VectorRegion] (val x: Self) extends AnyVal {
    
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
    def setLoopsVarargs(value: js.Array[Double]*): Self = this.set("loops", js.Array(value :_*))
    
    @scala.inline
    def setLoops(value: js.Array[js.Array[Double]]): Self = this.set("loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindingRule(value: WindingRule): Self = this.set("windingRule", value.asInstanceOf[js.Any])
  }
}
