package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`deny-overrides`
import typings.fhir.fhirStrings.`deny-unless-permit`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`ordered-deny-overrides`
import typings.fhir.fhirStrings.`ordered-permit-overrides`
import typings.fhir.fhirStrings.`permit-overrides`
import typings.fhir.fhirStrings.`permit-unless-deny`
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
  
  var _combining: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The person or entity that asserts the permission.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * see [XACML Combining Rules](http://docs.oasis-open.org/xacml/3.0/xacml-3.0-core-spec-cos01-en.html#_Toc325047267)
    */
  var combining: `deny-overrides` | `permit-overrides` | `ordered-deny-overrides` | `ordered-permit-overrides` | `deny-unless-permit` | `permit-unless-deny`
  
  /**
    * The date that permission was asserted.
    */
  var date: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The asserted justification for using the data.
    */
  var justification: js.UndefOr[PermissionJustification] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Permission: typings.fhir.fhirStrings.Permission
  
  /**
    * A set of rules.
    */
  var rule: js.UndefOr[js.Array[PermissionRule]] = js.undefined
  
  /**
    * Status.
    */
  var status: active | `entered-in-error` | draft | rejected
  
  /**
    * The period in which the permission is active.
    */
  var validity: js.UndefOr[Period] = js.undefined
}
object Permission {
  
  inline def apply(
    combining: `deny-overrides` | `permit-overrides` | `ordered-deny-overrides` | `ordered-permit-overrides` | `deny-unless-permit` | `permit-unless-deny`,
    status: active | `entered-in-error` | draft | rejected
  ): Permission = {
    val __obj = js.Dynamic.literal(combining = combining.asInstanceOf[js.Any], resourceType = "Permission", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setCombining(
      value: `deny-overrides` | `permit-overrides` | `ordered-deny-overrides` | `ordered-permit-overrides` | `deny-unless-permit` | `permit-unless-deny`
    ): Self = StObject.set(x, "combining", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Array[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: String*): Self = StObject.set(x, "date", js.Array(value*))
    
    inline def setJustification(value: PermissionJustification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Permission): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[PermissionRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: PermissionRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setStatus(value: active | `entered-in-error` | draft | rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: Period): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
    
    inline def set_combining(value: Element): Self = StObject.set(x, "_combining", value.asInstanceOf[js.Any])
    
    inline def set_combiningUndefined: Self = StObject.set(x, "_combining", js.undefined)
    
    inline def set_date(value: js.Array[Element]): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_dateVarargs(value: Element*): Self = StObject.set(x, "_date", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
