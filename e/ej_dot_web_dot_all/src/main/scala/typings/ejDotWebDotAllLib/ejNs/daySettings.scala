package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait daySettings extends js.Object {
  var names: js.Array[java.lang.String]
  var namesAbbr: js.Array[java.lang.String]
  var namesShort: js.Array[java.lang.String]
}

object daySettings {
  @scala.inline
  def apply(
    names: js.Array[java.lang.String],
    namesAbbr: js.Array[java.lang.String],
    namesShort: js.Array[java.lang.String]
  ): daySettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("namesAbbr")(namesAbbr)
    __obj.updateDynamic("namesShort")(namesShort)
    __obj.asInstanceOf[daySettings]
  }
}

