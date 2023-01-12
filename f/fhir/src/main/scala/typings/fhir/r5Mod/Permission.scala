package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _assertionDate: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The person or entity that asserts the permission.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date that permission was asserted.
    */
  var assertionDate: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This can be 1) the definition of data elements, or 2) a category or label) e.g. “sensitive”. It could also be a c) graph-like definition of a set of data elements.
    */
  var dataScope: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /**
    * grant|refuse.
    */
  var intent: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The asserted justification for using the data.
    */
  var justification: js.UndefOr[PermissionJustification] = js.undefined
  
  /**
    * A description or definition of which activities are allowed to be done on the data.
    */
  var processingActivity: js.UndefOr[js.Array[PermissionProcessingActivity]] = js.undefined
  
  /**
    * The purpose for which the permission is given.
    */
  var purpose: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Permission: typings.fhir.fhirStrings.Permission
  
  /**
    * Status.
    */
  var status: active | `entered-in-error` | draft | rejected
  
  /**
    * What limits apply to the use of the data.
    */
  var usageLimitations: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The period in which the permission is active.
    */
  var validity: js.UndefOr[Period] = js.undefined
}
object Permission {
  
  inline def apply(status: active | `entered-in-error` | draft | rejected): Permission = {
    val __obj = js.Dynamic.literal(resourceType = "Permission", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setAssertionDate(value: js.Array[String]): Self = StObject.set(x, "assertionDate", value.asInstanceOf[js.Any])
    
    inline def setAssertionDateUndefined: Self = StObject.set(x, "assertionDate", js.undefined)
    
    inline def setAssertionDateVarargs(value: String*): Self = StObject.set(x, "assertionDate", js.Array(value*))
    
    inline def setDataScope(value: js.Array[Expression]): Self = StObject.set(x, "dataScope", value.asInstanceOf[js.Any])
    
    inline def setDataScopeUndefined: Self = StObject.set(x, "dataScope", js.undefined)
    
    inline def setDataScopeVarargs(value: Expression*): Self = StObject.set(x, "dataScope", js.Array(value*))
    
    inline def setIntent(value: CodeableConcept): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setJustification(value: PermissionJustification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setProcessingActivity(value: js.Array[PermissionProcessingActivity]): Self = StObject.set(x, "processingActivity", value.asInstanceOf[js.Any])
    
    inline def setProcessingActivityUndefined: Self = StObject.set(x, "processingActivity", js.undefined)
    
    inline def setProcessingActivityVarargs(value: PermissionProcessingActivity*): Self = StObject.set(x, "processingActivity", js.Array(value*))
    
    inline def setPurpose(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: CodeableConcept*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Permission): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | `entered-in-error` | draft | rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitations(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usageLimitations", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitationsUndefined: Self = StObject.set(x, "usageLimitations", js.undefined)
    
    inline def setUsageLimitationsVarargs(value: CodeableConcept*): Self = StObject.set(x, "usageLimitations", js.Array(value*))
    
    inline def setValidity(value: Period): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
    
    inline def set_assertionDate(value: js.Array[Element]): Self = StObject.set(x, "_assertionDate", value.asInstanceOf[js.Any])
    
    inline def set_assertionDateUndefined: Self = StObject.set(x, "_assertionDate", js.undefined)
    
    inline def set_assertionDateVarargs(value: Element*): Self = StObject.set(x, "_assertionDate", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
