package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXClosingFragment
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXClosingFragment: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment = js.native
}
object JSXClosingFragment {
  
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingFragment]
  }
  
  @scala.inline
  implicit class JSXClosingFragmentMutableBuilder[Self <: JSXClosingFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
