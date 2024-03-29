package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratumComponent
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * The code for the stratum component value.
    */
  var code: CodeableConcept
  
  /**
    * The stratifier component from the Measure that corresponds to this stratifier component in the MeasureReport resource.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * The stratum component value.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The stratum component value.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The stratum component value.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The stratum component value.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The stratum component value.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
}
object MeasureReportGroupStratifierStratumComponent {
  
  inline def apply(code: CodeableConcept): MeasureReportGroupStratifierStratumComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratumComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroupStratifierStratumComponent] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
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
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
