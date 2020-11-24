package typings.fhir.fhir

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
  implicit class QuantityOps[Self <: Quantity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_comparator(value: Element): Self = this.set("_comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comparator: Self = this.set("_comparator", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    
    @scala.inline
    def set_unit(value: Element): Self = this.set("_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_unit: Self = this.set("_unit", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setComparator(value: code): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setValue(value: decimal): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
