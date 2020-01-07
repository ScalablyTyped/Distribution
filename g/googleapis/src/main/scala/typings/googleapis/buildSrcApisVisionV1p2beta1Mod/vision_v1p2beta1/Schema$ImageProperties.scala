package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait Schema$ImageProperties extends js.Object {
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[Schema$DominantColorsAnnotation] = js.native
}

object Schema$ImageProperties {
  @scala.inline
  def apply(dominantColors: Schema$DominantColorsAnnotation = null): Schema$ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (dominantColors != null) __obj.updateDynamic("dominantColors")(dominantColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageProperties]
  }
}

