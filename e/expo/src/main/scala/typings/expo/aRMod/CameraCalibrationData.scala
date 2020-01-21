package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraCalibrationData extends js.Object {
  var extrinsicMatrix: Matrix
  var intrinsicMatrix: Matrix
  var intrinsicMatrixReferenceDimensions: Size
  var inverseLensDistortionLookupTable: js.Any
  var lensDistortionCenter: Vector3
  var lensDistortionLookupTable: js.Any
  var pixelSize: Double
}

object CameraCalibrationData {
  @scala.inline
  def apply(
    extrinsicMatrix: Matrix,
    intrinsicMatrix: Matrix,
    intrinsicMatrixReferenceDimensions: Size,
    inverseLensDistortionLookupTable: js.Any,
    lensDistortionCenter: Vector3,
    lensDistortionLookupTable: js.Any,
    pixelSize: Double
  ): CameraCalibrationData = {
    val __obj = js.Dynamic.literal(extrinsicMatrix = extrinsicMatrix.asInstanceOf[js.Any], intrinsicMatrix = intrinsicMatrix.asInstanceOf[js.Any], intrinsicMatrixReferenceDimensions = intrinsicMatrixReferenceDimensions.asInstanceOf[js.Any], inverseLensDistortionLookupTable = inverseLensDistortionLookupTable.asInstanceOf[js.Any], lensDistortionCenter = lensDistortionCenter.asInstanceOf[js.Any], lensDistortionLookupTable = lensDistortionLookupTable.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CameraCalibrationData]
  }
}

