package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAuditEvent extends StObject {
  
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
  implicit class EnvelopeAuditEventMutableBuilder[Self <: EnvelopeAuditEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "eventFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFieldsUndefined: Self = StObject.set(x, "eventFields", js.undefined)
    
    @scala.inline
    def setEventFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "eventFields", js.Array(value :_*))
  }
}
