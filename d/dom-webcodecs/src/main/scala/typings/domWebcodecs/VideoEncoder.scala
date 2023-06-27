package typings.domWebcodecs

import typings.std.CodecState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait VideoEncoder extends StObject {
  
  def close(): Unit = js.native
  
  def configure(config: VideoEncoderConfig): Unit = js.native
  
  def encode(frame: VideoFrame): Unit = js.native
  def encode(frame: VideoFrame, options: VideoEncoderEncodeOptions): Unit = js.native
  
  val encodeQueueSize: Double = js.native
  
  def flush(): js.Promise[Unit] = js.native
  
  def reset(): Unit = js.native
  
  val state: CodecState = js.native
}
