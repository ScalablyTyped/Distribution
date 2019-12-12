package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends Sentinel {
  @JSName("$type")
  var $type: typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphStrings.error = js.native
  var value: js.Any = js.native
}

@JSImport("falcor-json-graph", "error")
@js.native
object error extends js.Object {
  def apply(errorValue: js.Any): Error = js.native
  def apply(errorValue: js.Any, props: Sentinel): Error = js.native
}

