package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXElement
  extends BaseNode
     with _Node {
  
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment] = js.native
  
  var closingElement: JSXClosingElement | Null = js.native
  
  var openingElement: JSXOpeningElement = js.native
  
  @JSName("type")
  var type_JSXElement: typings.estreeJsx.estreeJsxStrings.JSXElement = js.native
}
object JSXElement {
  
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXElement
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
  
  @scala.inline
  implicit class JSXElementMutableBuilder[Self <: JSXElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingElement(value: JSXClosingElement): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    @scala.inline
    def setOpeningElement(value: JSXOpeningElement): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
