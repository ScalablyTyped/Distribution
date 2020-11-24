package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echartsNumbers.`100`
import typings.echarts.echartsNumbers.`200`
import typings.echarts.echartsNumbers.`300`
import typings.echarts.echartsNumbers.`400`
import typings.echarts.echartsNumbers.`500`
import typings.echarts.echartsNumbers.`600`
import typings.echarts.echartsNumbers.`700`
import typings.echarts.echartsNumbers.`800`
import typings.echarts.echartsNumbers.`900`
import typings.echarts.echartsStrings.bold
import typings.echarts.echartsStrings.bolder
import typings.echarts.echartsStrings.italic
import typings.echarts.echartsStrings.lighter
import typings.echarts.echartsStrings.normal
import typings.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerLabel extends js.Object {
  
  var backgroundColor: js.UndefOr[String | js.Object] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
  
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  
  var formatter: js.UndefOr[String | js.Function] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var precision: js.UndefOr[Double | String] = js.native
  
  var shadowBlur: js.UndefOr[Double] = js.native
  
  var shadowColor: js.UndefOr[String] = js.native
  
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var textBorderColor: js.UndefOr[String] = js.native
  
  var textBorderWidth: js.UndefOr[Double] = js.native
  
  var textShadowBlur: js.UndefOr[Double] = js.native
  
  var textShadowColor: js.UndefOr[String] = js.native
  
  var textShadowOffsetX: js.UndefOr[Double] = js.native
  
  var textShadowOffsetY: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object PointerLabel {
  
  @scala.inline
  def apply(): PointerLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerLabel]
  }
  
  @scala.inline
  implicit class PointerLabelOps[Self <: PointerLabel] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String | js.Object): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic | oblique): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
    ): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFormatter(value: String | js.Function): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double | String): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTextBorderColor(value: String): Self = this.set("textBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBorderColor: Self = this.set("textBorderColor", js.undefined)
    
    @scala.inline
    def setTextBorderWidth(value: Double): Self = this.set("textBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBorderWidth: Self = this.set("textBorderWidth", js.undefined)
    
    @scala.inline
    def setTextShadowBlur(value: Double): Self = this.set("textShadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowBlur: Self = this.set("textShadowBlur", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: String): Self = this.set("textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowColor: Self = this.set("textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffsetX(value: Double): Self = this.set("textShadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOffsetX: Self = this.set("textShadowOffsetX", js.undefined)
    
    @scala.inline
    def setTextShadowOffsetY(value: Double): Self = this.set("textShadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOffsetY: Self = this.set("textShadowOffsetY", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
