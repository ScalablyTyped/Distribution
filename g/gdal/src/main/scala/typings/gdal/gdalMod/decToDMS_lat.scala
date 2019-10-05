package typings.gdal.gdalMod

import typings.gdal.gdalStrings.lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "decToDMS")
@js.native
object decToDMS_lat extends js.Object {
  def apply(angle: Double, axis: lat): String = js.native
  def apply(angle: Double, axis: lat, precision: Double): String = js.native
}

