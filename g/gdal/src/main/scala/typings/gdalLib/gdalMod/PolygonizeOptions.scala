package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonizeOptions extends js.Object {
  var connectedness: js.UndefOr[scala.Double] = js.undefined
  var dst: Layer
  var mask: js.UndefOr[RasterBand] = js.undefined
  var pixValField: scala.Double
  var src: RasterBand
  var useFloats: js.UndefOr[scala.Boolean] = js.undefined
}

