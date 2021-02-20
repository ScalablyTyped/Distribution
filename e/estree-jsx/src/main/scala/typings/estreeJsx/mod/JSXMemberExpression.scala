package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXMemberExpression
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXMemberExpression: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression = js.native
}
object JSXMemberExpression {
  
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression): JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression]
  }
  
  @scala.inline
  implicit class JSXMemberExpressionMutableBuilder[Self <: JSXMemberExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
