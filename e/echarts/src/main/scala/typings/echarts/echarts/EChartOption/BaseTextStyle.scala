package typings.echarts.echarts.EChartOption

import typings.echarts.echartsStrings.`100`
import typings.echarts.echartsStrings.`200`
import typings.echarts.echartsStrings.`300`
import typings.echarts.echartsStrings.`400`
import typings.echarts.echartsStrings.bold
import typings.echarts.echartsStrings.bolder
import typings.echarts.echartsStrings.italic
import typings.echarts.echartsStrings.lighter
import typings.echarts.echartsStrings.normal
import typings.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#textStyle
  */
@js.native
trait BaseTextStyle extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
  var fontWeight: js.UndefOr[normal | bold | bolder | lighter | `100` | `200` | `300` | `400`] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var textBorderColor: js.UndefOr[String] = js.native
  var textBorderWidth: js.UndefOr[Double] = js.native
  var textShadowBlur: js.UndefOr[Double] = js.native
  var textShadowColor: js.UndefOr[String] = js.native
  var textShadowOffsetX: js.UndefOr[Double] = js.native
  var textShadowOffsetY: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object BaseTextStyle {
  @scala.inline
  def apply(): BaseTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTextStyle]
  }
  @scala.inline
  implicit class BaseTextStyleOps[Self <: BaseTextStyle] (val x: Self) extends AnyVal {
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
    def setFontWeight(value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400`): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
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

