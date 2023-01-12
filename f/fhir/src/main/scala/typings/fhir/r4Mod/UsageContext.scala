package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageContext
  extends StObject
     with Element {
  
  /**
    * A code that identifies the type of context being specified by this usage context.
    */
  var code: Coding
  
  /**
    * A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
}
object UsageContext {
  
  inline def apply(code: Coding): UsageContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageContext] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
  }
}
