package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the period of time over which the account is allowed to have transactions posted to it.
    * This period may be different to the coveragePeriod which is the duration of time that services may occur.
    */
  var active: js.UndefOr[Period] = js.undefined
  
  /**
    * Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
    */
  var balance: js.UndefOr[Money] = js.undefined
  
  /**
    * Typically this may be some form of insurance, internal charges, or self-pay.
    * Local or jurisdicational business rules may determine which coverage covers which types of billable items charged to the account, and in which order.
    * Where the order is important, a local/jurisdicational extension may be defined to specify the order for the type of charge.
    */
  var coverage: js.UndefOr[js.Array[AccountCoverage]] = js.undefined
  
  /**
    * Provides additional information about what the account tracks and how it is used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Parties financially responsible for the account.
    */
  var guarantor: js.UndefOr[js.Array[AccountGuarantor]] = js.undefined
  
  /**
    * Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Name used for the account when displaying it to humans in reports, etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the organization, department, etc. with responsibility for the account.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * It is possible for transactions relevant to a coverage period to be posted to the account before or after the coverage period, however the services that are being charged for must be within this period.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Account: typings.fhir.fhirStrings.Account
  
  /**
    * This element is labeled as a modifier because the status contains the codes inactive and entered-in-error that mark the Account as not currently valid.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
  
  /**
    * Accounts can be applied to non patients for tracking other non patient related activities, such as group services (patients not tracked, and costs charged to another body), or may not be allocated.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Categorizes the account for reporting and searching purposes.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal(resourceType = "Account")
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setActive(value: Period): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBalance(value: Money): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setCoverage(value: js.Array[AccountCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCoverageVarargs(value: AccountCoverage*): Self = StObject.set(x, "coverage", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuarantor(value: js.Array[AccountGuarantor]): Self = StObject.set(x, "guarantor", value.asInstanceOf[js.Any])
    
    inline def setGuarantorUndefined: Self = StObject.set(x, "guarantor", js.undefined)
    
    inline def setGuarantorVarargs(value: AccountGuarantor*): Self = StObject.set(x, "guarantor", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Account): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
