package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXSpreadAttribute
  extends BaseNode
     with _Node {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadAttribute: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute = js.native
}
object JSXSpreadAttribute {
  
  @scala.inline
  def apply(argument: Expression, `type`: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
  
  @scala.inline
  implicit class JSXSpreadAttributeMutableBuilder[Self <: JSXSpreadAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
