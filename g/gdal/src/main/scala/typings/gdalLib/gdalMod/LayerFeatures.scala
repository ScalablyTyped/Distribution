package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFeatures extends js.Object {
  val layer: Layer = js.native
  def add(feature: Feature): scala.Unit = js.native
  def count(): scala.Double = js.native
  def count(force: scala.Boolean): scala.Double = js.native
  def first(): Feature = js.native
  def forEach(callback: js.Function2[/* feature */ Feature, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(id: scala.Double): Feature = js.native
  def map[T](callback: js.Function2[/* feature */ Feature, /* i */ scala.Double, T]): js.Array[T] = js.native
  def next(): Feature = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def set(id: scala.Double, feature: Feature): scala.Unit = js.native
}

