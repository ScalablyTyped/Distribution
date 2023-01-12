package typings.fhir.r5Mod

import typings.fhir.fhirStrings.Greaterthansign
import typings.fhir.fhirStrings.GreaterthansignEqualssign
import typings.fhir.fhirStrings.Lessthansign
import typings.fhir.fhirStrings.LessthansignEqualssign
import typings.fhir.fhirStrings.ad
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
    * The preferred system is UCUM, but SNOMED CT can also be used (for customary units) or ISO 4217 for currency.  The context of use may additionally require a code from a particular system.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
    */
  var comparator: js.UndefOr[
    Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign | ad
  ] = js.undefined
  
  /**
    * The identification of the system that provides the coded form of the unit.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable form of the unit.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The implicit precision in the value should always be honored. Monetary values have their own rules for handling precision (refer to standard accounting text books).
    */
  var value: js.UndefOr[Double] = js.undefined
}
object Quantity {
  
  inline def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quantity] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComparator(value: Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign | ad): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
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
