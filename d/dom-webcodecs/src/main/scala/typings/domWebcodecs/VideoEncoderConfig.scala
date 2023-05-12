package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderConfig extends StObject {
  
  var alpha: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlphaOption */ Any
  ] = js.undefined
  
  var avc: js.UndefOr[AvcEncoderConfig] = js.undefined
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var bitrateMode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoEncoderBitrateMode */ Any
  ] = js.undefined
  
  var codec: String
  
  var displayHeight: js.UndefOr[Double] = js.undefined
  
  var displayWidth: js.UndefOr[Double] = js.undefined
  
  var framerate: js.UndefOr[Double] = js.undefined
  
  var hardwareAcceleration: js.UndefOr[HardwarePreference] = js.undefined
  
  var height: Double
  
  var latencyMode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LatencyMode */ Any
  ] = js.undefined
  
  var scalabilityMode: js.UndefOr[String] = js.undefined
  
  var width: Double
}
object VideoEncoderConfig {
  
  inline def apply(codec: String, height: Double, width: Double): VideoEncoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setAlpha(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlphaOption */ Any
    ): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAvc(value: AvcEncoderConfig): Self = StObject.set(x, "avc", value.asInstanceOf[js.Any])
    
    inline def setAvcUndefined: Self = StObject.set(x, "avc", js.undefined)
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoEncoderBitrateMode */ Any
    ): Self = StObject.set(x, "bitrateMode", value.asInstanceOf[js.Any])
    
    inline def setBitrateModeUndefined: Self = StObject.set(x, "bitrateMode", js.undefined)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeightUndefined: Self = StObject.set(x, "displayHeight", js.undefined)
    
    inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayWidthUndefined: Self = StObject.set(x, "displayWidth", js.undefined)
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    inline def setHardwareAcceleration(value: HardwarePreference): Self = StObject.set(x, "hardwareAcceleration", value.asInstanceOf[js.Any])
    
    inline def setHardwareAccelerationUndefined: Self = StObject.set(x, "hardwareAcceleration", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLatencyMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LatencyMode */ Any
    ): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    inline def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    inline def setScalabilityMode(value: String): Self = StObject.set(x, "scalabilityMode", value.asInstanceOf[js.Any])
    
    inline def setScalabilityModeUndefined: Self = StObject.set(x, "scalabilityMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
