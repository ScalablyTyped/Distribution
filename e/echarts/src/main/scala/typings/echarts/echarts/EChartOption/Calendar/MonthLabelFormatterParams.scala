package typings.echarts.echarts.EChartOption.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthLabelFormatterParams extends js.Object {
  var M: js.UndefOr[Double] = js.native
  var MM: js.UndefOr[Double] = js.native
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  var yy: js.UndefOr[Double] = js.native
  var yyyy: js.UndefOr[Double] = js.native
}

object MonthLabelFormatterParams {
  @scala.inline
  def apply(): MonthLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthLabelFormatterParams]
  }
  @scala.inline
  implicit class MonthLabelFormatterParamsOps[Self <: MonthLabelFormatterParams] (val x: Self) extends AnyVal {
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
    def setM(value: Double): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setMM(value: Double): Self = this.set("MM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMM: Self = this.set("MM", js.undefined)
    @scala.inline
    def setNameMapVarargs(value: (String | Double)*): Self = this.set("nameMap", js.Array(value :_*))
    @scala.inline
    def setNameMap(value: String | Double | (js.Array[String | Double])): Self = this.set("nameMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameMap: Self = this.set("nameMap", js.undefined)
    @scala.inline
    def setYy(value: Double): Self = this.set("yy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYy: Self = this.set("yy", js.undefined)
    @scala.inline
    def setYyyy(value: Double): Self = this.set("yyyy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYyyy: Self = this.set("yyyy", js.undefined)
  }
  
}

