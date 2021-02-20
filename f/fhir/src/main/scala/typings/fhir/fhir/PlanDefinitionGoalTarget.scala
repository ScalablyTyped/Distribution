package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target outcome for the goal
  */
@js.native
trait PlanDefinitionGoalTarget extends BackboneElement {
  
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
    * Reach goal within
    */
  var due: js.UndefOr[Duration] = js.native
  
  /**
    * The parameter whose value is to be tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}
object PlanDefinitionGoalTarget {
  
  @scala.inline
  def apply(): PlanDefinitionGoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionGoalTarget]
  }
  
  @scala.inline
  implicit class PlanDefinitionGoalTargetMutableBuilder[Self <: PlanDefinitionGoalTarget] (val x: Self) extends AnyVal {
    
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
    def setDue(value: Duration): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    @scala.inline
    def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
  }
}
