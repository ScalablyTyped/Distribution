package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Period): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setBalance(value: Money): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    @scala.inline
    def setCoverage(value: js.Array[AccountCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    @scala.inline
    def setCoverageVarargs(value: AccountCoverage*): Self = StObject.set(x, "coverage", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGuarantor(value: js.Array[AccountGuarantor]): Self = StObject.set(x, "guarantor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuarantorUndefined: Self = StObject.set(x, "guarantor", js.undefined)
    
    @scala.inline
    def setGuarantorVarargs(value: AccountGuarantor*): Self = StObject.set(x, "guarantor", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
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
