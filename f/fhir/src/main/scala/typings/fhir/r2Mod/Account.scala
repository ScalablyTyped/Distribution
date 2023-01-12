package typings.fhir.r2Mod

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
    * Indicates the period of time over which the account is allowed.
    */
  var activePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
    */
  var balance: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.
    */
  var coveragePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifies the currency to which transactions must be converted when crediting or debiting the account.
    */
  var currency: js.UndefOr[Coding] = js.undefined
  
  /**
    * Provides additional information about what the account tracks and how it is used.
    */
  var description: js.UndefOr[String] = js.undefined
  
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
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Account: typings.fhir.fhirStrings.Account
  
  /**
    * Indicates whether the account is presently used/useable or not.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the patient, device, practitioner, location or other object the account is associated with.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setActivePeriod(value: Period): Self = StObject.set(x, "activePeriod", value.asInstanceOf[js.Any])
    
    inline def setActivePeriodUndefined: Self = StObject.set(x, "activePeriod", js.undefined)
    
    inline def setBalance(value: Quantity): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setCoveragePeriod(value: Period): Self = StObject.set(x, "coveragePeriod", value.asInstanceOf[js.Any])
    
    inline def setCoveragePeriodUndefined: Self = StObject.set(x, "coveragePeriod", js.undefined)
    
    inline def setCurrency(value: Coding): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Account): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
