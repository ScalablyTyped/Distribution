package typings.expo

import typings.expo.aRMod.AnchorType.Face
import typings.expo.aRMod.FaceGeometry
import typings.expo.expoStrings.Anon_BlendShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlendShapes extends js.Object {
  var blendShapes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ Anon_BlendShapes with js.Any
  ] = js.undefined
  var geometry: js.UndefOr[FaceGeometry] = js.undefined
  var isTracked: Boolean
  var `type`: Face
}

object AnonBlendShapes {
  @scala.inline
  def apply(
    isTracked: Boolean,
    `type`: Face,
    blendShapes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ Anon_BlendShapes with js.Any = null,
    geometry: FaceGeometry = null
  ): AnonBlendShapes = {
    val __obj = js.Dynamic.literal(isTracked = isTracked.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlendShapes]
  }
}

