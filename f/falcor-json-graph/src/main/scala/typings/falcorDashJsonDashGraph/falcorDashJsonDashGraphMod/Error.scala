package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends Sentinel {
  @JSName("$type")
  var $type: error
  var value: js.Any
}

object Error {
  @scala.inline
  def apply($type: error, value: js.Any, $expires: Int | Double = null): Error = {
    val __obj = js.Dynamic.literal($type = $type, value = value)
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

@JSImport("falcor-json-graph", "error")
@js.native
object error extends js.Object {
  def apply(errorValue: js.Any): Error = js.native
  def apply(errorValue: js.Any, props: Sentinel): Error = js.native
}

