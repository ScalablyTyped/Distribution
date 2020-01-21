package typings.echarts.echartsMod

import typings.echarts.echarts.ECharts
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts/lib/echarts", "getInstanceByDom")
@js.native
object getInstanceByDom extends js.Object {
  def apply(target: HTMLCanvasElement): ECharts = js.native
  /**
    * Returns chart instance of dom container.
    *
    * @param target Chart container.
    */
  def apply(target: HTMLDivElement): ECharts = js.native
}

