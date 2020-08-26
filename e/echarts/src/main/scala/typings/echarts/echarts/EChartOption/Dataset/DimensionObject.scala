package typings.echarts.echarts.EChartOption.Dataset

import typings.echarts.echartsStrings.float
import typings.echarts.echartsStrings.int
import typings.echarts.echartsStrings.number
import typings.echarts.echartsStrings.ordinal
import typings.echarts.echartsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#dataset.dimensions
  */
@js.native
trait DimensionObject extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[number | float | int | ordinal | time] = js.native
}

object DimensionObject {
  @scala.inline
  def apply(): DimensionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionObject]
  }
  @scala.inline
  implicit class DimensionObjectOps[Self <: DimensionObject] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: number | float | int | ordinal | time): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

