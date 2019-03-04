package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReprojectImageOptions extends js.Object {
  var cutline: js.UndefOr[Geometry] = js.undefined
  var dst: Dataset
  var dstAlphaBand: js.UndefOr[scala.Double] = js.undefined
  var dstBands: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var dstNodata: js.UndefOr[scala.Double] = js.undefined
  var maxError: js.UndefOr[scala.Double] = js.undefined
  var memoryLimit: js.UndefOr[scala.Double] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.UndefOr[js.Array[java.lang.String] | js.Object] = js.undefined
  var resampling: js.UndefOr[java.lang.String] = js.undefined
  var s_srs: SpatialReference
  var src: Dataset
  var srcAlphaBand: js.UndefOr[scala.Double] = js.undefined
  var srcBands: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var srcNodata: js.UndefOr[scala.Double] = js.undefined
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
    dstAlphaBand: scala.Int | scala.Double = null,
    dstBands: js.Array[scala.Double] = null,
    dstNodata: scala.Int | scala.Double = null,
    maxError: scala.Int | scala.Double = null,
    memoryLimit: scala.Int | scala.Double = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.Array[java.lang.String] | js.Object = null,
    resampling: java.lang.String = null,
    srcAlphaBand: scala.Int | scala.Double = null,
    srcBands: js.Array[scala.Double] = null,
    srcNodata: scala.Int | scala.Double = null
  ): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst, s_srs = s_srs, src = src, t_srs = t_srs)
    if (cutline != null) __obj.updateDynamic("cutline")(cutline)
    if (dstAlphaBand != null) __obj.updateDynamic("dstAlphaBand")(dstAlphaBand.asInstanceOf[js.Any])
    if (dstBands != null) __obj.updateDynamic("dstBands")(dstBands)
    if (dstNodata != null) __obj.updateDynamic("dstNodata")(dstNodata.asInstanceOf[js.Any])
    if (maxError != null) __obj.updateDynamic("maxError")(maxError.asInstanceOf[js.Any])
    if (memoryLimit != null) __obj.updateDynamic("memoryLimit")(memoryLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resampling != null) __obj.updateDynamic("resampling")(resampling)
    if (srcAlphaBand != null) __obj.updateDynamic("srcAlphaBand")(srcAlphaBand.asInstanceOf[js.Any])
    if (srcBands != null) __obj.updateDynamic("srcBands")(srcBands)
    if (srcNodata != null) __obj.updateDynamic("srcNodata")(srcNodata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
}

