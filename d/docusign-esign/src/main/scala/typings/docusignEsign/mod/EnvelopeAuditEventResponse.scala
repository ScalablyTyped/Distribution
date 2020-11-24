package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAuditEventResponse extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var auditEvents: js.UndefOr[js.Array[EnvelopeAuditEvent]] = js.native
}
object EnvelopeAuditEventResponse {
  
  @scala.inline
  def apply(): EnvelopeAuditEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAuditEventResponse]
  }
  
  @scala.inline
  implicit class EnvelopeAuditEventResponseOps[Self <: EnvelopeAuditEventResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuditEventsVarargs(value: EnvelopeAuditEvent*): Self = this.set("auditEvents", js.Array(value :_*))
    
    @scala.inline
    def setAuditEvents(value: js.Array[EnvelopeAuditEvent]): Self = this.set("auditEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditEvents: Self = this.set("auditEvents", js.undefined)
  }
}
