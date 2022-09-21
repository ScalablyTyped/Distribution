package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanPlan
  extends StObject
     with BackboneElement {
  
  /**
    * The geographic region in which a health insurance plan's benefits apply.
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Overall costs associated with the plan.
    */
  var generalCost: js.UndefOr[js.Array[InsurancePlanPlanGeneralCost]] = js.undefined
  
  /**
    * Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Networks are represented as a hierarchy of organization resources.
    */
  var network: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Costs associated with the coverage provided by the product.
    */
  var specificCost: js.UndefOr[js.Array[InsurancePlanPlanSpecificCost]] = js.undefined
  
  /**
    * Type of plan. For example, "Platinum" or "High Deductable".
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object InsurancePlanPlan {
  
  inline def apply(): InsurancePlanPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsurancePlanPlan]
  }
  
  extension [Self <: InsurancePlanPlan](x: Self) {
    
    inline def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    inline def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    inline def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value*))
    
    inline def setGeneralCost(value: js.Array[InsurancePlanPlanGeneralCost]): Self = StObject.set(x, "generalCost", value.asInstanceOf[js.Any])
    
    inline def setGeneralCostUndefined: Self = StObject.set(x, "generalCost", js.undefined)
    
    inline def setGeneralCostVarargs(value: InsurancePlanPlanGeneralCost*): Self = StObject.set(x, "generalCost", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNetwork(value: js.Array[Reference]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNetworkVarargs(value: Reference*): Self = StObject.set(x, "network", js.Array(value*))
    
    inline def setSpecificCost(value: js.Array[InsurancePlanPlanSpecificCost]): Self = StObject.set(x, "specificCost", value.asInstanceOf[js.Any])
    
    inline def setSpecificCostUndefined: Self = StObject.set(x, "specificCost", js.undefined)
    
    inline def setSpecificCostVarargs(value: InsurancePlanPlanSpecificCost*): Self = StObject.set(x, "specificCost", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
