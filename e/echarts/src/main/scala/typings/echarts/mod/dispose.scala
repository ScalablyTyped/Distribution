package typings.echarts.mod

import typings.echarts.echarts.ECharts
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts", "dispose")
@js.native
object dispose extends js.Object {
  /**
    * Destroys chart instance, after which the instance cannot be used any
    *     more.
    *
    * @param target Chart instance or container.
    */
  def apply(target: ECharts): Unit = js.native
  def apply(target: HTMLCanvasElement): Unit = js.native
  def apply(target: HTMLDivElement): Unit = js.native
}

