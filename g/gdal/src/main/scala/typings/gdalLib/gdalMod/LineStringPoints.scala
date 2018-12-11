package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStringPoints extends js.Object {
  def add(point: Point): scala.Unit = js.native
  def add(point: js.Array[Point]): scala.Unit = js.native
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* point */ Point, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(index: scala.Double): Point = js.native
  def map[T](callback: js.Function2[/* point */ Point, /* i */ scala.Double, T]): js.Array[T] = js.native
  def remove(index: scala.Double): scala.Unit = js.native
  def resize(count: scala.Double): scala.Unit = js.native
  def reverse(): scala.Unit = js.native
  def set(index: scala.Double, point: Point): scala.Unit = js.native
  def toArray(): js.Array[Point] = js.native
}

