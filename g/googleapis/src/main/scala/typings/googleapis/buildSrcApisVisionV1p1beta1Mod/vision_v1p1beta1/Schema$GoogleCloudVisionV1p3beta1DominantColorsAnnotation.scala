package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1DominantColorsAnnotation extends js.Object {
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p3beta1ColorInfo]] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1DominantColorsAnnotation {
  @scala.inline
  def apply(colors: js.Array[Schema$GoogleCloudVisionV1p3beta1ColorInfo] = null): Schema$GoogleCloudVisionV1p3beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1DominantColorsAnnotation]
  }
}

