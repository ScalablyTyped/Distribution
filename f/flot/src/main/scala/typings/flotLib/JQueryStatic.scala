package typings
package flotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("plot")
  var plot_Original: flotLib.jqueryNs.flotNs.plotStatic = js.native
  def plot(
    placeholder: jqueryLib.JQuery[stdLib.HTMLElement],
    data: js.Array[_ | flotLib.jqueryNs.flotNs.dataSeries]
  ): flotLib.jqueryNs.flotNs.plot = js.native
  def plot(
    placeholder: jqueryLib.JQuery[stdLib.HTMLElement],
    data: js.Array[_ | flotLib.jqueryNs.flotNs.dataSeries],
    options: flotLib.jqueryNs.flotNs.plotOptions
  ): flotLib.jqueryNs.flotNs.plot = js.native
}

