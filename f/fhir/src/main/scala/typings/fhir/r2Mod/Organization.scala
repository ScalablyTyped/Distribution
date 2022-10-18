package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Need a flag to indicate a record is no longer to be used and should generally be hidden for the user in the UI.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May need to keep track of the organization's addresses for contacting, billing or reporting requirements.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Need to keep track of assigned contact points within bigger organization.
    */
  var contact: js.UndefOr[js.Array[OrganizationContact]] = js.undefined
  
  /**
    * Organizations are known by a variety of ids. Some institutions maintain several, and most collect identifiers for exchange with other organizations concerning the organization.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Need to use the name as the label of the organization.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Need to be able to track the hierarchy of organizations within an organization.
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Organization: typings.fhir.fhirStrings.Organization
  
  /**
    * Human contact for the organization.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Need to be able to track the kind of organization that this is - different organization types have different uses.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal(resourceType = "Organization")
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setContact(value: js.Array[OrganizationContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: OrganizationContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Organization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
