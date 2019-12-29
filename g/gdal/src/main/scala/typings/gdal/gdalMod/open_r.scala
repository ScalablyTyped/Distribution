package typings.gdal.gdalMod

import typings.gdal.gdalStrings.r
import typings.gdal.gdalStrings.rPlussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "open")
@js.native
object open_r extends js.Object {
  def apply(path: String, mode: r): Dataset = js.native
  def apply(path: String, mode: rPlussign): Dataset = js.native
  def apply(path: String, mode: rPlussign, drivers: String): Dataset = js.native
  def apply(path: String, mode: rPlussign, drivers: js.Array[String]): Dataset = js.native
  def apply(path: String, mode: r, drivers: String): Dataset = js.native
  def apply(path: String, mode: r, drivers: js.Array[String]): Dataset = js.native
}

