package typings.expo

import typings.expo.buildARMod.BlendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlendShapesGeometry extends js.Object {
  var blendShapes: js.UndefOr[Boolean | js.Array[BlendShape]] = js.undefined
  var geometry: js.UndefOr[Boolean] = js.undefined
}

object Anon_BlendShapesGeometry {
  @scala.inline
  def apply(blendShapes: Boolean | js.Array[BlendShape] = null, geometry: js.UndefOr[Boolean] = js.undefined): Anon_BlendShapesGeometry = {
    val __obj = js.Dynamic.literal()
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (!js.isUndefined(geometry)) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlendShapesGeometry]
  }
}

