package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A measured or measurable amount
  */
@js.native
trait Quantity extends Element {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'comparator'.
    */
  var _comparator: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'unit'.
    */
  var _unit: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * Coded form of the unit
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  
  /**
    * < | <= | >= | > - how to understand the value
    */
  var comparator: js.UndefOr[code] = js.native
  
  /**
    * System that defines coded unit form
    */
  var system: js.UndefOr[uri] = js.native
  
  /**
    * Unit representation
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * Numerical value (with implicit precision)
    */
  var value: js.UndefOr[decimal] = js.native
}
object Quantity {
  
  @scala.inline
  def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  @scala.inline
  implicit class QuantityMutableBuilder[Self <: Quantity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setComparator(value: code): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: decimal): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_comparator(value: Element): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_unit(value: Element): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unitUndefined: Self = StObject.set(x, "_unit", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
