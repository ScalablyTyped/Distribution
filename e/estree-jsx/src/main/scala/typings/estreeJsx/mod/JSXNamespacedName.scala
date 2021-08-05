package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXNamespacedName
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXNamespacedName: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName
}
object JSXNamespacedName {
  
  inline def apply(): JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName]
  }
  
  extension [Self <: JSXNamespacedName](x: Self) {
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
