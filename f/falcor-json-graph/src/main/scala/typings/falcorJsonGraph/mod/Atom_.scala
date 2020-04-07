package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: The following types are described at https://github.com/Netflix/falcor/tree/master/lib/typedefs .
/**
  * An atom allows you to treat a JSON value as atomic regardless of its type, ensuring that a JSON object or array is always returned in its entirety. The JSON value must be treated as immutable. Atoms can also be used to associate metadata with a JSON value. This metadata can be used to influence the way values are handled.
  **/
trait Atom_ extends Sentinel {
  @JSName("$type")
  var $type: typings.falcorJsonGraph.falcorJsonGraphStrings.atom
  var value: js.Any
}

object Atom_ {
  @scala.inline
  def apply(
    $type: typings.falcorJsonGraph.falcorJsonGraphStrings.atom,
    value: js.Any,
    $expires: Int | Double = null
  ): Atom_ = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if ($expires != null) __obj.updateDynamic("$expires")($expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom_]
  }
}

