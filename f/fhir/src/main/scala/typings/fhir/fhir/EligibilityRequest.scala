package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determine insurance validity and scope of coverage
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait EligibilityRequest extends DomainResource {
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Type of services covered
    */
  var benefitCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * Detailed services covered within the type
    */
  var benefitSubCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.native
  /**
    * Insurance or medical plan
    */
  var coverage: js.UndefOr[Reference] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.native
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Estimated date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.native
  /**
    * Estimated date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}

object EligibilityRequest {
  @scala.inline
  def apply(): EligibilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityRequest]
  }
  @scala.inline
  implicit class EligibilityRequestOps[Self <: EligibilityRequest] (val x: Self) extends AnyVal {
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
    def set_businessArrangement(value: Element): Self = this.set("_businessArrangement", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_businessArrangement: Self = this.set("_businessArrangement", js.undefined)
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    @scala.inline
    def set_servicedDate(value: Element): Self = this.set("_servicedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_servicedDate: Self = this.set("_servicedDate", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setBenefitCategory(value: CodeableConcept): Self = this.set("benefitCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBenefitCategory: Self = this.set("benefitCategory", js.undefined)
    @scala.inline
    def setBenefitSubCategory(value: CodeableConcept): Self = this.set("benefitSubCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBenefitSubCategory: Self = this.set("benefitSubCategory", js.undefined)
    @scala.inline
    def setBusinessArrangement(value: String): Self = this.set("businessArrangement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessArrangement: Self = this.set("businessArrangement", js.undefined)
    @scala.inline
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setEnterer(value: Reference): Self = this.set("enterer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterer: Self = this.set("enterer", js.undefined)
    @scala.inline
    def setFacility(value: Reference): Self = this.set("facility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setInsurer(value: Reference): Self = this.set("insurer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsurer: Self = this.set("insurer", js.undefined)
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    @scala.inline
    def setPriority(value: CodeableConcept): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setServicedDate(value: date): Self = this.set("servicedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicedDate: Self = this.set("servicedDate", js.undefined)
    @scala.inline
    def setServicedPeriod(value: Period): Self = this.set("servicedPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicedPeriod: Self = this.set("servicedPeriod", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

