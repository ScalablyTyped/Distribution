package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXText
  extends StObject
     with BaseNode
     with _Node {
  
  var raw: String
  
  @JSName("type")
  var type_JSXText: typings.estreeJsx.estreeJsxStrings.JSXText
  
  var value: String
}
object JSXText {
  
  inline def apply(raw: String, value: String): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText]
  }
  
  extension [Self <: JSXText](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
