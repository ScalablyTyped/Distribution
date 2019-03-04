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
    count: js.Function0[scala.Double],
    forEach: js.Function1[
      js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, scala.Unit], 
      scala.Unit
    ],
    get: js.Function1[scala.Double, RasterBand],
    getBySampleCount: js.Function1[scala.Double, RasterBand],
    map: js.Function1[
      js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, js.Any], 
      js.Array[js.Any]
    ]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal(count = count, forEach = forEach, get = get, getBySampleCount = getBySampleCount, map = map)
  
    __obj.asInstanceOf[RasterBandOverviews]
  }
}

