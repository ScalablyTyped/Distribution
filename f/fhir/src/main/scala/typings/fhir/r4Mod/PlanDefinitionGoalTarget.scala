package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionGoalTarget
  extends StObject
     with BackboneElement {
  
  /**
    * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%, or in the case of pharmaceutical quality - NMT 0.6%, Clear solution, etc. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%, or in the case of pharmaceutical quality - NMT 0.6%, Clear solution, etc. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%, or in the case of pharmaceutical quality - NMT 0.6%, Clear solution, etc. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Indicates the timeframe after the start of the goal in which the goal should be met.
    */
  var due: js.UndefOr[Duration] = js.undefined
  
  /**
    * The parameter whose value is to be tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
    */
  var measure: js.UndefOr[CodeableConcept] = js.undefined
}
object PlanDefinitionGoalTarget {
  
  inline def apply(): PlanDefinitionGoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionGoalTarget]
  }
  
  extension [Self <: PlanDefinitionGoalTarget](x: Self) {
    
    inline def setDetailCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "detailCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDetailCodeableConceptUndefined: Self = StObject.set(x, "detailCodeableConcept", js.undefined)
    
    inline def setDetailQuantity(value: Quantity): Self = StObject.set(x, "detailQuantity", value.asInstanceOf[js.Any])
    
    inline def setDetailQuantityUndefined: Self = StObject.set(x, "detailQuantity", js.undefined)
    
    inline def setDetailRange(value: Range): Self = StObject.set(x, "detailRange", value.asInstanceOf[js.Any])
    
    inline def setDetailRangeUndefined: Self = StObject.set(x, "detailRange", js.undefined)
    
    inline def setDue(value: Duration): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    inline def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    inline def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
  }
}
