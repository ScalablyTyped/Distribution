package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXOpeningFragment
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXOpeningFragment: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment = js.native
}
object JSXOpeningFragment {
  
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment): JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningFragment]
  }
  
  @scala.inline
  implicit class JSXOpeningFragmentMutableBuilder[Self <: JSXOpeningFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
