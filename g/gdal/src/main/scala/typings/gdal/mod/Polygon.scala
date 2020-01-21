package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Polygon")
@js.native
class Polygon () extends Geometry {
  var rings: PolygonRings = js.native
  def getArea(): Double = js.native
}

