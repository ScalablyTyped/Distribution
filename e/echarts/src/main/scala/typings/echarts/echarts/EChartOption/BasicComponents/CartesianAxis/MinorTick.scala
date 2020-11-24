package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @todo describe
  */
@js.native
trait MinorTick extends js.Object {
  
  var length: js.UndefOr[Double] = js.native
  
  var lineStyle: js.UndefOr[LineStyle] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var splitNumber: js.UndefOr[Double] = js.native
}
object MinorTick {
  
  @scala.inline
  def apply(): MinorTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinorTick]
  }
  
  @scala.inline
  implicit class MinorTickOps[Self <: MinorTick] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSplitNumber(value: Double): Self = this.set("splitNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitNumber: Self = this.set("splitNumber", js.undefined)
  }
}
