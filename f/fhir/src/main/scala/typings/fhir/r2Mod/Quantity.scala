package typings.fhir.r2Mod

import typings.fhir.fhirStrings.Greaterthansign
import typings.fhir.fhirStrings.GreaterthansignEqualssign
import typings.fhir.fhirStrings.Lessthansign
import typings.fhir.fhirStrings.LessthansignEqualssign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantity
  extends StObject
     with Element {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _comparator: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _unit: js.UndefOr[Element] = js.undefined
  
  /**
    * Need a computable form of the unit that is fixed across all forms. UCUM provides this for quantities, but SNOMED CT provides many units of interest.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Need a framework for handling measures where the value is <5ug/L or >400mg/L due to the limitations of measuring methodology.
    */
  var comparator: js.UndefOr[
    Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign
  ] = js.undefined
  
  /**
    * Need to know the system that defines the coded form of the unit.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * There are many representations for units of measure and in many contexts, particular representations are fixed and required. I.e. mcg for micrograms.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * Precision is handled implicitly in almost all cases of measurement.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object Quantity {
  
  inline def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  extension [Self <: Quantity](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComparator(value: Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comparator(value: Element): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_unit(value: Element): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    
    inline def set_unitUndefined: Self = StObject.set(x, "_unit", js.undefined)
  }
}
