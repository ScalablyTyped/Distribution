package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTimeSetting extends js.Object {
  var barcodeFormatIds: Double
  var binarizationModes: js.Array[Double]
  var deblurLevel: Double
  var expectedBarcodesCount: Double
  var localizationModes: js.Array[Double]
  var minBarcodeTextLength: Double
  var minResultConfidence: Double
  var region: Region
  var resultCoordinateType: Double
  var scaleDownThreshold: Double
  var textResultOrderModes: js.Array[Double]
  var timeout: Double
}

object RunTimeSetting {
  @scala.inline
  def apply(
    barcodeFormatIds: Double,
    binarizationModes: js.Array[Double],
    deblurLevel: Double,
    expectedBarcodesCount: Double,
    localizationModes: js.Array[Double],
    minBarcodeTextLength: Double,
    minResultConfidence: Double,
    region: Region,
    resultCoordinateType: Double,
    scaleDownThreshold: Double,
    textResultOrderModes: js.Array[Double],
    timeout: Double
  ): RunTimeSetting = {
    val __obj = js.Dynamic.literal(barcodeFormatIds = barcodeFormatIds.asInstanceOf[js.Any], binarizationModes = binarizationModes.asInstanceOf[js.Any], deblurLevel = deblurLevel.asInstanceOf[js.Any], expectedBarcodesCount = expectedBarcodesCount.asInstanceOf[js.Any], localizationModes = localizationModes.asInstanceOf[js.Any], minBarcodeTextLength = minBarcodeTextLength.asInstanceOf[js.Any], minResultConfidence = minResultConfidence.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resultCoordinateType = resultCoordinateType.asInstanceOf[js.Any], scaleDownThreshold = scaleDownThreshold.asInstanceOf[js.Any], textResultOrderModes = textResultOrderModes.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTimeSetting]
  }
}

