package typings.expo.aRMod

import typings.expo.anon.BlendShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameAnchorRequest extends js.Object {
  var ARFaceTrackingConfiguration: js.UndefOr[BlendShapes] = js.undefined
}

object ARFrameAnchorRequest {
  @scala.inline
  def apply(ARFaceTrackingConfiguration: BlendShapes = null): ARFrameAnchorRequest = {
    val __obj = js.Dynamic.literal()
    if (ARFaceTrackingConfiguration != null) __obj.updateDynamic("ARFaceTrackingConfiguration")(ARFaceTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrameAnchorRequest]
  }
}

