package typings.dwt

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeFormat
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeFormat2
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonDotBarcodeReaderMod {
  
  @js.native
  trait BarcodeReader extends StObject {
    
    /**
      * Read an image in the buffer and try to locate and decode barcode(s) on it.
      * @param index Specify the image to decode.
      */
    def decode(index: Double): js.Promise[TextResults] = js.native
    
    /**
      * Return the current runtime settings or the settings of the specified built-in template.
      * @param template Specify a built-in template.
      */
    def getRuntimeSettings(): js.Promise[RuntimeSettings] = js.native
    def getRuntimeSettings(template: String): js.Promise[RuntimeSettings] = js.native
    
    /**
      * Set up the barcode reader with advanced settings.
      * @param settings The runtime setting in the form of a string.
      */
    def initRuntimeSettingsWithString(settings: String): js.Promise[RuntimeSettings] = js.native
    
    /**
      * Reset all runtime settings to default values.
      */
    def resetRuntimeSettings(): js.Promise[RuntimeSettings] = js.native
    
    /**
      * Update the runtime settings with a given object or use the string "speed", "balance", or "coverage" to use our preset settings. The default setting is "coverage".
      * @param settings Specify the runtime settings.
      */
    def updateRuntimeSettings(settings: RuntimeSettings): js.Promise[RuntimeSettings] = js.native
  }
  
  trait FurtherModes extends StObject {
    
    var accompanyingTextRecognitionModes: js.Array[Double]
    
    var barcodeColourModes: js.Array[Double]
    
    var barcodeComplementModes: js.Array[Double]
    
    var colourClusteringModes: js.Array[Double]
    
    var colourConversionModes: js.Array[Double]
    
    var deformationResistingModes: js.Array[Double]
    
    var dpmCodeReadingModes: js.Array[Double]
    
    var grayscaleTransformationModes: js.Array[Double]
    
    var imagePreprocessingModes: js.Array[Double]
    
    var regionPredetectionModes: js.Array[Double]
    
    var textAssistedCorrectionMode: Double
    
    var textFilterModes: js.Array[Double]
    
    var textureDetectionModes: js.Array[Double]
  }
  object FurtherModes {
    
    inline def apply(
      accompanyingTextRecognitionModes: js.Array[Double],
      barcodeColourModes: js.Array[Double],
      barcodeComplementModes: js.Array[Double],
      colourClusteringModes: js.Array[Double],
      colourConversionModes: js.Array[Double],
      deformationResistingModes: js.Array[Double],
      dpmCodeReadingModes: js.Array[Double],
      grayscaleTransformationModes: js.Array[Double],
      imagePreprocessingModes: js.Array[Double],
      regionPredetectionModes: js.Array[Double],
      textAssistedCorrectionMode: Double,
      textFilterModes: js.Array[Double],
      textureDetectionModes: js.Array[Double]
    ): FurtherModes = {
      val __obj = js.Dynamic.literal(accompanyingTextRecognitionModes = accompanyingTextRecognitionModes.asInstanceOf[js.Any], barcodeColourModes = barcodeColourModes.asInstanceOf[js.Any], barcodeComplementModes = barcodeComplementModes.asInstanceOf[js.Any], colourClusteringModes = colourClusteringModes.asInstanceOf[js.Any], colourConversionModes = colourConversionModes.asInstanceOf[js.Any], deformationResistingModes = deformationResistingModes.asInstanceOf[js.Any], dpmCodeReadingModes = dpmCodeReadingModes.asInstanceOf[js.Any], grayscaleTransformationModes = grayscaleTransformationModes.asInstanceOf[js.Any], imagePreprocessingModes = imagePreprocessingModes.asInstanceOf[js.Any], regionPredetectionModes = regionPredetectionModes.asInstanceOf[js.Any], textAssistedCorrectionMode = textAssistedCorrectionMode.asInstanceOf[js.Any], textFilterModes = textFilterModes.asInstanceOf[js.Any], textureDetectionModes = textureDetectionModes.asInstanceOf[js.Any])
      __obj.asInstanceOf[FurtherModes]
    }
    
    extension [Self <: FurtherModes](x: Self) {
      
      inline def setAccompanyingTextRecognitionModes(value: js.Array[Double]): Self = StObject.set(x, "accompanyingTextRecognitionModes", value.asInstanceOf[js.Any])
      
      inline def setAccompanyingTextRecognitionModesVarargs(value: Double*): Self = StObject.set(x, "accompanyingTextRecognitionModes", js.Array(value*))
      
      inline def setBarcodeColourModes(value: js.Array[Double]): Self = StObject.set(x, "barcodeColourModes", value.asInstanceOf[js.Any])
      
      inline def setBarcodeColourModesVarargs(value: Double*): Self = StObject.set(x, "barcodeColourModes", js.Array(value*))
      
      inline def setBarcodeComplementModes(value: js.Array[Double]): Self = StObject.set(x, "barcodeComplementModes", value.asInstanceOf[js.Any])
      
      inline def setBarcodeComplementModesVarargs(value: Double*): Self = StObject.set(x, "barcodeComplementModes", js.Array(value*))
      
      inline def setColourClusteringModes(value: js.Array[Double]): Self = StObject.set(x, "colourClusteringModes", value.asInstanceOf[js.Any])
      
      inline def setColourClusteringModesVarargs(value: Double*): Self = StObject.set(x, "colourClusteringModes", js.Array(value*))
      
      inline def setColourConversionModes(value: js.Array[Double]): Self = StObject.set(x, "colourConversionModes", value.asInstanceOf[js.Any])
      
      inline def setColourConversionModesVarargs(value: Double*): Self = StObject.set(x, "colourConversionModes", js.Array(value*))
      
      inline def setDeformationResistingModes(value: js.Array[Double]): Self = StObject.set(x, "deformationResistingModes", value.asInstanceOf[js.Any])
      
      inline def setDeformationResistingModesVarargs(value: Double*): Self = StObject.set(x, "deformationResistingModes", js.Array(value*))
      
      inline def setDpmCodeReadingModes(value: js.Array[Double]): Self = StObject.set(x, "dpmCodeReadingModes", value.asInstanceOf[js.Any])
      
      inline def setDpmCodeReadingModesVarargs(value: Double*): Self = StObject.set(x, "dpmCodeReadingModes", js.Array(value*))
      
      inline def setGrayscaleTransformationModes(value: js.Array[Double]): Self = StObject.set(x, "grayscaleTransformationModes", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleTransformationModesVarargs(value: Double*): Self = StObject.set(x, "grayscaleTransformationModes", js.Array(value*))
      
      inline def setImagePreprocessingModes(value: js.Array[Double]): Self = StObject.set(x, "imagePreprocessingModes", value.asInstanceOf[js.Any])
      
      inline def setImagePreprocessingModesVarargs(value: Double*): Self = StObject.set(x, "imagePreprocessingModes", js.Array(value*))
      
      inline def setRegionPredetectionModes(value: js.Array[Double]): Self = StObject.set(x, "regionPredetectionModes", value.asInstanceOf[js.Any])
      
      inline def setRegionPredetectionModesVarargs(value: Double*): Self = StObject.set(x, "regionPredetectionModes", js.Array(value*))
      
      inline def setTextAssistedCorrectionMode(value: Double): Self = StObject.set(x, "textAssistedCorrectionMode", value.asInstanceOf[js.Any])
      
      inline def setTextFilterModes(value: js.Array[Double]): Self = StObject.set(x, "textFilterModes", value.asInstanceOf[js.Any])
      
      inline def setTextFilterModesVarargs(value: Double*): Self = StObject.set(x, "textFilterModes", js.Array(value*))
      
      inline def setTextureDetectionModes(value: js.Array[Double]): Self = StObject.set(x, "textureDetectionModes", value.asInstanceOf[js.Any])
      
      inline def setTextureDetectionModesVarargs(value: Double*): Self = StObject.set(x, "textureDetectionModes", js.Array(value*))
    }
  }
  
  trait LocalizationResult extends StObject {
    
    /**
      * The angle of a barcode. Values range from 0 to 360.
      */
    var angle: Double
    
    var moduleSize: Double
    
    var pageNumber: Double
    
    var regionName: Double
    
    var resultCoordinateType: Double
    
    var terminatePhase: Double
    
    /**
      * The X coordinate of the left-most point.
      */
    var x1: Double
    
    /**
      * The X coordinate of the second point in a clockwise direction.
      */
    var x2: Double
    
    /**
      * The X coordinate of the third point in a clockwise direction.
      */
    var x3: Double
    
    /**
      * The X coordinate of the fourth point in a clockwise direction.
      */
    var x4: Double
    
    /**
      * The Y coordinate of the left-most point.
      */
    var y1: Double
    
    /**
      * The Y coordinate of the second point in a clockwise direction.
      */
    var y2: Double
    
    /**
      * The Y coordinate of the third point in a clockwise direction.
      */
    var y3: Double
    
    /**
      * The Y coordinate of the fourth point in a clockwise direction.
      */
    var y4: Double
  }
  object LocalizationResult {
    
    inline def apply(
      angle: Double,
      moduleSize: Double,
      pageNumber: Double,
      regionName: Double,
      resultCoordinateType: Double,
      terminatePhase: Double,
      x1: Double,
      x2: Double,
      x3: Double,
      x4: Double,
      y1: Double,
      y2: Double,
      y3: Double,
      y4: Double
    ): LocalizationResult = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], regionName = regionName.asInstanceOf[js.Any], resultCoordinateType = resultCoordinateType.asInstanceOf[js.Any], terminatePhase = terminatePhase.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], x4 = x4.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], y3 = y3.asInstanceOf[js.Any], y4 = y4.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationResult]
    }
    
    extension [Self <: LocalizationResult](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setModuleSize(value: Double): Self = StObject.set(x, "moduleSize", value.asInstanceOf[js.Any])
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setRegionName(value: Double): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
      
      inline def setResultCoordinateType(value: Double): Self = StObject.set(x, "resultCoordinateType", value.asInstanceOf[js.Any])
      
      inline def setTerminatePhase(value: Double): Self = StObject.set(x, "terminatePhase", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX3(value: Double): Self = StObject.set(x, "x3", value.asInstanceOf[js.Any])
      
      inline def setX4(value: Double): Self = StObject.set(x, "x4", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY3(value: Double): Self = StObject.set(x, "y3", value.asInstanceOf[js.Any])
      
      inline def setY4(value: Double): Self = StObject.set(x, "y4", value.asInstanceOf[js.Any])
    }
  }
  
  trait Region extends StObject {
    
    var regionBottom: Double
    
    var regionLeft: Double
    
    var regionMeasuredByPercentage: Double
    
    var regionRight: Double
    
    var regionTop: Double
  }
  object Region {
    
    inline def apply(
      regionBottom: Double,
      regionLeft: Double,
      regionMeasuredByPercentage: Double,
      regionRight: Double,
      regionTop: Double
    ): Region = {
      val __obj = js.Dynamic.literal(regionBottom = regionBottom.asInstanceOf[js.Any], regionLeft = regionLeft.asInstanceOf[js.Any], regionMeasuredByPercentage = regionMeasuredByPercentage.asInstanceOf[js.Any], regionRight = regionRight.asInstanceOf[js.Any], regionTop = regionTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    extension [Self <: Region](x: Self) {
      
      inline def setRegionBottom(value: Double): Self = StObject.set(x, "regionBottom", value.asInstanceOf[js.Any])
      
      inline def setRegionLeft(value: Double): Self = StObject.set(x, "regionLeft", value.asInstanceOf[js.Any])
      
      inline def setRegionMeasuredByPercentage(value: Double): Self = StObject.set(x, "regionMeasuredByPercentage", value.asInstanceOf[js.Any])
      
      inline def setRegionRight(value: Double): Self = StObject.set(x, "regionRight", value.asInstanceOf[js.Any])
      
      inline def setRegionTop(value: Double): Self = StObject.set(x, "regionTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var accompanyingTextBytes: js.Array[Double]
    
    var clarity: Double
    
    var confidence: Double
    
    var deformation: Double
    
    var resultType: Double
  }
  object Result {
    
    inline def apply(
      accompanyingTextBytes: js.Array[Double],
      clarity: Double,
      confidence: Double,
      deformation: Double,
      resultType: Double
    ): Result = {
      val __obj = js.Dynamic.literal(accompanyingTextBytes = accompanyingTextBytes.asInstanceOf[js.Any], clarity = clarity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], deformation = deformation.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setAccompanyingTextBytes(value: js.Array[Double]): Self = StObject.set(x, "accompanyingTextBytes", value.asInstanceOf[js.Any])
      
      inline def setAccompanyingTextBytesVarargs(value: Double*): Self = StObject.set(x, "accompanyingTextBytes", js.Array(value*))
      
      inline def setClarity(value: Double): Self = StObject.set(x, "clarity", value.asInstanceOf[js.Any])
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setDeformation(value: Double): Self = StObject.set(x, "deformation", value.asInstanceOf[js.Any])
      
      inline def setResultType(value: Double): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeSettings extends StObject {
    
    var barcodeFormatIds: Double
    
    var barcodeFormatIds_2: Double
    
    var binarizationModes: js.Array[Double]
    
    var deblurLevel: Double
    
    var expectedBarcodesCount: Double
    
    var furtherModes: FurtherModes
    
    var intermediateResultSavingMode: Double
    
    var intermediateResultTypes: Double
    
    var localizationModes: js.Array[Double]
    
    var maxAlgorithmThreadCount: Double
    
    var minBarcodeTextLength: Double
    
    var minResultConfidence: Double
    
    var pdfRasterDPI: Double
    
    var pdfReadingMode: Double
    
    var region: Region
    
    var resultCoordinateType: Double
    
    var returnBarcodeZoneClarity: Double
    
    var scaleDownThreshold: Double
    
    var scaleUpModes: js.Array[Double]
    
    var terminatePhase: Double
    
    var textResultOrderModes: js.Array[Double]
    
    var timeout: Double
  }
  object RuntimeSettings {
    
    inline def apply(
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
    
    extension [Self <: RuntimeSettings](x: Self) {
      
      inline def setBarcodeFormatIds(value: Double): Self = StObject.set(x, "barcodeFormatIds", value.asInstanceOf[js.Any])
      
      inline def setBarcodeFormatIds_2(value: Double): Self = StObject.set(x, "barcodeFormatIds_2", value.asInstanceOf[js.Any])
      
      inline def setBinarizationModes(value: js.Array[Double]): Self = StObject.set(x, "binarizationModes", value.asInstanceOf[js.Any])
      
      inline def setBinarizationModesVarargs(value: Double*): Self = StObject.set(x, "binarizationModes", js.Array(value*))
      
      inline def setDeblurLevel(value: Double): Self = StObject.set(x, "deblurLevel", value.asInstanceOf[js.Any])
      
      inline def setExpectedBarcodesCount(value: Double): Self = StObject.set(x, "expectedBarcodesCount", value.asInstanceOf[js.Any])
      
      inline def setFurtherModes(value: FurtherModes): Self = StObject.set(x, "furtherModes", value.asInstanceOf[js.Any])
      
      inline def setIntermediateResultSavingMode(value: Double): Self = StObject.set(x, "intermediateResultSavingMode", value.asInstanceOf[js.Any])
      
      inline def setIntermediateResultTypes(value: Double): Self = StObject.set(x, "intermediateResultTypes", value.asInstanceOf[js.Any])
      
      inline def setLocalizationModes(value: js.Array[Double]): Self = StObject.set(x, "localizationModes", value.asInstanceOf[js.Any])
      
      inline def setLocalizationModesVarargs(value: Double*): Self = StObject.set(x, "localizationModes", js.Array(value*))
      
      inline def setMaxAlgorithmThreadCount(value: Double): Self = StObject.set(x, "maxAlgorithmThreadCount", value.asInstanceOf[js.Any])
      
      inline def setMinBarcodeTextLength(value: Double): Self = StObject.set(x, "minBarcodeTextLength", value.asInstanceOf[js.Any])
      
      inline def setMinResultConfidence(value: Double): Self = StObject.set(x, "minResultConfidence", value.asInstanceOf[js.Any])
      
      inline def setPdfRasterDPI(value: Double): Self = StObject.set(x, "pdfRasterDPI", value.asInstanceOf[js.Any])
      
      inline def setPdfReadingMode(value: Double): Self = StObject.set(x, "pdfReadingMode", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResultCoordinateType(value: Double): Self = StObject.set(x, "resultCoordinateType", value.asInstanceOf[js.Any])
      
      inline def setReturnBarcodeZoneClarity(value: Double): Self = StObject.set(x, "returnBarcodeZoneClarity", value.asInstanceOf[js.Any])
      
      inline def setScaleDownThreshold(value: Double): Self = StObject.set(x, "scaleDownThreshold", value.asInstanceOf[js.Any])
      
      inline def setScaleUpModes(value: js.Array[Double]): Self = StObject.set(x, "scaleUpModes", value.asInstanceOf[js.Any])
      
      inline def setScaleUpModesVarargs(value: Double*): Self = StObject.set(x, "scaleUpModes", js.Array(value*))
      
      inline def setTerminatePhase(value: Double): Self = StObject.set(x, "terminatePhase", value.asInstanceOf[js.Any])
      
      inline def setTextResultOrderModes(value: js.Array[Double]): Self = StObject.set(x, "textResultOrderModes", value.asInstanceOf[js.Any])
      
      inline def setTextResultOrderModesVarargs(value: Double*): Self = StObject.set(x, "textResultOrderModes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextResult extends StObject {
    
    /**
      * Barcode result content in a byte array.
      */
    var barcodeBytes: js.Array[Double]
    
    /**
      * The barcode format.
      */
    var barcodeFormat: EnumBarcodeFormat | Double
    
    /**
      * Barcode formats as a string.
      */
    var barcodeFormatString: String
    
    /**
      * Extra barcode formats as a string.
      */
    var barcodeFormatString_2: String
    
    /**
      * Extra barcde formats.
      */
    var barcodeFormat_2: EnumBarcodeFormat2 | Double
    
    /**
      * The barcode result text.
      */
    var barcodeText: String
    
    /**
      * Detailed result information.
      */
    var detailedResult: Any
    
    /**
      * The corresponding localization result.
      */
    var localizationResult: LocalizationResult
    
    /**
      * Other information
      */
    var results: js.Array[Result]
  }
  object TextResult {
    
    inline def apply(
      barcodeBytes: js.Array[Double],
      barcodeFormat: EnumBarcodeFormat | Double,
      barcodeFormatString: String,
      barcodeFormatString_2: String,
      barcodeFormat_2: EnumBarcodeFormat2 | Double,
      barcodeText: String,
      detailedResult: Any,
      localizationResult: LocalizationResult,
      results: js.Array[Result]
    ): TextResult = {
      val __obj = js.Dynamic.literal(barcodeBytes = barcodeBytes.asInstanceOf[js.Any], barcodeFormat = barcodeFormat.asInstanceOf[js.Any], barcodeFormatString = barcodeFormatString.asInstanceOf[js.Any], barcodeFormatString_2 = barcodeFormatString_2.asInstanceOf[js.Any], barcodeFormat_2 = barcodeFormat_2.asInstanceOf[js.Any], barcodeText = barcodeText.asInstanceOf[js.Any], detailedResult = detailedResult.asInstanceOf[js.Any], localizationResult = localizationResult.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextResult]
    }
    
    extension [Self <: TextResult](x: Self) {
      
      inline def setBarcodeBytes(value: js.Array[Double]): Self = StObject.set(x, "barcodeBytes", value.asInstanceOf[js.Any])
      
      inline def setBarcodeBytesVarargs(value: Double*): Self = StObject.set(x, "barcodeBytes", js.Array(value*))
      
      inline def setBarcodeFormat(value: EnumBarcodeFormat | Double): Self = StObject.set(x, "barcodeFormat", value.asInstanceOf[js.Any])
      
      inline def setBarcodeFormatString(value: String): Self = StObject.set(x, "barcodeFormatString", value.asInstanceOf[js.Any])
      
      inline def setBarcodeFormatString_2(value: String): Self = StObject.set(x, "barcodeFormatString_2", value.asInstanceOf[js.Any])
      
      inline def setBarcodeFormat_2(value: EnumBarcodeFormat2 | Double): Self = StObject.set(x, "barcodeFormat_2", value.asInstanceOf[js.Any])
      
      inline def setBarcodeText(value: String): Self = StObject.set(x, "barcodeText", value.asInstanceOf[js.Any])
      
      inline def setDetailedResult(value: Any): Self = StObject.set(x, "detailedResult", value.asInstanceOf[js.Any])
      
      inline def setLocalizationResult(value: LocalizationResult): Self = StObject.set(x, "localizationResult", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  @js.native
  trait TextResults
    extends StObject
       with Array[Any] {
    
    var description: js.UndefOr[String] = js.native
    
    var exception: js.UndefOr[Double] = js.native
    
    var imageid: js.UndefOr[Double] = js.native
  }
}
