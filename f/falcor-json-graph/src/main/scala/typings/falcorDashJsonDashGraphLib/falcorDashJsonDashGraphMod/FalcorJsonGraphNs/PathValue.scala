package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around a path and its value.
  **/
trait PathValue extends js.Object {
  var path: java.lang.String | PathSet
  var value: js.Any
}

object PathValue {
  @scala.inline
  def apply(path: java.lang.String | PathSet, value: js.Any): PathValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PathValue]
  }
}

