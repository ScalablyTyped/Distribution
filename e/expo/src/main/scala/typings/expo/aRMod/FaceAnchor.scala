package typings.expo.aRMod

import typings.expo.aRMod.AnchorType.Face
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Face,   isTracked  :boolean,   geometry ? :expo.expo/build/AR.FaceGeometry,   blendShapes ? :{[ shape in expo.expo/build/AR.BlendShape ]:? number}} */
trait FaceAnchor extends Anchor {
  var blendShapes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typings.expo.expoStrings.FaceAnchor with js.Any
  ] = js.undefined
  var geometry: js.UndefOr[FaceGeometry] = js.undefined
  var id: String
  var isTracked: Boolean
  var transform: Matrix
  var `type`: AnchorType with Face
}

object FaceAnchor {
  @scala.inline
  def apply(
    id: String,
    isTracked: Boolean,
    transform: Matrix,
    `type`: AnchorType with Face,
    blendShapes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typings.expo.expoStrings.FaceAnchor with js.Any = null,
    geometry: FaceGeometry = null
  ): FaceAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isTracked = isTracked.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendShapes != null) __obj.updateDynamic("blendShapes")(blendShapes.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceAnchor]
  }
}

