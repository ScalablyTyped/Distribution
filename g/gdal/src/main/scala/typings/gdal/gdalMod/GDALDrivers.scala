package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GDALDrivers extends js.Object {
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* driver */ Driver, /* i */ Double, Unit]): Unit = js.native
  def get(index: String): Driver = js.native
  def get(index: Double): Driver = js.native
  def getNames(): js.Array[String] = js.native
  def map[T](callback: js.Function2[/* driver */ Driver, /* i */ Double, T]): js.Array[T] = js.native
}

