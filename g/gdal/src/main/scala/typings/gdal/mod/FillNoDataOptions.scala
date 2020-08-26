package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillNoDataOptions extends js.Object {
  var mask: js.UndefOr[RasterBand] = js.native
  var searchDist: Double = js.native
  var smoothingIterations: js.UndefOr[Double] = js.native
  var src: RasterBand = js.native
}

object FillNoDataOptions {
  @scala.inline
  def apply(searchDist: Double, src: RasterBand): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
  @scala.inline
  implicit class FillNoDataOptionsOps[Self <: FillNoDataOptions] (val x: Self) extends AnyVal {
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
    def setSearchDist(value: Double): Self = this.set("searchDist", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: RasterBand): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: RasterBand): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setSmoothingIterations(value: Double): Self = this.set("smoothingIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothingIterations: Self = this.set("smoothingIterations", js.undefined)
  }
  
}

