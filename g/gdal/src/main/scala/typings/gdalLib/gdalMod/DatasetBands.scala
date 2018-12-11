package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatasetBands extends js.Object {
  val ds: Dataset
  def count(): scala.Double
  def create(dataType: scala.Double): RasterBand
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ scala.Double, scala.Unit]): scala.Unit
  def get(id: scala.Double): RasterBand
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ scala.Double, T]): js.Array[T]
}

