package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoalTarget
  extends StObject
     with BackboneElement {
  
  var _dueDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Indicates either the date or the duration after start by which the goal should be met.
    */
  var dueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates either the date or the duration after start by which the goal should be met.
    */
  var dueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
    */
  var measure: js.UndefOr[CodeableConcept] = js.undefined
}
object GoalTarget {
  
  inline def apply(): GoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalTarget]
  }
  
  extension [Self <: GoalTarget](x: Self) {
    
    inline def setDetailCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "detailCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDetailCodeableConceptUndefined: Self = StObject.set(x, "detailCodeableConcept", js.undefined)
    
    inline def setDetailQuantity(value: Quantity): Self = StObject.set(x, "detailQuantity", value.asInstanceOf[js.Any])
    
    inline def setDetailQuantityUndefined: Self = StObject.set(x, "detailQuantity", js.undefined)
    
    inline def setDetailRange(value: Range): Self = StObject.set(x, "detailRange", value.asInstanceOf[js.Any])
    
    inline def setDetailRangeUndefined: Self = StObject.set(x, "detailRange", js.undefined)
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setDueDuration(value: Duration): Self = StObject.set(x, "dueDuration", value.asInstanceOf[js.Any])
    
    inline def setDueDurationUndefined: Self = StObject.set(x, "dueDuration", js.undefined)
    
    inline def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def set_dueDate(value: Element): Self = StObject.set(x, "_dueDate", value.asInstanceOf[js.Any])
    
    inline def set_dueDateUndefined: Self = StObject.set(x, "_dueDate", js.undefined)
  }
}
