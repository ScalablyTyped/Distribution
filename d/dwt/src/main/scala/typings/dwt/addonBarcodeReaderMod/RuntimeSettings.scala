package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeSettings extends js.Object {
  
  var barcodeFormatIds: Double = js.native
  
  var barcodeFormatIds_2: Double = js.native
  
  var binarizationModes: js.Array[Double] = js.native
  
  var deblurLevel: Double = js.native
  
  var expectedBarcodesCount: Double = js.native
  
  var furtherModes: FurtherModes = js.native
  
  var intermediateResultSavingMode: Double = js.native
  
  var intermediateResultTypes: Double = js.native
  
  var localizationModes: js.Array[Double] = js.native
  
  var maxAlgorithmThreadCount: Double = js.native
  
  var minBarcodeTextLength: Double = js.native
  
  var minResultConfidence: Double = js.native
  
  var pdfRasterDPI: Double = js.native
  
  var pdfReadingMode: Double = js.native
  
  var region: Region = js.native
  
  var resultCoordinateType: Double = js.native
  
  var returnBarcodeZoneClarity: Double = js.native
  
  var scaleDownThreshold: Double = js.native
  
  var scaleUpModes: js.Array[Double] = js.native
  
  var terminatePhase: Double = js.native
  
  var textResultOrderModes: js.Array[Double] = js.native
  
  var timeout: Double = js.native
}
object RuntimeSettings {
  
  @scala.inline
  def apply(
    barcodeFormatIds: Double,
    barcodeFormatIds_2: Double,
    binarizationModes: js.Array[Double],
    deblurLevel: Double,
    expectedBarcodesCount: Double,
    furtherModes: FurtherModes,
    intermediateResultSavingMode: Double,
    intermediateResultTypes: Double,
    localizationModes: js.Array[Double],
    maxAlgorithmThreadCount: Double,
    minBarcodeTextLength: Double,
    minResultConfidence: Double,
    pdfRasterDPI: Double,
    pdfReadingMode: Double,
    region: Region,
    resultCoordinateType: Double,
    returnBarcodeZoneClarity: Double,
    scaleDownThreshold: Double,
    scaleUpModes: js.Array[Double],
    terminatePhase: Double,
    textResultOrderModes: js.Array[Double],
    timeout: Double
  ): RuntimeSettings = {
    val __obj = js.Dynamic.literal(barcodeFormatIds = barcodeFormatIds.asInstanceOf[js.Any], barcodeFormatIds_2 = barcodeFormatIds_2.asInstanceOf[js.Any], binarizationModes = binarizationModes.asInstanceOf[js.Any], deblurLevel = deblurLevel.asInstanceOf[js.Any], expectedBarcodesCount = expectedBarcodesCount.asInstanceOf[js.Any], furtherModes = furtherModes.asInstanceOf[js.Any], intermediateResultSavingMode = intermediateResultSavingMode.asInstanceOf[js.Any], intermediateResultTypes = intermediateResultTypes.asInstanceOf[js.Any], localizationModes = localizationModes.asInstanceOf[js.Any], maxAlgorithmThreadCount = maxAlgorithmThreadCount.asInstanceOf[js.Any], minBarcodeTextLength = minBarcodeTextLength.asInstanceOf[js.Any], minResultConfidence = minResultConfidence.asInstanceOf[js.Any], pdfRasterDPI = pdfRasterDPI.asInstanceOf[js.Any], pdfReadingMode = pdfReadingMode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resultCoordinateType = resultCoordinateType.asInstanceOf[js.Any], returnBarcodeZoneClarity = returnBarcodeZoneClarity.asInstanceOf[js.Any], scaleDownThreshold = scaleDownThreshold.asInstanceOf[js.Any], scaleUpModes = scaleUpModes.asInstanceOf[js.Any], terminatePhase = terminatePhase.asInstanceOf[js.Any], textResultOrderModes = textResultOrderModes.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeSettings]
  }
  
  @scala.inline
  implicit class RuntimeSettingsOps[Self <: RuntimeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarcodeFormatIds(value: Double): Self = this.set("barcodeFormatIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarcodeFormatIds_2(value: Double): Self = this.set("barcodeFormatIds_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinarizationModesVarargs(value: Double*): Self = this.set("binarizationModes", js.Array(value :_*))
    
    @scala.inline
    def setBinarizationModes(value: js.Array[Double]): Self = this.set("binarizationModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeblurLevel(value: Double): Self = this.set("deblurLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBarcodesCount(value: Double): Self = this.set("expectedBarcodesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFurtherModes(value: FurtherModes): Self = this.set("furtherModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateResultSavingMode(value: Double): Self = this.set("intermediateResultSavingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateResultTypes(value: Double): Self = this.set("intermediateResultTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationModesVarargs(value: Double*): Self = this.set("localizationModes", js.Array(value :_*))
    
    @scala.inline
    def setLocalizationModes(value: js.Array[Double]): Self = this.set("localizationModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAlgorithmThreadCount(value: Double): Self = this.set("maxAlgorithmThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBarcodeTextLength(value: Double): Self = this.set("minBarcodeTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResultConfidence(value: Double): Self = this.set("minResultConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfRasterDPI(value: Double): Self = this.set("pdfRasterDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfReadingMode(value: Double): Self = this.set("pdfReadingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCoordinateType(value: Double): Self = this.set("resultCoordinateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnBarcodeZoneClarity(value: Double): Self = this.set("returnBarcodeZoneClarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownThreshold(value: Double): Self = this.set("scaleDownThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUpModesVarargs(value: Double*): Self = this.set("scaleUpModes", js.Array(value :_*))
    
    @scala.inline
    def setScaleUpModes(value: js.Array[Double]): Self = this.set("scaleUpModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatePhase(value: Double): Self = this.set("terminatePhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextResultOrderModesVarargs(value: Double*): Self = this.set("textResultOrderModes", js.Array(value :_*))
    
    @scala.inline
    def setTextResultOrderModes(value: js.Array[Double]): Self = this.set("textResultOrderModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
