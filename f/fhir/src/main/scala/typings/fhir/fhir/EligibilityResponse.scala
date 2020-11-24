package typings.fhir.fhir

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
  implicit class EligibilityResponseOps[Self <: EligibilityResponse] (val x: Self) extends AnyVal {
    
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
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = this.set("_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disposition: Self = this.set("_disposition", js.undefined)
    
    @scala.inline
    def set_inforce(value: Element): Self = this.set("_inforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_inforce: Self = this.set("_inforce", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: EligibilityResponseError*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: js.Array[EligibilityResponseError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInforce(value: Boolean): Self = this.set("inforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforce: Self = this.set("inforce", js.undefined)
    
    @scala.inline
    def setInsuranceVarargs(value: EligibilityResponseInsurance*): Self = this.set("insurance", js.Array(value :_*))
    
    @scala.inline
    def setInsurance(value: js.Array[EligibilityResponseInsurance]): Self = this.set("insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurance: Self = this.set("insurance", js.undefined)
    
    @scala.inline
    def setInsurer(value: Reference): Self = this.set("insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurer: Self = this.set("insurer", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = this.set("requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOrganization: Self = this.set("requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = this.set("requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestProvider: Self = this.set("requestProvider", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
