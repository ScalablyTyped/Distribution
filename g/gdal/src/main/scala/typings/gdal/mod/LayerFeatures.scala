package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFeatures extends js.Object {
  val layer: Layer = js.native
  def add(feature: Feature): Unit = js.native
  def count(): Double = js.native
  def count(force: Boolean): Double = js.native
  def first(): Feature = js.native
  def forEach(callback: js.Function2[/* feature */ Feature, /* i */ Double, Unit]): Unit = js.native
  def get(id: Double): Feature = js.native
  def map[T](callback: js.Function2[/* feature */ Feature, /* i */ Double, T]): js.Array[T] = js.native
  def next(): Feature = js.native
  def remove(id: Double): Unit = js.native
  def set(id: Double, feature: Feature): Unit = js.native
}

