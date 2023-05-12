package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroupElementTargetDependsOn
  extends StObject
     with BackboneElement {
  
  var _attribute: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the additional attribute that holds a value the map depends on.
    */
  var attribute: String
  
  /**
    * If the data type is a code, then the code system is .group.source for .dependsOn.valueCode and .group.target for .product.valueCode.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the data type is a code, then the code system is .group.source for .dependsOn.valueCode and .group.target for .product.valueCode.
    */
  var valueCode: js.UndefOr[String] = js.undefined
  
  /**
    * If the data type is a code, then the code system is .group.source for .dependsOn.valueCode and .group.target for .product.valueCode.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * If the data type is a code, then the code system is .group.source for .dependsOn.valueCode and .group.target for .product.valueCode.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This mapping applies if the data element value is a code from this value set.
    */
  var valueSet: js.UndefOr[String] = js.undefined
  
  /**
    * If the data type is a code, then the code system is .group.source for .dependsOn.valueCode and .group.target for .product.valueCode.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ConceptMapGroupElementTargetDependsOn {
  
  inline def apply(attribute: String): ConceptMapGroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTargetDependsOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapGroupElementTargetDependsOn] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCode(value: String): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_attribute(value: Element): Self = StObject.set(x, "_attribute", value.asInstanceOf[js.Any])
    
    inline def set_attributeUndefined: Self = StObject.set(x, "_attribute", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
