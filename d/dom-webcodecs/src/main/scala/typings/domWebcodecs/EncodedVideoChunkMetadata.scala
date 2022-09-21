package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedVideoChunkMetadata extends StObject {
  
  var decoderConfig: js.UndefOr[VideoDecoderConfig] = js.undefined
  
  var temporalLayerId: js.UndefOr[Double] = js.undefined
}
object EncodedVideoChunkMetadata {
  
  inline def apply(): EncodedVideoChunkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodedVideoChunkMetadata]
  }
  
  extension [Self <: EncodedVideoChunkMetadata](x: Self) {
    
    inline def setDecoderConfig(value: VideoDecoderConfig): Self = StObject.set(x, "decoderConfig", value.asInstanceOf[js.Any])
    
    inline def setDecoderConfigUndefined: Self = StObject.set(x, "decoderConfig", js.undefined)
    
    inline def setTemporalLayerId(value: Double): Self = StObject.set(x, "temporalLayerId", value.asInstanceOf[js.Any])
    
    inline def setTemporalLayerIdUndefined: Self = StObject.set(x, "temporalLayerId", js.undefined)
  }
}
