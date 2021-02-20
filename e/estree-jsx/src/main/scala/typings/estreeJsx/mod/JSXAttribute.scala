package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXAttribute
  extends BaseNode
     with _Node {
  
  var name: JSXIdentifier | JSXNamespacedName = js.native
  
  @JSName("type")
  var type_JSXAttribute: typings.estreeJsx.estreeJsxStrings.JSXAttribute = js.native
  
  var value: Literal | JSXExpressionContainer | JSXElement | JSXFragment | Null = js.native
}
object JSXAttribute {
  
  @scala.inline
  def apply(name: JSXIdentifier | JSXNamespacedName, `type`: typings.estreeJsx.estreeJsxStrings.JSXAttribute): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
  
  @scala.inline
  implicit class JSXAttributeMutableBuilder[Self <: JSXAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Literal | JSXExpressionContainer | JSXElement | JSXFragment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
