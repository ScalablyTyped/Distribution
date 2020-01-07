package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1ImageProperties extends js.Object {
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1DominantColorsAnnotation] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1ImageProperties {
  @scala.inline
  def apply(dominantColors: Schema$GoogleCloudVisionV1p2beta1DominantColorsAnnotation = null): Schema$GoogleCloudVisionV1p2beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (dominantColors != null) __obj.updateDynamic("dominantColors")(dominantColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1ImageProperties]
  }
}

