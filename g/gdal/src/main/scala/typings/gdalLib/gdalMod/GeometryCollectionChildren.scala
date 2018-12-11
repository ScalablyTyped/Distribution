package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryCollectionChildren extends js.Object {
  val layer: Layer = js.native
  def add(geometry: Geometry): scala.Unit = js.native
  def add(geometry: js.Array[Geometry]): scala.Unit = js.native
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* geometry */ Geometry, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(index: scala.Double): Geometry = js.native
  def map[T](callback: js.Function2[/* geometry */ Geometry, /* i */ scala.Double, T]): js.Array[T] = js.native
  def remove(index: scala.Double): scala.Unit = js.native
  def toArray(): js.Array[Geometry] = js.native
}

