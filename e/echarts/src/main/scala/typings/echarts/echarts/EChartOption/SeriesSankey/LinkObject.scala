package typings.echarts.echarts.EChartOption.SeriesSankey

import typings.echarts.anon.CurvenessOpacity
import typings.echarts.anon.`21`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis
    */
  var emphasis: js.UndefOr[`21`] = js.native
  /**
    * The line stlye of edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessOpacity] = js.native
  /**
    * The
    * [name of source node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.source
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The
    * [name of target node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.target
    */
  var target: js.UndefOr[String] = js.native
  /**
    * The value of edge, which decides the width of edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.value
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
    def setEmphasis(value: `21`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setLineStyle(value: CurvenessOpacity): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
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

