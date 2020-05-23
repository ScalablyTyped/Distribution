package typings.gdal.mod

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
    dstAlphaBand: js.UndefOr[Double] = js.undefined,
    dstBands: js.Array[Double] = null,
    dstNodata: js.UndefOr[Double] = js.undefined,
    maxError: js.UndefOr[Double] = js.undefined,
    memoryLimit: js.UndefOr[Double] = js.undefined,
    multi: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[String] | js.Object = null,
    resampling: String = null,
    srcAlphaBand: js.UndefOr[Double] = js.undefined,
    srcBands: js.Array[Double] = null,
    srcNodata: js.UndefOr[Double] = js.undefined
  ): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    if (cutline != null) __obj.updateDynamic("cutline")(cutline.asInstanceOf[js.Any])
    if (!js.isUndefined(dstAlphaBand)) __obj.updateDynamic("dstAlphaBand")(dstAlphaBand.get.asInstanceOf[js.Any])
    if (dstBands != null) __obj.updateDynamic("dstBands")(dstBands.asInstanceOf[js.Any])
    if (!js.isUndefined(dstNodata)) __obj.updateDynamic("dstNodata")(dstNodata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxError)) __obj.updateDynamic("maxError")(maxError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryLimit)) __obj.updateDynamic("memoryLimit")(memoryLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resampling != null) __obj.updateDynamic("resampling")(resampling.asInstanceOf[js.Any])
    if (!js.isUndefined(srcAlphaBand)) __obj.updateDynamic("srcAlphaBand")(srcAlphaBand.get.asInstanceOf[js.Any])
    if (srcBands != null) __obj.updateDynamic("srcBands")(srcBands.asInstanceOf[js.Any])
    if (!js.isUndefined(srcNodata)) __obj.updateDynamic("srcNodata")(srcNodata.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
}

