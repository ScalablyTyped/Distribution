package typings.expo.buildARMod

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
    val __obj = js.Dynamic.literal(extrinsicMatrix = extrinsicMatrix, intrinsicMatrix = intrinsicMatrix, intrinsicMatrixReferenceDimensions = intrinsicMatrixReferenceDimensions, inverseLensDistortionLookupTable = inverseLensDistortionLookupTable, lensDistortionCenter = lensDistortionCenter, lensDistortionLookupTable = lensDistortionLookupTable, pixelSize = pixelSize)
  
    __obj.asInstanceOf[CameraCalibrationData]
  }
}

