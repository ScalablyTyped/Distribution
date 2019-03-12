package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandOverviews extends js.Object {
  def count(): scala.Double
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, scala.Unit]): scala.Unit
  def get(index: scala.Double): RasterBand
  def getBySampleCount(samples: scala.Double): RasterBand
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, T]): js.Array[T]
}

object RasterBandOverviews {
  @scala.inline
  def apply(
    count: () => scala.Double,
    forEach: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, scala.Unit] => scala.Unit,
    get: scala.Double => RasterBand,
    getBySampleCount: scala.Double => RasterBand,
    map: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, js.Any] => js.Array[js.Any]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getBySampleCount = js.Any.fromFunction1(getBySampleCount), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[RasterBandOverviews]
  }
}

