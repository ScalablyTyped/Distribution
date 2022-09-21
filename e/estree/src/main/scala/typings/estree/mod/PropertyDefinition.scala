package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDefinition
  extends StObject
     with BaseNode {
  
  var computed: Boolean
  
  var key: Expression | PrivateIdentifier
  
  var static: Boolean
  
  @JSName("type")
  var type_PropertyDefinition: typings.estree.estreeStrings.PropertyDefinition
  
  var value: js.UndefOr[Expression | Null] = js.undefined
}
object PropertyDefinition {
  
  inline def apply(computed: Boolean, key: Expression | PrivateIdentifier, static: Boolean): PropertyDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PropertyDefinition")
    __obj.asInstanceOf[PropertyDefinition]
  }
  
  extension [Self <: PropertyDefinition](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression | PrivateIdentifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.PropertyDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
