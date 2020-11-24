package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enrollment request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait EnrollmentRequest extends DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Insurance information
    */
  var coverage: js.UndefOr[Reference] = js.native
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
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
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * The subject of the Products and Services
    */
  var subject: js.UndefOr[Reference] = js.native
}
object EnrollmentRequest {
  
  @scala.inline
  def apply(): EnrollmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentRequest]
  }
  
  @scala.inline
  implicit class EnrollmentRequestOps[Self <: EnrollmentRequest] (val x: Self) extends AnyVal {
    
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
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
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
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
