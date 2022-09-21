package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanPlanGeneralCost
  extends StObject
     with BackboneElement {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional information about the general costs associated with this plan.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the cost.
    */
  var cost: js.UndefOr[Money] = js.undefined
  
  /**
    * Number of participants enrolled in the plan.
    */
  var groupSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of cost.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object InsurancePlanPlanGeneralCost {
  
  inline def apply(): InsurancePlanPlanGeneralCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsurancePlanPlanGeneralCost]
  }
  
  extension [Self <: InsurancePlanPlanGeneralCost](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCost(value: Money): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    inline def setGroupSizeUndefined: Self = StObject.set(x, "groupSize", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}
