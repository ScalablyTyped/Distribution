package typings.echarts.echarts.EChartOption.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearLabelFormatterParams extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  var start: js.UndefOr[Double] = js.native
}

object YearLabelFormatterParams {
  @scala.inline
  def apply(): YearLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YearLabelFormatterParams]
  }
  @scala.inline
  implicit class YearLabelFormatterParamsOps[Self <: YearLabelFormatterParams] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setNameMapVarargs(value: (String | Double)*): Self = this.set("nameMap", js.Array(value :_*))
    @scala.inline
    def setNameMap(value: String | Double | (js.Array[String | Double])): Self = this.set("nameMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameMap: Self = this.set("nameMap", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

