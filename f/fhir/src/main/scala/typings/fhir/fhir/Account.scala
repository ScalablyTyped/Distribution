package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks balance, charges, for patient or cost center
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Account extends DomainResource {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Time window that transactions may be posted to this account
    */
  var active: js.UndefOr[Period] = js.native
  
  /**
    * How much is in account?
    */
  var balance: js.UndefOr[Money] = js.native
  
  /**
    * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
    */
  var coverage: js.UndefOr[js.Array[AccountCoverage]] = js.native
  
  /**
    * Explanation of purpose/use
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Responsible for the account
    */
  var guarantor: js.UndefOr[js.Array[AccountGuarantor]] = js.native
  
  /**
    * Account number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Human-readable label
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Who is responsible?
    */
  var owner: js.UndefOr[Reference] = js.native
  
  /**
    * Transaction window
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * What is account tied to?
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * E.g. patient, expense, depreciation
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setActive(value: Period): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setBalance(value: Money): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    
    @scala.inline
    def setCoverageVarargs(value: AccountCoverage*): Self = this.set("coverage", js.Array(value :_*))
    
    @scala.inline
    def setCoverage(value: js.Array[AccountCoverage]): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGuarantorVarargs(value: AccountGuarantor*): Self = this.set("guarantor", js.Array(value :_*))
    
    @scala.inline
    def setGuarantor(value: js.Array[AccountGuarantor]): Self = this.set("guarantor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuarantor: Self = this.set("guarantor", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Reference): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
