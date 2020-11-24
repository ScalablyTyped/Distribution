package typings.echarts.echarts.EChartOption.SeriesSunburst

import typings.echarts.anon.BorderType
import typings.echarts.anon.MinAngle
import typings.echarts.anon.`22`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends js.Object {
  
  /**
    * Children nodes, which is recursively defined.
    * In the same format to
    * [series-sunburst.data](https://echarts.apache.org/en/option.html#series-sunburst.data)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.children
    */
  var children: js.UndefOr[js.Array[DataObject]] = js.native
  
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.downplay
    */
  var downplay: js.UndefOr[`22`] = js.native
  
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.emphasis
    */
  var emphasis: js.UndefOr[`22`] = js.native
  
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.highlight
    */
  var highlight: js.UndefOr[`22`] = js.native
  
  /**
    * Style of Sunburst sectors.
    *
    * Style can be set in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * for sectors of this series, or
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * for the whole level, or
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * for single sector. If
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * is defined, it will cover the setting of
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * and
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * .
    *
    * **Priority:
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * >
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * >
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * .**
    *
    * In ECharts, _emphasis_ is for styles when mouse hovers.
    * For Sunburst charts, there are two extra states: _highlight_
    * for highlighting items that relates to the emphasized one,
    * and _downplay_ for others when emphasizing an item. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  
  /**
    * `label` sets the text style for every sectors.
    *
    * **Priority:
    * [series.data.label](https://echarts.apache.org/en/option.html#series-sunburst.data.label)
    * >
    * [series.levels.label](https://echarts.apache.org/en/option.html#series-sunburst.levels.label)
    * >
    * [series.label](https://echarts.apache.org/en/option.html#series-sunburst.label)
    * .**
    *
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter,
    * `label`is taken to be at the same level with `itemStyle`,
    * and has `emphasis` as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.label
    */
  var label: js.UndefOr[MinAngle] = js.native
  
  /**
    * Link address that redirects to when this sector is clicked.
    * Only useful when
    * [series-sunburst.nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is set to be `'link'`.
    *
    * See
    * [series-sunburst.data.target](https://echarts.apache.org/en/option.html#series-sunburst.data.target)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.link
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Name displayed in each sector.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Like `target` attribute of HTML `<a>`, which can either be
    * `'blank'` or `'self'`. See
    * [series-sunburst.data.link](https://echarts.apache.org/en/option.html#series-sunburst.data.link)
    * .
    *
    *
    * @default
    * "blank"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.target
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Value for each item.
    * If contains children, value can be left unset, and sum of
    * children values will be used in this case.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data.value
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
    def setChildrenVarargs(value: DataObject*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DataObject]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDownplay(value: `22`): Self = this.set("downplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownplay: Self = this.set("downplay", js.undefined)
    
    @scala.inline
    def setEmphasis(value: `22`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setHighlight(value: `22`): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: MinAngle): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
