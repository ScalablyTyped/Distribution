package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXMemberExpression: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression
}
object JSXMemberExpression {
  
  inline def apply(): JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression]
  }
  
  extension [Self <: JSXMemberExpression](x: Self) {
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
