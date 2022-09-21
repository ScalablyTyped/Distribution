package typings.domWebcodecs

import typings.std.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(output: EncodedAudioChunk, metadata: EncodedAudioChunkMetadata): Unit
  @JSName("output")
  var output_Original: EncodedAudioChunkOutputCallback
}
object AudioEncoderInit {
  
  inline def apply(
    error: /* error */ DOMException => Unit,
    output: (/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata) => Unit
  ): AudioEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction2(output))
    __obj.asInstanceOf[AudioEncoderInit]
  }
  
  extension [Self <: AudioEncoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(value: (/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata) => Unit): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
  }
}
