package typings.echarts.echarts.EChartOption.SeriesPie

import typings.echarts.anon.BorderType
import typings.echarts.anon.FontWeight
import typings.echarts.anon.Smooth
import typings.echarts.anon.`20`
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.emphasis
    */
  var emphasis: js.UndefOr[`20`] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * The label configuration of a single sector.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label
    */
  var label: js.UndefOr[FontWeight] = js.native
  /**
    * The style of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine
    */
  var labelLine: js.UndefOr[Smooth] = js.native
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the data item is selected.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * Data value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.value
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
    def setEmphasis(value: `20`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: FontWeight): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelLine(value: Smooth): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
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

