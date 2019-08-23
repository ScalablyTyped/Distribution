package typings.expo.buildARMod

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
    val __obj = js.Dynamic.literal(cameraCalibrationData = cameraCalibrationData, depthDataAccuracy = depthDataAccuracy, depthDataFiltered = depthDataFiltered, depthDataQuality = depthDataQuality, timestamp = timestamp)
  
    __obj.asInstanceOf[CapturedDepthData]
  }
}

