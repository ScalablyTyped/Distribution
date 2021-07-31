package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter that controlled the expansion process
  */
trait ValueSetExpansionParameter
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Name as assigned by the server
    */
  var name: String
  
  /**
    * Value of the named parameter
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value of the named parameter
    */
  var valueCode: js.UndefOr[code] = js.undefined
  
  /**
    * Value of the named parameter
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  
  /**
    * Value of the named parameter
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  
  /**
    * Value of the named parameter
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the named parameter
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}
object ValueSetExpansionParameter {
  
  @scala.inline
  def apply(name: String): ValueSetExpansionParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansionParameter]
  }
  
  @scala.inline
  implicit class ValueSetExpansionParameterMutableBuilder[Self <: ValueSetExpansionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCode(value: code): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    @scala.inline
    def setValueDecimal(value: decimal): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def setValueUri(value: uri): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    @scala.inline
    def set_valueDecimal(value: Element): Self = StObject.set(x, "_valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDecimalUndefined: Self = StObject.set(x, "_valueDecimal", js.undefined)
    
    @scala.inline
    def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    @scala.inline
    def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
