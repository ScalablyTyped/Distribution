package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPath extends js.Object {
  var invalidate: Boolean
  var path: PathSet
}

object InvalidPath {
  @scala.inline
  def apply(invalidate: Boolean, path: PathSet): InvalidPath = {
    val __obj = js.Dynamic.literal(invalidate = invalidate, path = path)
  
    __obj.asInstanceOf[InvalidPath]
  }
}

