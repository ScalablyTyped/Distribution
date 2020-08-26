package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBandOverviews extends js.Object {
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]): Unit = js.native
  def get(index: Double): RasterBand = js.native
  def getBySampleCount(samples: Double): RasterBand = js.native
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, T]): js.Array[T] = js.native
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
  @scala.inline
  implicit class RasterBandOverviewsOps[Self <: RasterBandOverviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def setForEach(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Double => RasterBand): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBySampleCount(value: Double => RasterBand): Self = this.set("getBySampleCount", js.Any.fromFunction1(value))
    @scala.inline
    def setMap(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
  }
  
}

