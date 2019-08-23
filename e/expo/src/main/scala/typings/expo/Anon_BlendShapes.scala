package typings.expo

import typings.expo.buildARMod.AnchorType.Face
import typings.expo.buildARMod.FaceGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlendShapes extends js.Object {
  var blendShapes: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typings.expo.expoStrings.Anon_BlendShapes with js.Any
  ] = js.undefined
  var geometry: js.UndefOr[FaceGeometry] = js.undefined
  var isTracked: Boolean
  var `type`: Face
}

object Anon_BlendShapes {
  @scala.inline
  def apply(
    isTracked: Boolean,
    `type`: Face,
    blendShapes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typings.expo.expoStrings.Anon_BlendShapes with js.Any = null,
    geometry: FaceGeometry = null
  ): Anon_BlendShapes = {
    val __obj = js.Dynamic.literal(isTracked = isTracked)
    __obj.updateDynamic("type")(`type`)
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    __obj.asInstanceOf[Anon_BlendShapes]
  }
}

