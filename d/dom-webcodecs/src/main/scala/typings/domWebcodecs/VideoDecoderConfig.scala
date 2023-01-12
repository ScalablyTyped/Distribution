package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderConfig extends StObject {
  
  var codec: String
  
  var codedHeight: js.UndefOr[Double] = js.undefined
  
  var codedWidth: js.UndefOr[Double] = js.undefined
  
  var colorSpace: js.UndefOr[VideoColorSpaceInit] = js.undefined
  
  var description: js.UndefOr[AllowSharedBufferSource] = js.undefined
  
  var displayAspectHeight: js.UndefOr[Double] = js.undefined
  
  var displayAspectWidth: js.UndefOr[Double] = js.undefined
  
  var hardwareAcceleration: js.UndefOr[HardwarePreference] = js.undefined
  
  var optimizeForLatency: js.UndefOr[Boolean] = js.undefined
}
object VideoDecoderConfig {
  
  inline def apply(codec: String): VideoDecoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDecoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoDecoderConfig] (val x: Self) extends AnyVal {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodedHeight(value: Double): Self = StObject.set(x, "codedHeight", value.asInstanceOf[js.Any])
    
    inline def setCodedHeightUndefined: Self = StObject.set(x, "codedHeight", js.undefined)
    
    inline def setCodedWidth(value: Double): Self = StObject.set(x, "codedWidth", value.asInstanceOf[js.Any])
    
    inline def setCodedWidthUndefined: Self = StObject.set(x, "codedWidth", js.undefined)
    
    inline def setColorSpace(value: VideoColorSpaceInit): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDescription(value: AllowSharedBufferSource): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayAspectHeight(value: Double): Self = StObject.set(x, "displayAspectHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayAspectHeightUndefined: Self = StObject.set(x, "displayAspectHeight", js.undefined)
    
    inline def setDisplayAspectWidth(value: Double): Self = StObject.set(x, "displayAspectWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayAspectWidthUndefined: Self = StObject.set(x, "displayAspectWidth", js.undefined)
    
    inline def setHardwareAcceleration(value: HardwarePreference): Self = StObject.set(x, "hardwareAcceleration", value.asInstanceOf[js.Any])
    
    inline def setHardwareAccelerationUndefined: Self = StObject.set(x, "hardwareAcceleration", js.undefined)
    
    inline def setOptimizeForLatency(value: Boolean): Self = StObject.set(x, "optimizeForLatency", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForLatencyUndefined: Self = StObject.set(x, "optimizeForLatency", js.undefined)
  }
}
