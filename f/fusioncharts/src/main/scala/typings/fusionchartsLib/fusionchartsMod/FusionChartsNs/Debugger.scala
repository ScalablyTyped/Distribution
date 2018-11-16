package typings
package fusionchartsLib.fusionchartsMod.FusionChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debugger extends js.Object {
  def enable(state: js.Any): scala.Unit = js.native
  def enable(state: js.Any, outputTo: js.Function1[/* message */ js.Any, _]): scala.Unit = js.native
  def enable(state: js.Any, outputTo: js.Function1[/* message */ js.Any, _], outputFormat: js.Any): scala.Unit = js.native
  def enableFirebugLite(): js.Any = js.native
  def outputFormat(format: js.Any): scala.Unit = js.native
  def outputTo(callback: js.Function1[/* message */ js.Any, _]): scala.Unit = js.native
}

