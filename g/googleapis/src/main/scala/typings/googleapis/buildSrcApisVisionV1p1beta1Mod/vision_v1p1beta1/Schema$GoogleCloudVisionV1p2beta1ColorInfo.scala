package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Color information consists of RGB channels, score, and the fraction of the
  * image that the color occupies in the image.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1ColorInfo extends js.Object {
  /**
    * RGB components of the color.
    */
  var color: js.UndefOr[Schema$Color] = js.native
  /**
    * The fraction of pixels the color occupies in the image. Value in range
    * [0, 1].
    */
  var pixelFraction: js.UndefOr[Double] = js.native
  /**
    * Image-specific score for this color. Value in range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1ColorInfo {
  @scala.inline
  def apply(color: Schema$Color = null, pixelFraction: Int | Double = null, score: Int | Double = null): Schema$GoogleCloudVisionV1p2beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pixelFraction != null) __obj.updateDynamic("pixelFraction")(pixelFraction.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1ColorInfo]
  }
}

