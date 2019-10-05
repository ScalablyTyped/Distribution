package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropHint extends js.Object {
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image's scale, as returned in `ImageParams`.
    */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  /** Confidence of this being a salient region.  Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  /**
    * Fraction of importance of this salient region with respect to the original
    * image.
    */
  var importanceFraction: js.UndefOr[Double] = js.undefined
}

object CropHint {
  @scala.inline
  def apply(
    boundingPoly: BoundingPoly = null,
    confidence: Int | Double = null,
    importanceFraction: Int | Double = null
  ): CropHint = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (importanceFraction != null) __obj.updateDynamic("importanceFraction")(importanceFraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropHint]
  }
}

