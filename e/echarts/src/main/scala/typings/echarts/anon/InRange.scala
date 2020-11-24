package typings.echarts.anon

import typings.echarts.echarts.VisualMap.RangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InRange extends js.Object {
  
  var inRange: js.UndefOr[RangeObject] = js.native
  
  var outOfRange: js.UndefOr[RangeObject] = js.native
}
object InRange {
  
  @scala.inline
  def apply(): InRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InRange]
  }
  
  @scala.inline
  implicit class InRangeOps[Self <: InRange] (val x: Self) extends AnyVal {
    
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
    def setInRange(value: RangeObject): Self = this.set("inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
    
    @scala.inline
    def setOutOfRange(value: RangeObject): Self = this.set("outOfRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutOfRange: Self = this.set("outOfRange", js.undefined)
  }
}
