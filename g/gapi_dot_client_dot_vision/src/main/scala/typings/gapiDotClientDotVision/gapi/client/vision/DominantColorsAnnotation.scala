package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DominantColorsAnnotation extends js.Object {
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[ColorInfo]] = js.undefined
}

object DominantColorsAnnotation {
  @scala.inline
  def apply(colors: js.Array[ColorInfo] = null): DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DominantColorsAnnotation]
  }
}

