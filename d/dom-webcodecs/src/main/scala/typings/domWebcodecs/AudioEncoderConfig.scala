package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderConfig extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var codec: String
  
  var numberOfChannels: Double
  
  var sampleRate: Double
}
object AudioEncoderConfig {
  
  inline def apply(codec: String, numberOfChannels: Double, sampleRate: Double): AudioEncoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
