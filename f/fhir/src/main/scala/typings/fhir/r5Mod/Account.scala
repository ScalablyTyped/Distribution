package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _calculatedAt: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The calculated account balances - these are calculated and processed by the finance system.
    * The balances with a `term` that is not current are usually generated/updated by an invoicing or similar process.
    */
  var balance: js.UndefOr[js.Array[AccountBalance]] = js.undefined
  
  /**
    * The BillingStatus tracks the lifecycle of the account through the billing process. It indicates how transactions are treated when they are allocated to the account.
    */
  var billingStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The total(s) are not typically updated using the restful API but more often by back-end processes included in a typical finance system.
    */
  var calculatedAt: js.UndefOr[String] = js.undefined
  
  /**
    * Typically. this may be some form of insurance, internal charges, or self-pay.
    * Local or jurisdictional business rules may determine which coverage covers which types of billable items charged to the account, and in which order.
    * Where the order is important, a local/jurisdictional extension may be defined to specify the order for the type of charge.
    */
  var coverage: js.UndefOr[js.Array[AccountCoverage]] = js.undefined
  
  /**
    * The default currency for the account.
    */
  var currency: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Provides additional information about what the account tracks and how it is used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * When using an account for billing a specific Encounter the set of diagnoses that are relevant for billing are stored here on the account where they are able to be sequenced appropriately prior to processing to produce claim(s).
    */
  var diagnosis: js.UndefOr[js.Array[AccountDiagnosis]] = js.undefined
  
  /**
    * The parties responsible for balancing the account if other payment options fall short.
    */
  var guarantor: js.UndefOr[js.Array[AccountGuarantor]] = js.undefined
  
  /**
    * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Name used for the account when displaying it to humans in reports, etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the service area, hospital, department, etc. with responsibility for managing the Account.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * When using an account for billing a specific Encounter the set of procedures that are relevant for billing are stored here on the account where they are able to be sequenced appropriately prior to processing to produce claim(s).
    */
  var procedure: js.UndefOr[js.Array[AccountProcedure]] = js.undefined
  
  /**
    * Other associated accounts related to this account.
    */
  var relatedAccount: js.UndefOr[js.Array[AccountRelatedAccount]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Account: typings.fhir.fhirStrings.Account
  
  /**
    * It is possible for transactions to be posted outside the service period, as long as the service was provided within the defined service period.
    */
  var servicePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes inactive and entered-in-error that mark the Account as not currently valid.
    */
  var status: active | inactive | `entered-in-error` | `on-hold` | unknown
  
  /**
    * Accounts can be applied to non-patients for tracking other non-patient related activities, such as group services (patients not tracked, and costs charged to another body), or might not be allocated.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Categorizes the account for reporting and searching purposes.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Account {
  
  inline def apply(status: active | inactive | `entered-in-error` | `on-hold` | unknown): Account = {
    val __obj = js.Dynamic.literal(resourceType = "Account", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setBalance(value: js.Array[AccountBalance]): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setBalanceVarargs(value: AccountBalance*): Self = StObject.set(x, "balance", js.Array(value*))
    
    inline def setBillingStatus(value: CodeableConcept): Self = StObject.set(x, "billingStatus", value.asInstanceOf[js.Any])
    
    inline def setBillingStatusUndefined: Self = StObject.set(x, "billingStatus", js.undefined)
    
    inline def setCalculatedAt(value: String): Self = StObject.set(x, "calculatedAt", value.asInstanceOf[js.Any])
    
    inline def setCalculatedAtUndefined: Self = StObject.set(x, "calculatedAt", js.undefined)
    
    inline def setCoverage(value: js.Array[AccountCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCoverageVarargs(value: AccountCoverage*): Self = StObject.set(x, "coverage", js.Array(value*))
    
    inline def setCurrency(value: CodeableConcept): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiagnosis(value: js.Array[AccountDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: AccountDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
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
    
    inline def setProcedure(value: js.Array[AccountProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: AccountProcedure*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setRelatedAccount(value: js.Array[AccountRelatedAccount]): Self = StObject.set(x, "relatedAccount", value.asInstanceOf[js.Any])
    
    inline def setRelatedAccountUndefined: Self = StObject.set(x, "relatedAccount", js.undefined)
    
    inline def setRelatedAccountVarargs(value: AccountRelatedAccount*): Self = StObject.set(x, "relatedAccount", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Account): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServicePeriod(value: Period): Self = StObject.set(x, "servicePeriod", value.asInstanceOf[js.Any])
    
    inline def setServicePeriodUndefined: Self = StObject.set(x, "servicePeriod", js.undefined)
    
    inline def setStatus(value: active | inactive | `entered-in-error` | `on-hold` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_calculatedAt(value: Element): Self = StObject.set(x, "_calculatedAt", value.asInstanceOf[js.Any])
    
    inline def set_calculatedAtUndefined: Self = StObject.set(x, "_calculatedAt", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
