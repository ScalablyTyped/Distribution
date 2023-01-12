package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAuditEvent extends StObject {
  
  var eventFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
}
object EnvelopeAuditEvent {
  
  inline def apply(): EnvelopeAuditEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAuditEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeAuditEvent] (val x: Self) extends AnyVal {
    
    inline def setEventFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "eventFields", value.asInstanceOf[js.Any])
    
    inline def setEventFieldsUndefined: Self = StObject.set(x, "eventFields", js.undefined)
    
    inline def setEventFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "eventFields", js.Array(value*))
  }
}
