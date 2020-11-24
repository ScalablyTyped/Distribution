package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAuditEvent extends js.Object {
  
  var eventFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
}
object EnvelopeAuditEvent {
  
  @scala.inline
  def apply(): EnvelopeAuditEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAuditEvent]
  }
  
  @scala.inline
  implicit class EnvelopeAuditEventOps[Self <: EnvelopeAuditEvent] (val x: Self) extends AnyVal {
    
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
    def setEventFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("eventFields", js.Array(value :_*))
    
    @scala.inline
    def setEventFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("eventFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFields: Self = this.set("eventFields", js.undefined)
  }
}
