package typings.domWebcodecs

import typings.std.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(output: VideoFrame): Unit
  @JSName("output")
  var output_Original: VideoFrameOutputCallback
}
object VideoDecoderInit {
  
  inline def apply(error: /* error */ DOMException => Unit, output: /* output */ VideoFrame => Unit): VideoDecoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction1(output))
    __obj.asInstanceOf[VideoDecoderInit]
  }
  
  extension [Self <: VideoDecoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(value: /* output */ VideoFrame => Unit): Self = StObject.set(x, "output", js.Any.fromFunction1(value))
  }
}
