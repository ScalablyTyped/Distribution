package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaColorEmphasis extends js.Object {
  /**
    * Area filling color.
    *
    *
    * @default
    * "#eee"
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.native
  /**
    * Map area style in highlighted state.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[AreaColor] = js.native
}

object AreaColorEmphasis {
  @scala.inline
  def apply(): AreaColorEmphasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaColorEmphasis]
  }
  @scala.inline
  implicit class AreaColorEmphasisOps[Self <: AreaColorEmphasis] (val x: Self) extends AnyVal {
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
    def setAreaColor(value: BorderType): Self = this.set("areaColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaColor: Self = this.set("areaColor", js.undefined)
    @scala.inline
    def setEmphasis(value: AreaColor): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
  }
  
}

