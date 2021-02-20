package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class EligibilityRequestMutableBuilder[Self <: EligibilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenefitCategory(value: CodeableConcept): Self = StObject.set(x, "benefitCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitCategoryUndefined: Self = StObject.set(x, "benefitCategory", js.undefined)
    
    @scala.inline
    def setBenefitSubCategory(value: CodeableConcept): Self = StObject.set(x, "benefitSubCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitSubCategoryUndefined: Self = StObject.set(x, "benefitSubCategory", js.undefined)
    
    @scala.inline
    def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    @scala.inline
    def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    @scala.inline
    def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setServicedDate(value: date): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    @scala.inline
    def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_businessArrangement(value: Element): Self = StObject.set(x, "_businessArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_businessArrangementUndefined: Self = StObject.set(x, "_businessArrangement", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
