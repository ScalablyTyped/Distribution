package typings.echarts.echarts.EChartOption.SeriesLines

import typings.echarts.anon.FontSize
import typings.echarts.anon.ShadowColor
import typings.echarts.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * An array includes two ore more than two coordinates.
    * Each coordinate could be `[x, y]` in
    * [rectangular coordinate](https://echarts.apache.org/en/option.html#grid)
    * and `[lng, lat]` in
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.coords
    */
  var coords: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis
    */
  var emphasis: js.UndefOr[`12`] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.label
    */
  var label: js.UndefOr[FontSize] = js.native
  /**
    * The line style of this data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.native
  /**
    * the name of data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.name
    */
  var name: js.UndefOr[String] = js.native
}

object DataObject {
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
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
    def setCoordsVarargs(value: js.Any*): Self = this.set("coords", js.Array(value :_*))
    @scala.inline
    def setCoords(value: js.Array[_]): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setEmphasis(value: `12`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setLabel(value: FontSize): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowColor): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

