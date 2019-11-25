package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.echarts.echartsStrings.value
  - typings.echarts.echartsStrings.category
  - typings.echarts.echartsStrings.time
  - typings.echarts.echartsStrings.log
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.echarts.echartsStrings.category = this.cast("category")
  @scala.inline
  def log: typings.echarts.echartsStrings.log = this.cast("log")
  @scala.inline
  def time: typings.echarts.echartsStrings.time = this.cast("time")
  @scala.inline
  def value: typings.echarts.echartsStrings.value = this.cast("value")
}

