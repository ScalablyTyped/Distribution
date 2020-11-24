package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details of a healthcare service available at a location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait HealthcareService extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'appointmentRequired'.
    */
  var _appointmentRequired: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'eligibilityNote'.
    */
  var _eligibilityNote: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'extraDetails'.
    */
  var _extraDetails: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'programName'.
    */
  var _programName: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Whether this healthcareservice is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * If an appointment is required for access to this service
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.native
  
  /**
    * Broad category of service being performed or delivered
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Collection of characteristics (attributes)
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Additional description and/or any specific issues not covered elsewhere
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Location(s) service is inteded for/available to
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Specific eligibility requirements required to use the service
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Describes the eligibility conditions for the service
    */
  var eligibilityNote: js.UndefOr[String] = js.native
  
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Extra details about the service that can't be placed in the other fields
    */
  var extraDetails: js.UndefOr[String] = js.native
  
  /**
    * External identifiers for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Location(s) where service may be provided
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Description of service as presented to a consumer while searching
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.native
  
  /**
    * Facilitates quick identification of the service
    */
  var photo: js.UndefOr[Attachment] = js.native
  
  /**
    * Program Names that categorize the service
    */
  var programName: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Organization that provides this service
    */
  var providedBy: js.UndefOr[Reference] = js.native
  
  /**
    * Ways that the service accepts referrals
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Conditions under which service is available/offered
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Specialties handled by the HealthcareService
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contacts related to the healthcare service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
  
  /**
    * Type of service that may be delivered or performed
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object HealthcareService {
  
  @scala.inline
  def apply(): HealthcareService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareService]
  }
  
  @scala.inline
  implicit class HealthcareServiceOps[Self <: HealthcareService] (val x: Self) extends AnyVal {
    
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
    def set_appointmentRequired(value: Element): Self = this.set("_appointmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_appointmentRequired: Self = this.set("_appointmentRequired", js.undefined)
    
    @scala.inline
    def set_availabilityExceptions(value: Element): Self = this.set("_availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_availabilityExceptions: Self = this.set("_availabilityExceptions", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_eligibilityNote(value: Element): Self = this.set("_eligibilityNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_eligibilityNote: Self = this.set("_eligibilityNote", js.undefined)
    
    @scala.inline
    def set_extraDetails(value: Element): Self = this.set("_extraDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_extraDetails: Self = this.set("_extraDetails", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_programNameVarargs(value: Element*): Self = this.set("_programName", js.Array(value :_*))
    
    @scala.inline
    def set_programName(value: js.Array[Element]): Self = this.set("_programName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_programName: Self = this.set("_programName", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAppointmentRequired(value: Boolean): Self = this.set("appointmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentRequired: Self = this.set("appointmentRequired", js.undefined)
    
    @scala.inline
    def setAvailabilityExceptions(value: String): Self = this.set("availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityExceptions: Self = this.set("availabilityExceptions", js.undefined)
    
    @scala.inline
    def setAvailableTimeVarargs(value: HealthcareServiceAvailableTime*): Self = this.set("availableTime", js.Array(value :_*))
    
    @scala.inline
    def setAvailableTime(value: js.Array[HealthcareServiceAvailableTime]): Self = this.set("availableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableTime: Self = this.set("availableTime", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCharacteristicVarargs(value: CodeableConcept*): Self = this.set("characteristic", js.Array(value :_*))
    
    @scala.inline
    def setCharacteristic(value: js.Array[CodeableConcept]): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacteristic: Self = this.set("characteristic", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCoverageAreaVarargs(value: Reference*): Self = this.set("coverageArea", js.Array(value :_*))
    
    @scala.inline
    def setCoverageArea(value: js.Array[Reference]): Self = this.set("coverageArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageArea: Self = this.set("coverageArea", js.undefined)
    
    @scala.inline
    def setEligibility(value: CodeableConcept): Self = this.set("eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibility: Self = this.set("eligibility", js.undefined)
    
    @scala.inline
    def setEligibilityNote(value: String): Self = this.set("eligibilityNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibilityNote: Self = this.set("eligibilityNote", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setExtraDetails(value: String): Self = this.set("extraDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraDetails: Self = this.set("extraDetails", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotAvailableVarargs(value: HealthcareServiceNotAvailable*): Self = this.set("notAvailable", js.Array(value :_*))
    
    @scala.inline
    def setNotAvailable(value: js.Array[HealthcareServiceNotAvailable]): Self = this.set("notAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAvailable: Self = this.set("notAvailable", js.undefined)
    
    @scala.inline
    def setPhoto(value: Attachment): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setProgramNameVarargs(value: String*): Self = this.set("programName", js.Array(value :_*))
    
    @scala.inline
    def setProgramName(value: js.Array[String]): Self = this.set("programName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramName: Self = this.set("programName", js.undefined)
    
    @scala.inline
    def setProvidedBy(value: Reference): Self = this.set("providedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidedBy: Self = this.set("providedBy", js.undefined)
    
    @scala.inline
    def setReferralMethodVarargs(value: CodeableConcept*): Self = this.set("referralMethod", js.Array(value :_*))
    
    @scala.inline
    def setReferralMethod(value: js.Array[CodeableConcept]): Self = this.set("referralMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralMethod: Self = this.set("referralMethod", js.undefined)
    
    @scala.inline
    def setServiceProvisionCodeVarargs(value: CodeableConcept*): Self = this.set("serviceProvisionCode", js.Array(value :_*))
    
    @scala.inline
    def setServiceProvisionCode(value: js.Array[CodeableConcept]): Self = this.set("serviceProvisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceProvisionCode: Self = this.set("serviceProvisionCode", js.undefined)
    
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
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
