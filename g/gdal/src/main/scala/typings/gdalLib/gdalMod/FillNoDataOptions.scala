package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FillNoDataOptions extends js.Object {
  var mask: js.UndefOr[RasterBand] = js.undefined
  var searchDist: scala.Double
  var smoothingIterations: js.UndefOr[scala.Double] = js.undefined
  var src: RasterBand
}

