package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Literal
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
  implicit class JSXAttributeOps[Self <: JSXAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: JSXIdentifier | JSXNamespacedName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXAttribute): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Literal | JSXExpressionContainer | JSXElement | JSXFragment): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
