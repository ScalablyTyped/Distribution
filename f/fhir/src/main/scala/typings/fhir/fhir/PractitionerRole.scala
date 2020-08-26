package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Roles/organizations the practitioner is associated with
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait PractitionerRole extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.native
  /**
    * Roles which this practitioner may perform
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s)
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Business Identifiers that are specific to a role/location
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The location(s) at which this practitioner provides care
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.native
  /**
    * Organization where the roles are available
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The period during which the practitioner is authorized to perform in these role(s)
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Practitioner that is able to provide the defined services for the organation
    */
  var practitioner: js.UndefOr[Reference] = js.native
  /**
    * Specific specialty of the practitioner
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contact details that are specific to the role/location/service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object PractitionerRole {
  @scala.inline
  def apply(): PractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRole]
  }
  @scala.inline
  implicit class PractitionerRoleOps[Self <: PractitionerRole] (val x: Self) extends AnyVal {
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
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    @scala.inline
    def set_availabilityExceptions(value: Element): Self = this.set("_availabilityExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_availabilityExceptions: Self = this.set("_availabilityExceptions", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAvailabilityExceptions(value: String): Self = this.set("availabilityExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityExceptions: Self = this.set("availabilityExceptions", js.undefined)
    @scala.inline
    def setAvailableTimeVarargs(value: PractitionerRoleAvailableTime*): Self = this.set("availableTime", js.Array(value :_*))
    @scala.inline
    def setAvailableTime(value: js.Array[PractitionerRoleAvailableTime]): Self = this.set("availableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableTime: Self = this.set("availableTime", js.undefined)
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setHealthcareServiceVarargs(value: Reference*): Self = this.set("healthcareService", js.Array(value :_*))
    @scala.inline
    def setHealthcareService(value: js.Array[Reference]): Self = this.set("healthcareService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthcareService: Self = this.set("healthcareService", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLocationVarargs(value: Reference*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[Reference]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNotAvailableVarargs(value: PractitionerRoleNotAvailable*): Self = this.set("notAvailable", js.Array(value :_*))
    @scala.inline
    def setNotAvailable(value: js.Array[PractitionerRoleNotAvailable]): Self = this.set("notAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAvailable: Self = this.set("notAvailable", js.undefined)
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPractitioner(value: Reference): Self = this.set("practitioner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePractitioner: Self = this.set("practitioner", js.undefined)
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = this.set("specialty", js.Array(value :_*))
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = this.set("specialty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialty: Self = this.set("specialty", js.undefined)
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
  
}

