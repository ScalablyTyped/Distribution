package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SieveFilterOptions extends js.Object {
  var connectedness: js.UndefOr[scala.Double] = js.undefined
  var dst: RasterBand
  var mask: js.UndefOr[RasterBand] = js.undefined
  var src: RasterBand
  var threshold: scala.Double
}

