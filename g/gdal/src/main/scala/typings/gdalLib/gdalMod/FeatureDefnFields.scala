package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureDefnFields extends js.Object {
  val featureDefn: FeatureDefn = js.native
  def add(field: FieldDefn): scala.Unit = js.native
  def add(field: js.Array[FieldDefn]): scala.Unit = js.native
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* field */ FieldDefn, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String): FieldDefn = js.native
  def get(key: scala.Double): FieldDefn = js.native
  def getNames(): js.Array[java.lang.String] = js.native
  def indexOf(name: java.lang.String): scala.Double = js.native
  def map[T](callback: js.Function2[/* field */ FieldDefn, /* i */ scala.Double, T]): js.Array[T] = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(key: scala.Double): scala.Unit = js.native
  def reorder(map: js.Array[scala.Double]): scala.Unit = js.native
}

