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
  
  inline def apply(code: Coding): UsageContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageContext]
  }
  
  extension [Self <: UsageContext](x: Self) {
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
