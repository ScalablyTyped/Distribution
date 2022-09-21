package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait VideoDecoder extends StObject {
  
  def close(): Unit
  
  def configure(config: VideoDecoderConfig): Unit
  
  def decode(chunk: EncodedVideoChunk): Unit
  
  val decodeQueueSize: Double
  
  def flush(): js.Promise[Unit]
  
  def reset(): Unit
  
  val state: CodecState
}
object VideoDecoder {
  
  inline def apply(
    close: () => Unit,
    configure: VideoDecoderConfig => Unit,
    decode: EncodedVideoChunk => Unit,
    decodeQueueSize: Double,
    flush: () => js.Promise[Unit],
    reset: () => Unit,
    state: CodecState
  ): VideoDecoder = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), configure = js.Any.fromFunction1(configure), decode = js.Any.fromFunction1(decode), decodeQueueSize = decodeQueueSize.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDecoder]
  }
  
  extension [Self <: VideoDecoder](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConfigure(value: VideoDecoderConfig => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setDecode(value: EncodedVideoChunk => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setDecodeQueueSize(value: Double): Self = StObject.set(x, "decodeQueueSize", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: () => js.Promise[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setState(value: CodecState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
