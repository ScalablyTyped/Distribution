package typings.expo.aRMod

import typings.expo.AnonBlendShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameAnchorRequest extends js.Object {
  var ARFaceTrackingConfiguration: js.UndefOr[AnonBlendShapes] = js.undefined
}

object ARFrameAnchorRequest {
  @scala.inline
  def apply(ARFaceTrackingConfiguration: AnonBlendShapes = null): ARFrameAnchorRequest = {
    val __obj = js.Dynamic.literal()
    if (ARFaceTrackingConfiguration != null) __obj.updateDynamic("ARFaceTrackingConfiguration")(ARFaceTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrameAnchorRequest]
  }
}

