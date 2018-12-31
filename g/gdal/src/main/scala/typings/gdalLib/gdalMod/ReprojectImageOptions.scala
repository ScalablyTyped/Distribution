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

