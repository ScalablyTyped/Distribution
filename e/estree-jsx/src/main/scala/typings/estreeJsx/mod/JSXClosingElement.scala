package typings.estreeJsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXClosingElement
  extends JSXBoundaryElement
     with _Node {
  
  @JSName("type")
  var type_JSXClosingElement: typings.estreeJsx.estreeJsxStrings.JSXClosingElement = js.native
}
object JSXClosingElement {
  
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
  
  @scala.inline
  implicit class JSXClosingElementMutableBuilder[Self <: JSXClosingElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
