package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFields extends js.Object {
  val layer: Layer = js.native
  def add(`def`: js.Array[FieldDefn]): Unit = js.native
  def add(`def`: js.Array[FieldDefn], approx: Boolean): Unit = js.native
  def add(`def`: FieldDefn): Unit = js.native
  def add(`def`: FieldDefn, approx: Boolean): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* field */ FieldDefn, /* i */ Double, Unit]): Unit = js.native
  def fromJSON(`object`: js.Object): LayerFields = js.native
  def fromJSON(`object`: js.Object, approx_ok: Boolean): LayerFields = js.native
  def get(field: String): FieldDefn = js.native
  def get(field: Double): FieldDefn = js.native
  def getNames(): js.Array[String] = js.native
  def indexOf(field: String): Double = js.native
  def map[T](callback: js.Function2[/* field */ FieldDefn, /* i */ Double, T]): js.Array[T] = js.native
  def remove(field: String): Unit = js.native
  def remove(field: Double): Unit = js.native
  def reorder(map: js.Array[Double]): Unit = js.native
}

