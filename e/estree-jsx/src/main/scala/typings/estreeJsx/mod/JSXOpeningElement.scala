package typings.estreeJsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXOpeningElement
  extends JSXBoundaryElement
     with _Node {
  
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute] = js.native
  
  var selfClosing: Boolean = js.native
  
  @JSName("type")
  var type_JSXOpeningElement: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement = js.native
}
object JSXOpeningElement {
  
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement]
  }
  
  @scala.inline
  implicit class JSXOpeningElementMutableBuilder[Self <: JSXOpeningElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[JSXAttribute | JSXSpreadAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: (JSXAttribute | JSXSpreadAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
