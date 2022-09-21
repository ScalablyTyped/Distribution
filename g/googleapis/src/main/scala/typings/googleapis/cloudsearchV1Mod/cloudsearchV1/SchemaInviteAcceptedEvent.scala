package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInviteAcceptedEvent extends StObject {
  
  var participantId: js.UndefOr[js.Array[SchemaStoredParticipantId]] = js.undefined
}
object SchemaInviteAcceptedEvent {
  
  inline def apply(): SchemaInviteAcceptedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInviteAcceptedEvent]
  }
  
  extension [Self <: SchemaInviteAcceptedEvent](x: Self) {
    
    inline def setParticipantId(value: js.Array[SchemaStoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: SchemaStoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
  }
}
