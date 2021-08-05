package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target outcome for the goal
  */
trait GoalTarget
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'dueDate'.
    */
  var _dueDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The target value to be achieved
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The target value to be achieved
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The target value to be achieved
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Reach goal on or before
    */
  var dueDate: js.UndefOr[date] = js.undefined
  
  /**
    * Reach goal on or before
    */
  var dueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The parameter whose value is being tracked
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
    
    inline def setDueDate(value: date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setDueDuration(value: Duration): Self = StObject.set(x, "dueDuration", value.asInstanceOf[js.Any])
    
    inline def setDueDurationUndefined: Self = StObject.set(x, "dueDuration", js.undefined)
    
    inline def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def set_dueDate(value: Element): Self = StObject.set(x, "_dueDate", value.asInstanceOf[js.Any])
    
    inline def set_dueDateUndefined: Self = StObject.set(x, "_dueDate", js.undefined)
  }
}
