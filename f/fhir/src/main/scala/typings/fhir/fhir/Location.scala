package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details and position information for a physical place
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Location
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Physical location
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * A list of alternate names that the location is known as, or was known as in the past
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Additional details about the location that could be displayed as further information to identify the location beyond its name
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Unique code or number identifying the location to its users
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Organization responsible for provisioning and upkeep
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * instance | kind
    */
  var mode: js.UndefOr[code] = js.undefined
  
  /**
    * Name of the location as used by humans
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Operational status of the location (typically only for a bed/room)
    */
  var operationalStatus: js.UndefOr[Coding] = js.undefined
  
  /**
    * Another Location this one is physically part of
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Physical form of the location
    */
  var physicalType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The absolute geographic location
    */
  var position: js.UndefOr[LocationPosition] = js.undefined
  
  /**
    * active | suspended | inactive
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Contact details of the location
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Type of function performed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: Coding): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    @scala.inline
    def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPhysicalType(value: CodeableConcept): Self = StObject.set(x, "physicalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalTypeUndefined: Self = StObject.set(x, "physicalType", js.undefined)
    
    @scala.inline
    def setPosition(value: LocationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    @scala.inline
    def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value :_*))
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
