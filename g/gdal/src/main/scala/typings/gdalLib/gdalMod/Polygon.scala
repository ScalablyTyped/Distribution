package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Polygon")
@js.native
class Polygon () extends Geometry {
  var rings: PolygonRings = js.native
  def getArea(): scala.Double = js.native
}

