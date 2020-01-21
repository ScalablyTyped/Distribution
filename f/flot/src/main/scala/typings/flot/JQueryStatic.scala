package typings.flot

import typings.flot.jquery.flot.dataSeries
import typings.flot.jquery.flot.plotOptions
import typings.flot.jquery.flot.plotStatic
import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("plot")
  var plot_Original: plotStatic = js.native
  def plot(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries]): typings.flot.jquery.flot.plot = js.native
  def plot(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typings.flot.jquery.flot.plot = js.native
}

