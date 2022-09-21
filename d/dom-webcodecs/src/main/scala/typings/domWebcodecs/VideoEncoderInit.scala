package typings.domWebcodecs

import typings.std.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(chunk: EncodedVideoChunk, metadata: EncodedVideoChunkMetadata): Unit
  @JSName("output")
  var output_Original: EncodedVideoChunkOutputCallback
}
object VideoEncoderInit {
  
  inline def apply(
    error: /* error */ DOMException => Unit,
    output: (/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata) => Unit
  ): VideoEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction2(output))
    __obj.asInstanceOf[VideoEncoderInit]
  }
  
  extension [Self <: VideoEncoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(value: (/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata) => Unit): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
  }
}
