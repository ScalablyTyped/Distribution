package typings.flot

import typings.flot.jqueryNs.flotNs.dataSeries
import typings.flot.jqueryNs.flotNs.plotOptions
import typings.flot.jqueryNs.flotNs.plotStatic
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("plot")
  var plot_Original: plotStatic = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries]): typings.flot.jqueryNs.flotNs.plot = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typings.flot.jqueryNs.flotNs.plot = js.native
}

