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
    count: js.Function0[scala.Double],
    create: js.Function1[scala.Double, RasterBand],
    ds: Dataset,
    forEach: js.Function1[js.Function2[/* band */ RasterBand, /* i */ scala.Double, scala.Unit], scala.Unit],
    get: js.Function1[scala.Double, RasterBand],
    map: js.Function1[
      js.Function2[/* band */ RasterBand, /* i */ scala.Double, js.Any], 
      js.Array[js.Any]
    ]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("ds")(ds)
    __obj.updateDynamic("forEach")(forEach)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[DatasetBands]
  }
}

