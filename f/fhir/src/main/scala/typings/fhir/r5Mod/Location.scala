package typings.fhir.r5Mod

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
    * Additional addresses should be recorded using another instance of the Location resource, or via the Organization.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * There are no dates associated with the alias/historic names, as this is not intended to track when names were used, but to assist in searching so that older names can still result in identifying the location.
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * These could be such things as is wheelchair accessible.
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The address/telecom use code 'home' are not to be used. Note that these contacts are not the contact details of people who provide the service (that would be through PractitionerRole), these are official contacts for the Healthcare itself for specific purposes. E.g. Mailing Addresses, Billing Addresses, Contact numbers for Booking or Billing Enquiries, general web address, web address for online bookings etc.
    * If this is empty (or the type of interest is empty), refer to the organization's contacts.
    */
  var contact: js.UndefOr[js.Array[ExtendedContactDetail]] = js.undefined
  
  /**
    * Description of the Location, which helps in finding or referencing the place.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the location.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Physical form of the location, e.g. building, room, vehicle, road, virtual.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This type of information is commonly found published in directories and on websites informing customers when the facility is available.
    * Specific services within the location may have their own hours which could be shorter (or longer) than the locations hours.
    * Systems may choose to render availability differently than it is exchanged on the interface. For example, rather than "Mon, Tue, Wed, Thur, Fri from 9am-12am; Mon, Tue, Wed, Thur, Fri from 1pm-5pm" as would be implied by two availableTime repetitions, an application could render this information as "Mon-Fri 9-12am and 1-5pm".
    * The availableStartTime is the opening time, and the availableEndTime is the closing time.
    */
  var hoursOfOperation: js.UndefOr[js.Array[Availability]] = js.undefined
  
  /**
    * Unique code or number identifying the location to its users.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This can also be used as the part of the organization hierarchy where this location provides services. These services can be defined through the HealthcareService resource.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is labeled as a modifier because whether or not the location is a class of locations changes how it can be used and understood.
    */
  var mode: js.UndefOr[instance | kind] = js.undefined
  
  /**
    * If the name of a location changes, consider putting the old name in the alias column so that it can still be located through searches.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The operational status covers operation values most relevant to beds (but can also apply to rooms/units/chairs/etc. such as an isolation unit/dialysis chair). This typically covers concepts such as contamination, housekeeping, and other activities like maintenance.
    */
  var operationalStatus: js.UndefOr[Coding] = js.undefined
  
  /**
    * Another Location of which this Location is physically a part of.
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * To define a boundary shape for this location use the standard extension `[http://hl7.org/fhir/StructureDefinition/location-boundary-geojson](http://hl7.org/fhir/extensions/StructureDefinition-location-boundary-geojson.html)`, and search using the `contains` special search parameter.
    */
  var position: js.UndefOr[LocationPosition] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Location: typings.fhir.fhirStrings.Location
  
  /**
    * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
    */
  var status: js.UndefOr[active | suspended | inactive] = js.undefined
  
  /**
    * Indicates the type of function performed at the location.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There are two types of virtual meetings that often exist:
    * * a persistent, virtual meeting room that can only be used for a single purpose at a time,
    *  * and a dynamic virtual meeting room that is generated on demand for a specific purpose.
    *  Implementers may consider using Appointment.virtualService for virtual meeting rooms that are generated on-demand.
    */
  var virtualService: js.UndefOr[js.Array[VirtualServiceDetail]] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal(resourceType = "Location")
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setContact(value: js.Array[ExtendedContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ExtendedContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHoursOfOperation(value: js.Array[Availability]): Self = StObject.set(x, "hoursOfOperation", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationUndefined: Self = StObject.set(x, "hoursOfOperation", js.undefined)
    
    inline def setHoursOfOperationVarargs(value: Availability*): Self = StObject.set(x, "hoursOfOperation", js.Array(value*))
    
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
    
    inline def setPosition(value: LocationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Location): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | suspended | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVirtualService(value: js.Array[VirtualServiceDetail]): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
    
    inline def setVirtualServiceUndefined: Self = StObject.set(x, "virtualService", js.undefined)
    
    inline def setVirtualServiceVarargs(value: VirtualServiceDetail*): Self = StObject.set(x, "virtualService", js.Array(value*))
    
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
