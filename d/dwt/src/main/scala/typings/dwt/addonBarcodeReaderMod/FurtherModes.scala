package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FurtherModes extends js.Object {
  
  var accompanyingTextRecognitionModes: js.Array[Double] = js.native
  
  var barcodeColourModes: js.Array[Double] = js.native
  
  var barcodeComplementModes: js.Array[Double] = js.native
  
  var colourClusteringModes: js.Array[Double] = js.native
  
  var colourConversionModes: js.Array[Double] = js.native
  
  var deformationResistingModes: js.Array[Double] = js.native
  
  var dpmCodeReadingModes: js.Array[Double] = js.native
  
  var grayscaleTransformationModes: js.Array[Double] = js.native
  
  var imagePreprocessingModes: js.Array[Double] = js.native
  
  var regionPredetectionModes: js.Array[Double] = js.native
  
  var textAssistedCorrectionMode: Double = js.native
  
  var textFilterModes: js.Array[Double] = js.native
  
  var textureDetectionModes: js.Array[Double] = js.native
}
object FurtherModes {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FurtherModesOps[Self <: FurtherModes] (val x: Self) extends AnyVal {
    
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
    def setAccompanyingTextRecognitionModesVarargs(value: Double*): Self = this.set("accompanyingTextRecognitionModes", js.Array(value :_*))
    
    @scala.inline
    def setAccompanyingTextRecognitionModes(value: js.Array[Double]): Self = this.set("accompanyingTextRecognitionModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarcodeColourModesVarargs(value: Double*): Self = this.set("barcodeColourModes", js.Array(value :_*))
    
    @scala.inline
    def setBarcodeColourModes(value: js.Array[Double]): Self = this.set("barcodeColourModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarcodeComplementModesVarargs(value: Double*): Self = this.set("barcodeComplementModes", js.Array(value :_*))
    
    @scala.inline
    def setBarcodeComplementModes(value: js.Array[Double]): Self = this.set("barcodeComplementModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColourClusteringModesVarargs(value: Double*): Self = this.set("colourClusteringModes", js.Array(value :_*))
    
    @scala.inline
    def setColourClusteringModes(value: js.Array[Double]): Self = this.set("colourClusteringModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColourConversionModesVarargs(value: Double*): Self = this.set("colourConversionModes", js.Array(value :_*))
    
    @scala.inline
    def setColourConversionModes(value: js.Array[Double]): Self = this.set("colourConversionModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeformationResistingModesVarargs(value: Double*): Self = this.set("deformationResistingModes", js.Array(value :_*))
    
    @scala.inline
    def setDeformationResistingModes(value: js.Array[Double]): Self = this.set("deformationResistingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpmCodeReadingModesVarargs(value: Double*): Self = this.set("dpmCodeReadingModes", js.Array(value :_*))
    
    @scala.inline
    def setDpmCodeReadingModes(value: js.Array[Double]): Self = this.set("dpmCodeReadingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayscaleTransformationModesVarargs(value: Double*): Self = this.set("grayscaleTransformationModes", js.Array(value :_*))
    
    @scala.inline
    def setGrayscaleTransformationModes(value: js.Array[Double]): Self = this.set("grayscaleTransformationModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePreprocessingModesVarargs(value: Double*): Self = this.set("imagePreprocessingModes", js.Array(value :_*))
    
    @scala.inline
    def setImagePreprocessingModes(value: js.Array[Double]): Self = this.set("imagePreprocessingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionPredetectionModesVarargs(value: Double*): Self = this.set("regionPredetectionModes", js.Array(value :_*))
    
    @scala.inline
    def setRegionPredetectionModes(value: js.Array[Double]): Self = this.set("regionPredetectionModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAssistedCorrectionMode(value: Double): Self = this.set("textAssistedCorrectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFilterModesVarargs(value: Double*): Self = this.set("textFilterModes", js.Array(value :_*))
    
    @scala.inline
    def setTextFilterModes(value: js.Array[Double]): Self = this.set("textFilterModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureDetectionModesVarargs(value: Double*): Self = this.set("textureDetectionModes", js.Array(value :_*))
    
    @scala.inline
    def setTextureDetectionModes(value: js.Array[Double]): Self = this.set("textureDetectionModes", value.asInstanceOf[js.Any])
  }
}
