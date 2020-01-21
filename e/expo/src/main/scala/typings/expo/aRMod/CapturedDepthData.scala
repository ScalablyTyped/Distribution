package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturedDepthData extends js.Object {
  var cameraCalibrationData: CameraCalibrationData
  var depthDataAccuracy: DepthDataAccuracy
  var depthDataFiltered: Boolean
  var depthDataQuality: DepthDataQuality
  var timestamp: Double
}

object CapturedDepthData {
  @scala.inline
  def apply(
    cameraCalibrationData: CameraCalibrationData,
    depthDataAccuracy: DepthDataAccuracy,
    depthDataFiltered: Boolean,
    depthDataQuality: DepthDataQuality,
    timestamp: Double
  ): CapturedDepthData = {
    val __obj = js.Dynamic.literal(cameraCalibrationData = cameraCalibrationData.asInstanceOf[js.Any], depthDataAccuracy = depthDataAccuracy.asInstanceOf[js.Any], depthDataFiltered = depthDataFiltered.asInstanceOf[js.Any], depthDataQuality = depthDataQuality.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CapturedDepthData]
  }
}

