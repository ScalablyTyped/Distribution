package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationReferenceRange
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
    */
  var age: js.UndefOr[Range] = js.undefined
  
  /**
    * This SHOULD be populated if there is more than one range.  If this element is not present then the normal population is assumed.
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).
    */
  var high: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).
    */
  var low: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * This SHOULD be populated if there is more than one range.  If this element is not present then the normal range is assumed.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ObservationReferenceRange {
  
  inline def apply(): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationReferenceRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationReferenceRange] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Range): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setAppliesTo(value: js.Array[CodeableConcept]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: CodeableConcept*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
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
