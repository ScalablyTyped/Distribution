package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsResponsiveOption extends js.Object {
  var baseOption: js.UndefOr[EChartOption[Series]] = js.native
  var media: js.UndefOr[js.Array[EChartsMediaOption]] = js.native
}

object EChartsResponsiveOption {
  @scala.inline
  def apply(): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
  @scala.inline
  implicit class EChartsResponsiveOptionOps[Self <: EChartsResponsiveOption] (val x: Self) extends AnyVal {
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
    def setBaseOption(value: EChartOption[Series]): Self = this.set("baseOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseOption: Self = this.set("baseOption", js.undefined)
    @scala.inline
    def setMediaVarargs(value: EChartsMediaOption*): Self = this.set("media", js.Array(value :_*))
    @scala.inline
    def setMedia(value: js.Array[EChartsMediaOption]): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
  
}

