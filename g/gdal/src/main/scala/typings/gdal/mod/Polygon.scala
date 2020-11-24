package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "Polygon")
@js.native
class Polygon () extends Geometry {
  
  def getArea(): Double = js.native
  
  var rings: PolygonRings = js.native
}
