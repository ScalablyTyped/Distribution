package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadAttribute
  extends StObject
     with BaseNode
     with _Node {
  
  var argument: Expression
  
  @JSName("type")
  var type_JSXSpreadAttribute: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
}
object JSXSpreadAttribute {
  
  inline def apply(argument: Expression): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
  
  extension [Self <: JSXSpreadAttribute](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
