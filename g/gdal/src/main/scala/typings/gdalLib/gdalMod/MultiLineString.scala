package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "MultiLineString")
@js.native
class MultiLineString () extends GeometryCollection {
  def polygonize(): Polygon = js.native
}

