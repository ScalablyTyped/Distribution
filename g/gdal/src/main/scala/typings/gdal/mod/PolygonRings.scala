package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonRings extends js.Object {
  val layer: Layer = js.native
  def add(ring: js.Array[LinearRing]): Unit = js.native
  def add(ring: LinearRing): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* ring */ LinearRing, /* i */ Double, Unit]): Unit = js.native
  def get(index: Double): LinearRing = js.native
  def map[T](callback: js.Function2[/* ring */ LinearRing, /* i */ Double, T]): js.Array[T] = js.native
  def remove(index: Double): Unit = js.native
  def toArray(): js.Array[LinearRing] = js.native
}

