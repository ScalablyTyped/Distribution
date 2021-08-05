package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningFragment
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXOpeningFragment: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment
}
object JSXOpeningFragment {
  
  inline def apply(): JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment]
  }
  
  extension [Self <: JSXOpeningFragment](x: Self) {
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
