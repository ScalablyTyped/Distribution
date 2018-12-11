package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFields extends js.Object {
  val layer: Layer = js.native
  def add(`def`: FieldDefn): scala.Unit = js.native
  def add(`def`: FieldDefn, approx: scala.Boolean): scala.Unit = js.native
  def add(`def`: js.Array[FieldDefn]): scala.Unit = js.native
  def add(`def`: js.Array[FieldDefn], approx: scala.Boolean): scala.Unit = js.native
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* field */ FieldDefn, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def fromJSON(`object`: js.Object): LayerFields = js.native
  def fromJSON(`object`: js.Object, approx_ok: scala.Boolean): LayerFields = js.native
  def get(field: java.lang.String): FieldDefn = js.native
  def get(field: scala.Double): FieldDefn = js.native
  def getNames(): js.Array[java.lang.String] = js.native
  def indexOf(field: java.lang.String): scala.Double = js.native
  def map[T](callback: js.Function2[/* field */ FieldDefn, /* i */ scala.Double, T]): js.Array[T] = js.native
  def remove(field: java.lang.String): scala.Unit = js.native
  def remove(field: scala.Double): scala.Unit = js.native
  def reorder(map: js.Array[scala.Double]): scala.Unit = js.native
}

