package typings.estreeJsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement
  extends StObject
     with JSXBoundaryElement
     with _Node {
  
  @JSName("type")
  var type_JSXClosingElement: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
}
object JSXClosingElement {
  
  inline def apply(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement]
  }
  
  extension [Self <: JSXClosingElement](x: Self) {
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
