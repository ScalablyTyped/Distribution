package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionGoalTarget
  extends StObject
     with BackboneElement {
  
  var _detailBoolean: js.UndefOr[Element] = js.undefined
  
  var _detailString: js.UndefOr[Element] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the goal.target.measure defines a coded value.
    */
  var detailString: js.UndefOr[String] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanDefinitionGoalTarget] (val x: Self) extends AnyVal {
    
    inline def setDetailBoolean(value: Boolean): Self = StObject.set(x, "detailBoolean", value.asInstanceOf[js.Any])
    
    inline def setDetailBooleanUndefined: Self = StObject.set(x, "detailBoolean", js.undefined)
    
    inline def setDetailCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "detailCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDetailCodeableConceptUndefined: Self = StObject.set(x, "detailCodeableConcept", js.undefined)
    
    inline def setDetailInteger(value: Double): Self = StObject.set(x, "detailInteger", value.asInstanceOf[js.Any])
    
    inline def setDetailIntegerUndefined: Self = StObject.set(x, "detailInteger", js.undefined)
    
    inline def setDetailQuantity(value: Quantity): Self = StObject.set(x, "detailQuantity", value.asInstanceOf[js.Any])
    
    inline def setDetailQuantityUndefined: Self = StObject.set(x, "detailQuantity", js.undefined)
    
    inline def setDetailRange(value: Range): Self = StObject.set(x, "detailRange", value.asInstanceOf[js.Any])
    
    inline def setDetailRangeUndefined: Self = StObject.set(x, "detailRange", js.undefined)
    
    inline def setDetailRatio(value: Ratio): Self = StObject.set(x, "detailRatio", value.asInstanceOf[js.Any])
    
    inline def setDetailRatioUndefined: Self = StObject.set(x, "detailRatio", js.undefined)
    
    inline def setDetailString(value: String): Self = StObject.set(x, "detailString", value.asInstanceOf[js.Any])
    
    inline def setDetailStringUndefined: Self = StObject.set(x, "detailString", js.undefined)
    
    inline def setDue(value: Duration): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
    
    inline def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
    
    inline def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def set_detailBoolean(value: Element): Self = StObject.set(x, "_detailBoolean", value.asInstanceOf[js.Any])
    
    inline def set_detailBooleanUndefined: Self = StObject.set(x, "_detailBoolean", js.undefined)
    
    inline def set_detailString(value: Element): Self = StObject.set(x, "_detailString", value.asInstanceOf[js.Any])
    
    inline def set_detailStringUndefined: Self = StObject.set(x, "_detailString", js.undefined)
  }
}
