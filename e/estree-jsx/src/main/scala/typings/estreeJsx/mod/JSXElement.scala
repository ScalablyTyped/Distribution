package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXElement
  extends StObject
     with BaseNode
     with _Node {
  
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  
  var closingElement: JSXClosingElement | Null
  
  var openingElement: JSXOpeningElement
  
  @JSName("type")
  var type_JSXElement: typings.estreeJsx.estreeJsxStrings.JSXElement
}
object JSXElement {
  
  inline def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement]
  }
  
  extension [Self <: JSXElement](x: Self) {
    
    inline def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setClosingElement(value: JSXClosingElement): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    inline def setOpeningElement(value: JSXOpeningElement): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
