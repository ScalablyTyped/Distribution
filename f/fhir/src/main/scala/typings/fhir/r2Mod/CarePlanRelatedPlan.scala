package typings.fhir.r2Mod

import typings.fhir.fhirStrings.fulfills
import typings.fhir.fhirStrings.includes
import typings.fhir.fhirStrings.replaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanRelatedPlan
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies the type of relationship this plan has to the target plan.
    */
  var code: js.UndefOr[includes | replaces | fulfills] = js.undefined
  
  /**
    * A reference to the plan to which a relationship is asserted.
    */
  var plan: Reference
}
object CarePlanRelatedPlan {
  
  inline def apply(plan: Reference): CarePlanRelatedPlan = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanRelatedPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarePlanRelatedPlan] (val x: Self) extends AnyVal {
    
    inline def setCode(value: includes | replaces | fulfills): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setPlan(value: Reference): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
