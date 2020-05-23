package typings.expo.anon

import typings.expo.aRMod.BlendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendShapes extends js.Object {
  var blendShapes: js.UndefOr[Boolean | js.Array[BlendShape]] = js.undefined
  var geometry: js.UndefOr[Boolean] = js.undefined
}

object BlendShapes {
  @scala.inline
  def apply(blendShapes: Boolean | js.Array[BlendShape] = null, geometry: js.UndefOr[Boolean] = js.undefined): BlendShapes = {
    val __obj = js.Dynamic.literal()
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (!js.isUndefined(geometry)) __obj.updateDynamic("geometry")(geometry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendShapes]
  }
}

