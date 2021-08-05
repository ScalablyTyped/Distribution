package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingFragment
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXClosingFragment: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment
}
object JSXClosingFragment {
  
  inline def apply(): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[JSXClosingFragment]
  }
  
  extension [Self <: JSXClosingFragment](x: Self) {
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
