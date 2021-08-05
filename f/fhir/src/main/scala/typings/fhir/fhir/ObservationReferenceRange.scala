package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides guide for interpretation
  */
trait ObservationReferenceRange
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.undefined
  
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ObservationReferenceRange {
  
  inline def apply(): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationReferenceRange]
  }
  
  extension [Self <: ObservationReferenceRange](x: Self) {
    
    inline def setAge(value: Range): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setAppliesTo(value: js.Array[CodeableConcept]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: CodeableConcept*): Self = StObject.set(x, "appliesTo", js.Array(value :_*))
    
    inline def setHigh(value: Quantity): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Quantity): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
