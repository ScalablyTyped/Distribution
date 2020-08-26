package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropHint extends js.Object {
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image's scale, as returned in `ImageParams`.
    */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.native
  /** Confidence of this being a salient region.  Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Fraction of importance of this salient region with respect to the original
    * image.
    */
  var importanceFraction: js.UndefOr[Double] = js.native
}

object CropHint {
  @scala.inline
  def apply(): CropHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHint]
  }
  @scala.inline
  implicit class CropHintOps[Self <: CropHint] (val x: Self) extends AnyVal {
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
    def setBoundingPoly(value: BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setImportanceFraction(value: Double): Self = this.set("importanceFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportanceFraction: Self = this.set("importanceFraction", js.undefined)
  }
  
}

