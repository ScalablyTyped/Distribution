package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "GeometryCollection")
@js.native
class GeometryCollection () extends Geometry {
  var children: GeometryCollectionChildren = js.native
  def getArea(): scala.Double = js.native
  def getLength(): scala.Double = js.native
}

