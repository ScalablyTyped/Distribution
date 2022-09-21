package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoalTarget
  extends StObject
     with BackboneElement {
  
  var _detailBoolean: js.UndefOr[Element] = js.undefined
  
  var _detailString: js.UndefOr[Element] = js.undefined
  
  var _dueDate: js.UndefOr[Element] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailRange: js.UndefOr[Range] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Goal.target.measure defines a coded value.
    */
  var detailString: js.UndefOr[String] = js.undefined
  
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
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setDueDuration(value: Duration): Self = StObject.set(x, "dueDuration", value.asInstanceOf[js.Any])
    
    inline def setDueDurationUndefined: Self = StObject.set(x, "dueDuration", js.undefined)
    
    inline def setMeasure(value: CodeableConcept): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def set_detailBoolean(value: Element): Self = StObject.set(x, "_detailBoolean", value.asInstanceOf[js.Any])
    
    inline def set_detailBooleanUndefined: Self = StObject.set(x, "_detailBoolean", js.undefined)
    
    inline def set_detailString(value: Element): Self = StObject.set(x, "_detailString", value.asInstanceOf[js.Any])
    
    inline def set_detailStringUndefined: Self = StObject.set(x, "_detailString", js.undefined)
    
    inline def set_dueDate(value: Element): Self = StObject.set(x, "_dueDate", value.asInstanceOf[js.Any])
    
    inline def set_dueDateUndefined: Self = StObject.set(x, "_dueDate", js.undefined)
  }
}
