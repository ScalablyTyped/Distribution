package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs

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

