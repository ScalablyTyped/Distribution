package typings.echarts.echarts.EChartOption.Calendar

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends TextStyleWithRich {
  
  /**
    * The margin between the label and the axis line.
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * Week text content, defaults to 'en'; It supports Chinese, English, and custom;
    * index 0 always means Sunday;
    *
    * @default 'en'
    */
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  
  /**
    * Set this to false to prevent label from showing.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
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
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setNameMapVarargs(value: (String | Double)*): Self = this.set("nameMap", js.Array(value :_*))
    
    @scala.inline
    def setNameMap(value: String | Double | (js.Array[String | Double])): Self = this.set("nameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameMap: Self = this.set("nameMap", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
