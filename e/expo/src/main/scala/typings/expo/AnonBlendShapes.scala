package typings.expo

import typings.expo.aRMod.BlendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlendShapes extends js.Object {
  var blendShapes: js.UndefOr[Boolean | js.Array[BlendShape]] = js.undefined
  var geometry: js.UndefOr[Boolean] = js.undefined
}

object AnonBlendShapes {
  @scala.inline
  def apply(blendShapes: Boolean | js.Array[BlendShape] = null, geometry: js.UndefOr[Boolean] = js.undefined): AnonBlendShapes = {
    val __obj = js.Dynamic.literal()
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (!js.isUndefined(geometry)) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlendShapes]
  }
}

