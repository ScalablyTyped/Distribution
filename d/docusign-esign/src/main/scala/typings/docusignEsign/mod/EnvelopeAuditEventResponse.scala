package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAuditEventResponse extends StObject {
  
  /**
    * Reserved: TBD
    */
  var auditEvents: js.UndefOr[js.Array[EnvelopeAuditEvent]] = js.undefined
}
object EnvelopeAuditEventResponse {
  
  inline def apply(): EnvelopeAuditEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAuditEventResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeAuditEventResponse] (val x: Self) extends AnyVal {
    
    inline def setAuditEvents(value: js.Array[EnvelopeAuditEvent]): Self = StObject.set(x, "auditEvents", value.asInstanceOf[js.Any])
    
    inline def setAuditEventsUndefined: Self = StObject.set(x, "auditEvents", js.undefined)
    
    inline def setAuditEventsVarargs(value: EnvelopeAuditEvent*): Self = StObject.set(x, "auditEvents", js.Array(value*))
  }
}
