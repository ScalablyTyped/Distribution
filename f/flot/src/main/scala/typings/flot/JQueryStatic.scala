package typings.flot

import typings.flot.jquery.flot.dataSeries
import typings.flot.jquery.flot.plotOptions
import typings.flot.jquery.flot.plotStatic
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries]): typings.flot.jquery.flot.plot = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typings.flot.jquery.flot.plot = js.native
  @JSName("plot")
  var plot_Original: plotStatic = js.native
}
