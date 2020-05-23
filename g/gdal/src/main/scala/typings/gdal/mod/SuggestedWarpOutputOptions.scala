package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedWarpOutputOptions extends js.Object {
  var maxError: js.UndefOr[Double] = js.undefined
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
    maxError: js.UndefOr[Double] = js.undefined
  ): SuggestedWarpOutputOptions = {
    val __obj = js.Dynamic.literal(s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    if (!js.isUndefined(maxError)) __obj.updateDynamic("maxError")(maxError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedWarpOutputOptions]
  }
}

