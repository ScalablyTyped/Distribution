package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An envelope that wraps a {@link JSONGraph} fragment.
  **/
trait JSONGraphEnvelope extends js.Object {
  var invalidate: js.UndefOr[js.Array[PathSet]] = js.undefined
  var jsonGraph: JSONGraph
  var paths: js.UndefOr[js.Array[PathSet]] = js.undefined
}

object JSONGraphEnvelope {
  @scala.inline
  def apply(jsonGraph: JSONGraph, invalidate: js.Array[PathSet] = null, paths: js.Array[PathSet] = null): JSONGraphEnvelope = {
    val __obj = js.Dynamic.literal(jsonGraph = jsonGraph)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[JSONGraphEnvelope]
  }
}

