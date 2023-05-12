package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionContact
  extends StObject
     with BackboneElement {
  
  /**
    * A product specific contact, person (in a role), or an organization.
    */
  var contact: Reference
  
  /**
    * Allows the contact to be classified, for example QPPV, Pharmacovigilance Enquiry Information.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductDefinitionContact {
  
  inline def apply(contact: Reference): MedicinalProductDefinitionContact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionContact] (val x: Self) extends AnyVal {
    
    inline def setContact(value: Reference): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
