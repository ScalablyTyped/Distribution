package typings.expo.expoMod

import typings.expo.Anon_Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackedFaceFeature extends FaceFeature {
  var faceID: js.UndefOr[Double] = js.undefined
}

object TrackedFaceFeature {
  @scala.inline
  def apply(
    bounds: Anon_Origin,
    bottomMouthPosition: Point = null,
    faceID: Int | Double = null,
    leftCheekPosition: Point = null,
    leftEarPosition: Point = null,
    leftEyeOpenProbability: Int | Double = null,
    leftEyePosition: Point = null,
    leftMouthPosition: Point = null,
    mouthPosition: Point = null,
    noseBasePosition: Point = null,
    rightCheekPosition: Point = null,
    rightEarPosition: Point = null,
    rightEyeOpenProbability: Int | Double = null,
    rightEyePosition: Point = null,
    rightMouthPosition: Point = null,
    rollAngle: Int | Double = null,
    smilingProbability: Int | Double = null,
    yawAngle: Int | Double = null
  ): TrackedFaceFeature = {
    val __obj = js.Dynamic.literal(bounds = bounds)
    if (bottomMouthPosition != null) __obj.updateDynamic("bottomMouthPosition")(bottomMouthPosition)
    if (faceID != null) __obj.updateDynamic("faceID")(faceID.asInstanceOf[js.Any])
    if (leftCheekPosition != null) __obj.updateDynamic("leftCheekPosition")(leftCheekPosition)
    if (leftEarPosition != null) __obj.updateDynamic("leftEarPosition")(leftEarPosition)
    if (leftEyeOpenProbability != null) __obj.updateDynamic("leftEyeOpenProbability")(leftEyeOpenProbability.asInstanceOf[js.Any])
    if (leftEyePosition != null) __obj.updateDynamic("leftEyePosition")(leftEyePosition)
    if (leftMouthPosition != null) __obj.updateDynamic("leftMouthPosition")(leftMouthPosition)
    if (mouthPosition != null) __obj.updateDynamic("mouthPosition")(mouthPosition)
    if (noseBasePosition != null) __obj.updateDynamic("noseBasePosition")(noseBasePosition)
    if (rightCheekPosition != null) __obj.updateDynamic("rightCheekPosition")(rightCheekPosition)
    if (rightEarPosition != null) __obj.updateDynamic("rightEarPosition")(rightEarPosition)
    if (rightEyeOpenProbability != null) __obj.updateDynamic("rightEyeOpenProbability")(rightEyeOpenProbability.asInstanceOf[js.Any])
    if (rightEyePosition != null) __obj.updateDynamic("rightEyePosition")(rightEyePosition)
    if (rightMouthPosition != null) __obj.updateDynamic("rightMouthPosition")(rightMouthPosition)
    if (rollAngle != null) __obj.updateDynamic("rollAngle")(rollAngle.asInstanceOf[js.Any])
    if (smilingProbability != null) __obj.updateDynamic("smilingProbability")(smilingProbability.asInstanceOf[js.Any])
    if (yawAngle != null) __obj.updateDynamic("yawAngle")(yawAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedFaceFeature]
  }
}

