package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[DominantColorsAnnotation] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(dominantColors: DominantColorsAnnotation = null): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (dominantColors != null) __obj.updateDynamic("dominantColors")(dominantColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

