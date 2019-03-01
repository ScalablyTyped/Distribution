package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPath extends js.Object {
  var invalidate: scala.Boolean
  var path: PathSet
}

object InvalidPath {
  @scala.inline
  def apply(invalidate: scala.Boolean, path: PathSet): InvalidPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invalidate")(invalidate)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[InvalidPath]
  }
}

