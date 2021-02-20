package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXNamespacedName
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXNamespacedName: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName = js.native
}
object JSXNamespacedName {
  
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName): JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
  
  @scala.inline
  implicit class JSXNamespacedNameMutableBuilder[Self <: JSXNamespacedName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
