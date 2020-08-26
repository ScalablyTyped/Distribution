package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details and position information for a physical place
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Location extends DomainResource {
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Physical location
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * A list of alternate names that the location is known as, or was known as in the past
    */
  var alias: js.UndefOr[js.Array[String]] = js.native
  /**
    * Additional details about the location that could be displayed as further information to identify the location beyond its name
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Unique code or number identifying the location to its users
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Organization responsible for provisioning and upkeep
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  /**
    * instance | kind
    */
  var mode: js.UndefOr[code] = js.native
  /**
    * Name of the location as used by humans
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Operational status of the location (typically only for a bed/room)
    */
  var operationalStatus: js.UndefOr[Coding] = js.native
  /**
    * Another Location this one is physically part of
    */
  var partOf: js.UndefOr[Reference] = js.native
  /**
    * Physical form of the location
    */
  var physicalType: js.UndefOr[CodeableConcept] = js.native
  /**
    * The absolute geographic location
    */
  var position: js.UndefOr[LocationPosition] = js.native
  /**
    * active | suspended | inactive
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Contact details of the location
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
  /**
    * Type of function performed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def set_aliasVarargs(value: Element*): Self = this.set("_alias", js.Array(value :_*))
    @scala.inline
    def set_alias(value: js.Array[Element]): Self = this.set("_alias", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_alias: Self = this.set("_alias", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setManagingOrganization(value: Reference): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    @scala.inline
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperationalStatus(value: Coding): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    @scala.inline
    def setPartOf(value: Reference): Self = this.set("partOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    @scala.inline
    def setPhysicalType(value: CodeableConcept): Self = this.set("physicalType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalType: Self = this.set("physicalType", js.undefined)
    @scala.inline
    def setPosition(value: LocationPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

