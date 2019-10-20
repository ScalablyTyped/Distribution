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
    val __obj = js.Dynamic.literal(barcodeFormatIds = barcodeFormatIds, binarizationModes = binarizationModes, deblurLevel = deblurLevel, expectedBarcodesCount = expectedBarcodesCount, localizationModes = localizationModes, minBarcodeTextLength = minBarcodeTextLength, minResultConfidence = minResultConfidence, region = region, resultCoordinateType = resultCoordinateType, scaleDownThreshold = scaleDownThreshold, textResultOrderModes = textResultOrderModes, timeout = timeout)
  
    __obj.asInstanceOf[RunTimeSetting]
  }
}

