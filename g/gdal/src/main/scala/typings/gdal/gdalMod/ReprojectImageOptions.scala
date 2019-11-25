package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReprojectImageOptions extends js.Object {
  var cutline: js.UndefOr[Geometry] = js.undefined
  var dst: Dataset
  var dstAlphaBand: js.UndefOr[Double] = js.undefined
  var dstBands: js.UndefOr[js.Array[Double]] = js.undefined
  var dstNodata: js.UndefOr[Double] = js.undefined
  var maxError: js.UndefOr[Double] = js.undefined
  var memoryLimit: js.UndefOr[Double] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[js.Array[String] | js.Object] = js.undefined
  var resampling: js.UndefOr[String] = js.undefined
  var s_srs: SpatialReference
  var src: Dataset
  var srcAlphaBand: js.UndefOr[Double] = js.undefined
  var srcBands: js.UndefOr[js.Array[Double]] = js.undefined
  var srcNodata: js.UndefOr[Double] = js.undefined
  var t_srs: SpatialReference
}

object ReprojectImageOptions {
  @scala.inline
  def apply(
    dst: Dataset,
    s_srs: SpatialReference,
    src: Dataset,
    t_srs: SpatialReference,
    cutline: Geometry = null,
    dstAlphaBand: Int | Double = null,
    dstBands: js.Array[Double] = null,
    dstNodata: Int | Double = null,
    maxError: Int | Double = null,
    memoryLimit: Int | Double = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[String] | js.Object = null,
    resampling: String = null,
    srcAlphaBand: Int | Double = null,
    srcBands: js.Array[Double] = null,
    srcNodata: Int | Double = null
  ): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    if (cutline != null) __obj.updateDynamic("cutline")(cutline.asInstanceOf[js.Any])
    if (dstAlphaBand != null) __obj.updateDynamic("dstAlphaBand")(dstAlphaBand.asInstanceOf[js.Any])
    if (dstBands != null) __obj.updateDynamic("dstBands")(dstBands.asInstanceOf[js.Any])
    if (dstNodata != null) __obj.updateDynamic("dstNodata")(dstNodata.asInstanceOf[js.Any])
    if (maxError != null) __obj.updateDynamic("maxError")(maxError.asInstanceOf[js.Any])
    if (memoryLimit != null) __obj.updateDynamic("memoryLimit")(memoryLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resampling != null) __obj.updateDynamic("resampling")(resampling.asInstanceOf[js.Any])
    if (srcAlphaBand != null) __obj.updateDynamic("srcAlphaBand")(srcAlphaBand.asInstanceOf[js.Any])
    if (srcBands != null) __obj.updateDynamic("srcBands")(srcBands.asInstanceOf[js.Any])
    if (srcNodata != null) __obj.updateDynamic("srcNodata")(srcNodata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
}

