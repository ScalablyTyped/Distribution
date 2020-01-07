package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait Schema$DominantColorsAnnotation extends js.Object {
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[Schema$ColorInfo]] = js.native
}

object Schema$DominantColorsAnnotation {
  @scala.inline
  def apply(colors: js.Array[Schema$ColorInfo] = null): Schema$DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DominantColorsAnnotation]
  }
}

