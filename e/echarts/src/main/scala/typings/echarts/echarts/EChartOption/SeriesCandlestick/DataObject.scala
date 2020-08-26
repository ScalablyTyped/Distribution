package typings.echarts.echarts.EChartOption.SeriesCandlestick

import typings.echarts.anon.BorderColor0
import typings.echarts.anon.`3`
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * Emphasis style of a candle box.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis
    */
  var emphasis: js.UndefOr[`3`] = js.native
  /**
    * Style of a candle box.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor0] = js.native
  /**
    * Name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * Value of data item.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.native
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
    def setEmphasis(value: `3`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderColor0): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

