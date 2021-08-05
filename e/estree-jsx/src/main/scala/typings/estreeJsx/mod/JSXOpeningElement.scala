package typings.estreeJsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningElement
  extends StObject
     with JSXBoundaryElement
     with _Node {
  
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  
  var selfClosing: Boolean
  
  @JSName("type")
  var type_JSXOpeningElement: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement
}
object JSXOpeningElement {
  
  inline def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[JSXOpeningElement]
  }
  
  extension [Self <: JSXOpeningElement](x: Self) {
    
    inline def setAttributes(value: js.Array[JSXAttribute | JSXSpreadAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: (JSXAttribute | JSXSpreadAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
