package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttribute
  extends StObject
     with BaseNode
     with _Node {
  
  var name: JSXIdentifier | JSXNamespacedName
  
  @JSName("type")
  var type_JSXAttribute: typings.estreeJsx.estreeJsxStrings.JSXAttribute
  
  var value: Literal | JSXExpressionContainer | JSXElement | JSXFragment | Null
}
object JSXAttribute {
  
  inline def apply(name: JSXIdentifier | JSXNamespacedName): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute]
  }
  
  extension [Self <: JSXAttribute](x: Self) {
    
    inline def setName(value: JSXIdentifier | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Literal | JSXExpressionContainer | JSXElement | JSXFragment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
