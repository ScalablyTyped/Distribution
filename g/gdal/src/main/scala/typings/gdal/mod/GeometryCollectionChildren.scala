package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryCollectionChildren extends js.Object {
  val layer: Layer = js.native
  def add(geometry: js.Array[Geometry]): Unit = js.native
  def add(geometry: Geometry): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* geometry */ Geometry, /* i */ Double, Unit]): Unit = js.native
  def get(index: Double): Geometry = js.native
  def map[T](callback: js.Function2[/* geometry */ Geometry, /* i */ Double, T]): js.Array[T] = js.native
  def remove(index: Double): Unit = js.native
  def toArray(): js.Array[Geometry] = js.native
}

