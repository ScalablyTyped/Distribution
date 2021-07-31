package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the context of use for a conformance or knowledge resource
  */
trait UsageContext
  extends StObject
     with Element {
  
  /**
    * Type of context being specified
    */
  var code: Coding
  
  /**
    * Value that defines the context
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Value that defines the context
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Value that defines the context
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}
object UsageContext {
  
  @scala.inline
  def apply(code: Coding): UsageContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageContext]
  }
  
  @scala.inline
  implicit class UsageContextMutableBuilder[Self <: UsageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
