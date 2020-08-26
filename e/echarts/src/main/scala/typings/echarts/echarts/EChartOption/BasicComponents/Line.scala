package typings.echarts.echarts.EChartOption.BasicComponents

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
@js.native
trait Line extends js.Object {
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var onZero: js.UndefOr[Boolean] = js.native
  var onZeroAxisIndex: js.UndefOr[Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var symbol: js.UndefOr[String | js.Array[String]] = js.native
  var symbolOffset: js.UndefOr[js.Array[Double]] = js.native
  var symbolSize: js.UndefOr[js.Array[Double]] = js.native
}

object Line {
  @scala.inline
  def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
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
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setOnZero(value: Boolean): Self = this.set("onZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnZero: Self = this.set("onZero", js.undefined)
    @scala.inline
    def setOnZeroAxisIndex(value: Double): Self = this.set("onZeroAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnZeroAxisIndex: Self = this.set("onZeroAxisIndex", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSymbolVarargs(value: String*): Self = this.set("symbol", js.Array(value :_*))
    @scala.inline
    def setSymbol(value: String | js.Array[String]): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbolOffsetVarargs(value: Double*): Self = this.set("symbolOffset", js.Array(value :_*))
    @scala.inline
    def setSymbolOffset(value: js.Array[Double]): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    @scala.inline
    def setSymbolSizeVarargs(value: Double*): Self = this.set("symbolSize", js.Array(value :_*))
    @scala.inline
    def setSymbolSize(value: js.Array[Double]): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
  }
  
}

