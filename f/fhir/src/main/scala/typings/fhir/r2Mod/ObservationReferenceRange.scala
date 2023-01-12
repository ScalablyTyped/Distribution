package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationReferenceRange
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Some analytes vary greatly over age.
    */
  var age: js.UndefOr[Range] = js.undefined
  
  /**
    * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).
    */
  var high: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).
    */
  var low: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Need to be able to say what kind of reference range this is - normal, recommended, therapeutic, or perhaps what state this reference range applies to (i.e. age, hormonal cycles, etc.).
    */
  var meaning: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
    */
  var text: js.UndefOr[String] = js.undefined
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
    
    inline def setHigh(value: Quantity): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Quantity): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setMeaning(value: CodeableConcept): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
