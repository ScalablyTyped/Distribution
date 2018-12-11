package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "CoordinateTransformation")
@js.native
class CoordinateTransformation protected () extends js.Object {
  def this(source: SpatialReference, target: Dataset) = this()
  def this(source: SpatialReference, target: SpatialReference) = this()
  def transformPoint(x: scala.Double, y: scala.Double): XYZ = js.native
  def transformPoint(x: scala.Double, y: scala.Double, z: scala.Double): XYZ = js.native
}

