package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @todo describe
  */
@js.native
trait Label extends TextStyleWithRich {
  
  var formatter: js.UndefOr[String | js.Function] = js.native
  
  var inside: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double | js.Function] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var rotate: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showMaxLabel: js.UndefOr[Boolean] = js.native
  
  var showMinLabel: js.UndefOr[Boolean] = js.native
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setFormatter(value: String | js.Function): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInside: Self = this.set("inside", js.undefined)
    
    @scala.inline
    def setInterval(value: Double | js.Function): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowMaxLabel(value: Boolean): Self = this.set("showMaxLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaxLabel: Self = this.set("showMaxLabel", js.undefined)
    
    @scala.inline
    def setShowMinLabel(value: Boolean): Self = this.set("showMinLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinLabel: Self = this.set("showMinLabel", js.undefined)
  }
}
