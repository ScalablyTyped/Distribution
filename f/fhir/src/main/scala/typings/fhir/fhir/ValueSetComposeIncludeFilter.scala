package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Select codes/concepts by their properties (including relationships)
  */
@js.native
trait ValueSetComposeIncludeFilter extends BackboneElement {
  
  /**
    * Contains extended information for property 'op'.
    */
  var _op: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
    */
  var op: code = js.native
  
  /**
    * A property defined by the code system
    */
  var property: code = js.native
  
  /**
    * Code from the system, or regex criteria, or boolean value for exists
    */
  var value: code = js.native
}
object ValueSetComposeIncludeFilter {
  
  @scala.inline
  def apply(op: code, property: code, value: code): ValueSetComposeIncludeFilter = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeFilter]
  }
  
  @scala.inline
  implicit class ValueSetComposeIncludeFilterMutableBuilder[Self <: ValueSetComposeIncludeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: code): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: code): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: code): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_op(value: Element): Self = StObject.set(x, "_op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_opUndefined: Self = StObject.set(x, "_op", js.undefined)
    
    @scala.inline
    def set_property(value: Element): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
