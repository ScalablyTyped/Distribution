package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandOverviews extends js.Object {
  def count(): Double
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]): Unit
  def get(index: Double): RasterBand
  def getBySampleCount(samples: Double): RasterBand
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, T]): js.Array[T]
}

object RasterBandOverviews {
  @scala.inline
  def apply(
    count: () => Double,
    forEach: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Unit,
    get: Double => RasterBand,
    getBySampleCount: Double => RasterBand,
    map: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getBySampleCount = js.Any.fromFunction1(getBySampleCount), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[RasterBandOverviews]
  }
}

