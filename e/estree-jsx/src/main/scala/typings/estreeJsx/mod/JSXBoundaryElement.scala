package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXBoundaryElement extends BaseNode {
  
  var name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName = js.native
}
object JSXBoundaryElement {
  
  @scala.inline
  def apply(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName, `type`: String): JSXBoundaryElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXBoundaryElement]
  }
  
  @scala.inline
  implicit class JSXBoundaryElementOps[Self <: JSXBoundaryElement] (val x: Self) extends AnyVal {
    
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
    def setName(value: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
