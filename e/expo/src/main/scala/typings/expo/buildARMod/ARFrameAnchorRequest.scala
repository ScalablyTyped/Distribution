package typings.expo.buildARMod

import typings.expo.Anon_BlendShapesGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameAnchorRequest extends js.Object {
  var ARFaceTrackingConfiguration: js.UndefOr[Anon_BlendShapesGeometry] = js.undefined
}

object ARFrameAnchorRequest {
  @scala.inline
  def apply(ARFaceTrackingConfiguration: Anon_BlendShapesGeometry = null): ARFrameAnchorRequest = {
    val __obj = js.Dynamic.literal()
    if (ARFaceTrackingConfiguration != null) __obj.updateDynamic("ARFaceTrackingConfiguration")(ARFaceTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrameAnchorRequest]
  }
}

