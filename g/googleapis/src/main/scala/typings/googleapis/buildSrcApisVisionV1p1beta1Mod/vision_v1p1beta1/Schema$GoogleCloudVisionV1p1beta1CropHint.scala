package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Single crop hint that is used to generate a new crop when serving an image.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1CropHint extends js.Object {
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image&#39;s scale.
    */
  var boundingPoly: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1BoundingPoly] = js.native
  /**
    * Confidence of this being a salient region.  Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Fraction of importance of this salient region with respect to the
    * original image.
    */
  var importanceFraction: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1CropHint {
  @scala.inline
  def apply(
    boundingPoly: Schema$GoogleCloudVisionV1p1beta1BoundingPoly = null,
    confidence: Int | Double = null,
    importanceFraction: Int | Double = null
  ): Schema$GoogleCloudVisionV1p1beta1CropHint = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (importanceFraction != null) __obj.updateDynamic("importanceFraction")(importanceFraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1CropHint]
  }
}

