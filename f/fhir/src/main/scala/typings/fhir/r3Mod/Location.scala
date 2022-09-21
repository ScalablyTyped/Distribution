package typings.fhir.r3Mod

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
  
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * This was kept as 0..1 as there is no use property on the address, so wouldn't be able to identify different address types.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * There are no dates associated with the alias/historic names, as this is not intended to track when names were used, but to assist in searching so that older names can still result in identifying the location.
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Description of the Location, which helps in finding or referencing the place.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the location.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Unique code or number identifying the location to its users.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This can also be used as the part of the organization hierarchy where this location provides services. These services can be defined through the HealthcareService resource.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is labeled as a modifer because whether or not the location is a class of locations changes how it can be used and understood.
    */
  var mode: js.UndefOr[instance | kind] = js.undefined
  
  /**
    * If the name of an location changes, consider putting the old name in the alias column so that it can still be located through searches.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Operational status covers operation values most relevant to beds (but can also apply to rooms/units/chair/etc such as an isolation unit/dialisys chair). This typically covers concepts such as contamination, housekeeping and other activities like maintenance.
    */
  var operationalStatus: js.UndefOr[Coding] = js.undefined
  
  /**
    * Another Location which this Location is physically part of.
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Physical form of the location, e.g. building, room, vehicle, road.
    */
  var physicalType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
    */
  var position: js.UndefOr[LocationPosition] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Location: typings.fhir.fhirStrings.Location
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
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
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setMode(value: instance | kind): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationalStatus(value: Coding): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
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
    
    inline def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    inline def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    inline def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value*))
    
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
