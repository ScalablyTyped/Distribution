package typings.gifwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dither extends js.Object {
   // default = true
  var calculateErrorLikeGIMP: js.UndefOr[Boolean] = js.native
  var ditherAlgorithm: DitherAlgorithm = js.native
  var minimumColorDistanceToDither: js.UndefOr[Double] = js.native
   // default = 0
  var serpentine: js.UndefOr[Boolean] = js.native
}

object Dither {
  @scala.inline
  def apply(ditherAlgorithm: DitherAlgorithm): Dither = {
    val __obj = js.Dynamic.literal(ditherAlgorithm = ditherAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dither]
  }
  @scala.inline
  implicit class DitherOps[Self <: Dither] (val x: Self) extends AnyVal {
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
    def setDitherAlgorithm(value: DitherAlgorithm): Self = this.set("ditherAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalculateErrorLikeGIMP(value: Boolean): Self = this.set("calculateErrorLikeGIMP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateErrorLikeGIMP: Self = this.set("calculateErrorLikeGIMP", js.undefined)
    @scala.inline
    def setMinimumColorDistanceToDither(value: Double): Self = this.set("minimumColorDistanceToDither", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumColorDistanceToDither: Self = this.set("minimumColorDistanceToDither", js.undefined)
    @scala.inline
    def setSerpentine(value: Boolean): Self = this.set("serpentine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerpentine: Self = this.set("serpentine", js.undefined)
  }
  
}

