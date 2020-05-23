package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameRequest extends js.Object {
  var anchors: js.UndefOr[ARFrameAnchorRequest] = js.undefined
  var capturedDepthData: js.UndefOr[Boolean] = js.undefined
  var lightEstimation: js.UndefOr[Boolean] = js.undefined
  var rawFeaturePoints: js.UndefOr[Boolean] = js.undefined
}

object ARFrameRequest {
  @scala.inline
  def apply(
    anchors: ARFrameAnchorRequest = null,
    capturedDepthData: js.UndefOr[Boolean] = js.undefined,
    lightEstimation: js.UndefOr[Boolean] = js.undefined,
    rawFeaturePoints: js.UndefOr[Boolean] = js.undefined
  ): ARFrameRequest = {
    val __obj = js.Dynamic.literal()
    if (anchors != null) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (!js.isUndefined(capturedDepthData)) __obj.updateDynamic("capturedDepthData")(capturedDepthData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lightEstimation)) __obj.updateDynamic("lightEstimation")(lightEstimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rawFeaturePoints)) __obj.updateDynamic("rawFeaturePoints")(rawFeaturePoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrameRequest]
  }
}

