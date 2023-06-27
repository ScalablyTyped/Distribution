package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDecoderConfig extends StObject {
  
  var codec: String
  
  var description: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
  ] = js.undefined
  
  var numberOfChannels: Double
  
  var sampleRate: Double
}
object AudioDecoderConfig {
  
  inline def apply(codec: String, numberOfChannels: Double, sampleRate: Double): AudioDecoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDecoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDecoderConfig] (val x: Self) extends AnyVal {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDescription(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
