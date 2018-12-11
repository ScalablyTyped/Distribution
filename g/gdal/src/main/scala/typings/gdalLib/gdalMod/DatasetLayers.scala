package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetLayers extends js.Object {
  val ds: Dataset = js.native
  def copy(src_lyr_name: java.lang.String, dst_lyr_name: java.lang.String): Layer = js.native
  def copy(
    src_lyr_name: java.lang.String,
    dst_lyr_name: java.lang.String,
    options: js.Array[java.lang.String]
  ): Layer = js.native
  def copy(src_lyr_name: java.lang.String, dst_lyr_name: java.lang.String, options: js.Object): Layer = js.native
  def count(): scala.Double = js.native
  def create(
    name: java.lang.String,
    srs: SpatialReference,
    geomType: Geometry,
    creation_options: js.Array[java.lang.String]
  ): Layer = js.native
  def create(name: java.lang.String, srs: SpatialReference, geomType: Geometry, creation_options: js.Object): Layer = js.native
  def create(
    name: java.lang.String,
    srs: SpatialReference,
    geomType: scala.Double,
    creation_options: js.Array[java.lang.String]
  ): Layer = js.native
  def create(name: java.lang.String, srs: SpatialReference, geomType: scala.Double, creation_options: js.Object): Layer = js.native
  def forEach(callback: js.Function2[/* layer */ Layer, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String): Layer = js.native
  def get(key: scala.Double): Layer = js.native
  def map[T](callback: js.Function2[/* layer */ Layer, /* i */ scala.Double, T]): js.Array[T] = js.native
  def remove(index: scala.Double): scala.Unit = js.native
}

