package typings.echarts.echarts.EChartOption.SeriesBar

import typings.echarts.anon.BarBorderRadius
import typings.echarts.anon.FontFamily
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderRadius] = js.native
  /**
    * The style setting of the text label in a single bar.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.label
    */
  var label: js.UndefOr[FontFamily] = js.native
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * The value of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.value
    */
  var value: js.UndefOr[Double] = js.native
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
    def setItemStyle(value: BarBorderRadius): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: FontFamily): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

