package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target outcome for the goal
  */
@js.native
trait GoalTarget extends BackboneElement {
  
  /**
    * Contains extended information for property 'dueDate'.
    */
  var _dueDate: js.UndefOr[Element] = js.native
  
  /**
    * The target value to be achieved
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The target value to be achieved
    */
  var detailQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * The target value to be achieved
    */
  var detailRange: js.UndefOr[Range] = js.native
  
  /**
    * Reach goal on or before
    */
  var dueDate: js.UndefOr[date] = js.native
  
  /**
    * Reach goal on or before
    */
  var dueDuration: js.UndefOr[Duration] = js.native
  
  /**
    * The parameter whose value is being tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}
object GoalTarget {
  
  @scala.inline
  def apply(): GoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalTarget]
  }
  
  @scala.inline
  implicit class GoalTargetMutableBuilder[Self <: GoalTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "detailCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailCodeableConceptUndefined: Self = StObject.set(x, "detailCodeableConcept", js.undefined)
    
    @scala.inline
    def setDetailQuantity(value: Quantity): Self = StObject.set(x, "detailQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailQuantityUndefined: Self = StObject.set(x, "detailQuantity", js.undefined)
    
    @scala.inline
    def setDetailRange(value: Range): Self = StObject.set(x, "detailRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailRangeUndefined: Self = StObject.set(x, "detailRange", js.undefined)
    
    @scala.inline
    def setDueDate(value: date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    @scala.inline
    def setDueDuration(value: Duration): Self = StObject.set(x, "dueDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDurationUndefined: Self = StObject.set(x, "dueDuration", js.undefined)
    
    @scala.inline
    def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def set_dueDate(value: Element): Self = StObject.set(x, "_dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dueDateUndefined: Self = StObject.set(x, "_dueDate", js.undefined)
  }
}
