package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXText
  extends BaseNode
     with _Node {
  
  var raw: String = js.native
  
  @JSName("type")
  var type_JSXText: typings.estreeJsx.estreeJsxStrings.JSXText = js.native
  
  var value: String = js.native
}
object JSXText {
  
  @scala.inline
  def apply(raw: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXText, value: String): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText]
  }
  
  @scala.inline
  implicit class JSXTextMutableBuilder[Self <: JSXText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
