package typings.fhir.r5Mod

import typings.fhir.fhirStrings.deny
import typings.fhir.fhirStrings.permit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRule
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A description or definition of which activities are allowed to be done on the data.
    */
  var activity: js.UndefOr[js.Array[PermissionRuleActivity]] = js.undefined
  
  /**
    * A description or definition of which activities are allowed to be done on the data.
    */
  var data: js.UndefOr[js.Array[PermissionRuleData]] = js.undefined
  
  /**
    * What limits apply to the use of the data.
    */
  var limit: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * deny | permit.
    */
  var `type`: js.UndefOr[deny | permit] = js.undefined
}
object PermissionRule {
  
  inline def apply(): PermissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRule] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: js.Array[PermissionRuleActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setActivityVarargs(value: PermissionRuleActivity*): Self = StObject.set(x, "activity", js.Array(value*))
    
    inline def setData(value: js.Array[PermissionRuleData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: PermissionRuleData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLimit(value: js.Array[CodeableConcept]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLimitVarargs(value: CodeableConcept*): Self = StObject.set(x, "limit", js.Array(value*))
    
    inline def setType(value: deny | permit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
