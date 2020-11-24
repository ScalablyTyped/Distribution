package typings.echarts.echarts.EChartOption.SeriesFunnel

import typings.echarts.anon.BorderType
import typings.echarts.anon.FontWeight
import typings.echarts.anon.LabelLabelLine
import typings.echarts.anon.Length
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis
    */
  var emphasis: js.UndefOr[LabelLabelLine] = js.native
  
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  
  /**
    * The label configuration of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.label
    */
  var label: js.UndefOr[FontWeight] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.native
  
  /**
    * the name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  
  /**
    * data value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.value
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
    def setEmphasis(value: LabelLabelLine): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
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
    def setLabelLine(value: Length): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
    
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
