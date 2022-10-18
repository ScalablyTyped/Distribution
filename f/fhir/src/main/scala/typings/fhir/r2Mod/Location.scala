package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.kind
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If locations can be visited, we need to keep track of their address.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * Humans need additional information to verify a correct location has been identified.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Organization label locations in registries, need to keep track of those.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Need to know who manages the location.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * When using a Location resource for scheduling or orders, we need to be able to refer to a class of Locations instead of a specific Location.
    */
  var mode: js.UndefOr[instance | kind] = js.undefined
  
  /**
    * Name of the location as used by humans. Does not need to be unique.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * For purposes of location, display and identification, knowing which locations are located within other locations is important.
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * For purposes of showing relevant locations in queries, we need to categorize locations.
    */
  var physicalType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For mobile applications and automated route-finding knowing the exact location of the Location is required.
    */
  var position: js.UndefOr[LocationPosition] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Location: typings.fhir.fhirStrings.Location
  
  /**
    * active | suspended | inactive.
    */
  var status: js.UndefOr[active | suspended | inactive] = js.undefined
  
  /**
    * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Indicates the type of function performed at the location.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal(resourceType = "Location")
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setMode(value: instance | kind): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPhysicalType(value: CodeableConcept): Self = StObject.set(x, "physicalType", value.asInstanceOf[js.Any])
    
    inline def setPhysicalTypeUndefined: Self = StObject.set(x, "physicalType", js.undefined)
    
    inline def setPosition(value: LocationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Location): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | suspended | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
