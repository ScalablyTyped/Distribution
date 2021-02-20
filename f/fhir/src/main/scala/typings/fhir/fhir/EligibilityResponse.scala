package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EligibilityResponse resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait EligibilityResponse extends DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'inforce'.
    */
  var _inforce: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[EligibilityResponseError]] = js.native
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Coverage inforce indicator
    */
  var inforce: js.UndefOr[Boolean] = js.native
  
  /**
    * Details by insurance coverage
    */
  var insurance: js.UndefOr[js.Array[EligibilityResponseInsurance]] = js.native
  
  /**
    * Insurer issuing the coverage
    */
  var insurer: js.UndefOr[Reference] = js.native
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Eligibility reference
    */
  var request: js.UndefOr[Reference] = js.native
  
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.native
  
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}
object EligibilityResponse {
  
  @scala.inline
  def apply(): EligibilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityResponse]
  }
  
  @scala.inline
  implicit class EligibilityResponseMutableBuilder[Self <: EligibilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    @scala.inline
    def setError(value: js.Array[EligibilityResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: EligibilityResponseError*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInforce(value: Boolean): Self = StObject.set(x, "inforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInforceUndefined: Self = StObject.set(x, "inforce", js.undefined)
    
    @scala.inline
    def setInsurance(value: js.Array[EligibilityResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    @scala.inline
    def setInsuranceVarargs(value: EligibilityResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value :_*))
    
    @scala.inline
    def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    @scala.inline
    def set_inforce(value: Element): Self = StObject.set(x, "_inforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inforceUndefined: Self = StObject.set(x, "_inforce", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
