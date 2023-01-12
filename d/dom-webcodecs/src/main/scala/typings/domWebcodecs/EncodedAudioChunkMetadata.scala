package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedAudioChunkMetadata extends StObject {
  
  var decoderConfig: js.UndefOr[AudioDecoderConfig] = js.undefined
}
object EncodedAudioChunkMetadata {
  
  inline def apply(): EncodedAudioChunkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodedAudioChunkMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedAudioChunkMetadata] (val x: Self) extends AnyVal {
    
    inline def setDecoderConfig(value: AudioDecoderConfig): Self = StObject.set(x, "decoderConfig", value.asInstanceOf[js.Any])
    
    inline def setDecoderConfigUndefined: Self = StObject.set(x, "decoderConfig", js.undefined)
  }
}
