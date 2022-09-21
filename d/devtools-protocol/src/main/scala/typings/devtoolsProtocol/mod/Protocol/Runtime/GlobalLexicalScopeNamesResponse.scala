package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalLexicalScopeNamesResponse extends StObject {
  
  var names: js.Array[String]
}
object GlobalLexicalScopeNamesResponse {
  
  inline def apply(names: js.Array[String]): GlobalLexicalScopeNamesResponse = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalLexicalScopeNamesResponse]
  }
  
  extension [Self <: GlobalLexicalScopeNamesResponse](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
