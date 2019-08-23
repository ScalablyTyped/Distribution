package typings.expo.buildARMod

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
    anchors: js.Array[Anchor] = null,
    capturedDepthData: CapturedDepthData = null,
    lightEstimation: LightEstimation = null,
    rawFeaturePoints: js.Array[RawFeaturePoint] = null
  ): ARFrame = {
    val __obj = js.Dynamic.literal(timestamp = timestamp)
    if (anchors != null) __obj.updateDynamic("anchors")(anchors)
    if (capturedDepthData != null) __obj.updateDynamic("capturedDepthData")(capturedDepthData)
    if (lightEstimation != null) __obj.updateDynamic("lightEstimation")(lightEstimation)
    if (rawFeaturePoints != null) __obj.updateDynamic("rawFeaturePoints")(rawFeaturePoints)
    __obj.asInstanceOf[ARFrame]
  }
}

