package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHangoutEvent extends StObject {
  
  var hangoutDurationSecs: js.UndefOr[String | Null] = js.undefined
  
  var mediaType: js.UndefOr[String | Null] = js.undefined
  
  var participantId: js.UndefOr[js.Array[SchemaStoredParticipantId]] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaHangoutEvent {
  
  inline def apply(): SchemaHangoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutEvent]
  }
  
  extension [Self <: SchemaHangoutEvent](x: Self) {
    
    inline def setHangoutDurationSecs(value: String): Self = StObject.set(x, "hangoutDurationSecs", value.asInstanceOf[js.Any])
    
    inline def setHangoutDurationSecsNull: Self = StObject.set(x, "hangoutDurationSecs", null)
    
    inline def setHangoutDurationSecsUndefined: Self = StObject.set(x, "hangoutDurationSecs", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setParticipantId(value: js.Array[SchemaStoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: SchemaStoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
