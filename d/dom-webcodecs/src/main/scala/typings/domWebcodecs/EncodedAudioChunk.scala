package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedAudioChunk extends StObject {
  
  val byteLength: Double
  
  def copyTo(destination: AllowSharedBufferSource): Unit
  
  val duration: Double | Null
  
  val timestamp: Double
  
  val `type`: EncodedAudioChunkType
}
object EncodedAudioChunk {
  
  inline def apply(
    byteLength: Double,
    copyTo: AllowSharedBufferSource => Unit,
    timestamp: Double,
    `type`: EncodedAudioChunkType
  ): EncodedAudioChunk = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), timestamp = timestamp.asInstanceOf[js.Any], duration = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedAudioChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedAudioChunk] (val x: Self) extends AnyVal {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setCopyTo(value: AllowSharedBufferSource => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncodedAudioChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
