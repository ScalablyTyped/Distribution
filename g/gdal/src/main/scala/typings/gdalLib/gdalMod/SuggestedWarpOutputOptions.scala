package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedWarpOutputOptions extends js.Object {
  var maxError: js.UndefOr[scala.Double] = js.undefined
  var s_srs: SpatialReference
  var src: Dataset
  var t_srs: SpatialReference
}

object SuggestedWarpOutputOptions {
  @scala.inline
  def apply(
    s_srs: SpatialReference,
    src: Dataset,
    t_srs: SpatialReference,
    maxError: scala.Int | scala.Double = null
  ): SuggestedWarpOutputOptions = {
    val __obj = js.Dynamic.literal(s_srs = s_srs, src = src, t_srs = t_srs)
    if (maxError != null) __obj.updateDynamic("maxError")(maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedWarpOutputOptions]
  }
}

