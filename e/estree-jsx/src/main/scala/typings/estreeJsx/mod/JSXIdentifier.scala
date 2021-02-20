package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXIdentifier
  extends BaseNode
     with _Node {
  
  var name: String = js.native
  
  @JSName("type")
  var type_JSXIdentifier: typings.estreeJsx.estreeJsxStrings.JSXIdentifier = js.native
}
object JSXIdentifier {
  
  @scala.inline
  def apply(name: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXIdentifier): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier]
  }
  
  @scala.inline
  implicit class JSXIdentifierMutableBuilder[Self <: JSXIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
