package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportSubjectCharacteristic
  extends StObject
     with BackboneElement {
  
  var _exclude: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Example 1 is a Citation. Example 2 is a type of outcome. Example 3 is a specific outcome.
    */
  var code: CodeableConcept
  
  /**
    * Is used to express not the characteristic.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Timeframe for the characteristic.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year mortality.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year mortality.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year mortality.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year mortality.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year mortality.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
}
object EvidenceReportSubjectCharacteristic {
  
  inline def apply(code: CodeableConcept): EvidenceReportSubjectCharacteristic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceReportSubjectCharacteristic]
  }
  
  extension [Self <: EvidenceReportSubjectCharacteristic](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
