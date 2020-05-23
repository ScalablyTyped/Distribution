package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrame extends js.Object {
  var anchors: js.UndefOr[js.Array[Anchor] | Null] = js.undefined
  var capturedDepthData: js.UndefOr[CapturedDepthData | Null] = js.undefined
  var lightEstimation: js.UndefOr[LightEstimation | Null] = js.undefined
  var rawFeaturePoints: js.UndefOr[js.Array[RawFeaturePoint] | Null] = js.undefined
  var timestamp: Double
}

object ARFrame {
  @scala.inline
  def apply(
    timestamp: Double,
    anchors: js.UndefOr[Null | js.Array[Anchor]] = js.undefined,
    capturedDepthData: js.UndefOr[Null | CapturedDepthData] = js.undefined,
    lightEstimation: js.UndefOr[Null | LightEstimation] = js.undefined,
    rawFeaturePoints: js.UndefOr[Null | js.Array[RawFeaturePoint]] = js.undefined
  ): ARFrame = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(anchors)) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (!js.isUndefined(capturedDepthData)) __obj.updateDynamic("capturedDepthData")(capturedDepthData.asInstanceOf[js.Any])
    if (!js.isUndefined(lightEstimation)) __obj.updateDynamic("lightEstimation")(lightEstimation.asInstanceOf[js.Any])
    if (!js.isUndefined(rawFeaturePoints)) __obj.updateDynamic("rawFeaturePoints")(rawFeaturePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrame]
  }
}

