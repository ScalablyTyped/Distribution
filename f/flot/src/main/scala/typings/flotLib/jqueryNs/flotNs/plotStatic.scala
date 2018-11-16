package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait plotStatic extends js.Object {
  var plugins: js.Array[plugin] = js.native
  def apply(placeholder: jqueryLib.JQuery[stdLib.HTMLElement], data: js.Array[_ | dataSeries]): plot = js.native
  def apply(
    placeholder: jqueryLib.JQuery[stdLib.HTMLElement],
    data: js.Array[_ | dataSeries],
    options: plotOptions
  ): plot = js.native
}

