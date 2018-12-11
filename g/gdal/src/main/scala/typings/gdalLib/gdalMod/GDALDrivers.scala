package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GDALDrivers extends js.Object {
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* driver */ Driver, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(index: java.lang.String): Driver = js.native
  def get(index: scala.Double): Driver = js.native
  def getNames(): js.Array[java.lang.String] = js.native
  def map[T](callback: js.Function2[/* driver */ Driver, /* i */ scala.Double, T]): js.Array[T] = js.native
}

