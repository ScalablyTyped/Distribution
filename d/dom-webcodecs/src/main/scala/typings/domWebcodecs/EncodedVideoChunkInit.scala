package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedVideoChunkInit extends StObject {
  
  var data: AllowSharedBufferSource
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var timestamp: Double
  
  var `type`: EncodedVideoChunkType
}
object EncodedVideoChunkInit {
  
  inline def apply(data: AllowSharedBufferSource, timestamp: Double, `type`: EncodedVideoChunkType): EncodedVideoChunkInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedVideoChunkInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedVideoChunkInit] (val x: Self) extends AnyVal {
    
    inline def setData(value: AllowSharedBufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncodedVideoChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
