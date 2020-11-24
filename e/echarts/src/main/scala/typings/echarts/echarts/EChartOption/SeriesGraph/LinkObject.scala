package typings.echarts.echarts.EChartOption.SeriesGraph

import typings.echarts.anon.FontSize
import typings.echarts.anon.LabelLineStyle
import typings.echarts.anon.ShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkObject extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis
    */
  var emphasis: js.UndefOr[LabelLineStyle] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.label
    */
  var label: js.UndefOr[FontSize] = js.native
  
  /**
    * Line style of edges.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.native
  
  /**
    * [name of source node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.source
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Symbol of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.native
  
  /**
    * Symbol size of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | String] = js.native
  
  /**
    * [name of target node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.target
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * value of edge, can be mapped to edge length in force graph.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.value
    */
  var value: js.UndefOr[Double] = js.native
}
object LinkObject {
  
  @scala.inline
  def apply(): LinkObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkObject]
  }
  
  @scala.inline
  implicit class LinkObjectOps[Self <: LinkObject] (val x: Self) extends AnyVal {
    
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
    def setEmphasis(value: LabelLineStyle): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: js.Any*): Self = this.set("symbol", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: js.Array[_] | String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = this.set("symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolSize(value: js.Array[_] | String): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    
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
