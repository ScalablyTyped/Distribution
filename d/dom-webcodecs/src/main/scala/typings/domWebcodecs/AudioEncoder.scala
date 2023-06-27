package typings.domWebcodecs

import typings.std.CodecState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AudioEncoder extends StObject {
  
  def close(): Unit
  
  def configure(config: AudioEncoderConfig): Unit
  
  def encode(data: AudioData): Unit
  
  val encodeQueueSize: Double
  
  def flush(): js.Promise[Unit]
  
  def reset(): Unit
  
  val state: CodecState
}
object AudioEncoder {
  
  inline def apply(
    close: () => Unit,
    configure: AudioEncoderConfig => Unit,
    encode: AudioData => Unit,
    encodeQueueSize: Double,
    flush: () => js.Promise[Unit],
    reset: () => Unit,
    state: CodecState
  ): AudioEncoder = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), configure = js.Any.fromFunction1(configure), encode = js.Any.fromFunction1(encode), encodeQueueSize = encodeQueueSize.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncoder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioEncoder] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConfigure(value: AudioEncoderConfig => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setEncode(value: AudioData => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setEncodeQueueSize(value: Double): Self = StObject.set(x, "encodeQueueSize", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: () => js.Promise[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setState(value: CodecState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
