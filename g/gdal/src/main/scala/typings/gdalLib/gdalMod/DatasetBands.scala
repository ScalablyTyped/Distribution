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

object DatasetBands {
  @scala.inline
  def apply(
    count: () => scala.Double,
    create: scala.Double => RasterBand,
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ scala.Double, scala.Unit] => scala.Unit,
    get: scala.Double => RasterBand,
    map: js.Function2[/* band */ RasterBand, /* i */ scala.Double, js.Any] => js.Array[js.Any]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), create = js.Any.fromFunction1(create), ds = ds, forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[DatasetBands]
  }
}

