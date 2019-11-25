package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: The following types are described at https://github.com/Netflix/falcor/tree/master/lib/typedefs .
/**
  * An atom allows you to treat a JSON value as atomic regardless of its type, ensuring that a JSON object or array is always returned in its entirety. The JSON value must be treated as immutable. Atoms can also be used to associate metadata with a JSON value. This metadata can be used to influence the way values are handled.
  **/
trait Atom extends Sentinel {
  @JSName("$type")
  var $type: typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphStrings.atom
  var value: js.Any
}

object Atom {
  @scala.inline
  def apply(
    $type: typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphStrings.atom,
    value: js.Any,
    $expires: Int | Double = null
  ): Atom = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom]
  }
}

@JSImport("falcor-json-graph", "atom")
@js.native
object atom extends js.Object {
  def apply(value: js.Any): Atom = js.native
  def apply(value: js.Any, props: Sentinel): Atom = js.native
}

