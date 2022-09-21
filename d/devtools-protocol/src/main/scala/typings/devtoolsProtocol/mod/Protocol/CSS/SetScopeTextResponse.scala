package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScopeTextResponse extends StObject {
  
  /**
    * The resulting CSS Scope rule after modification.
    */
  var scope: CSSScope
}
object SetScopeTextResponse {
  
  inline def apply(scope: CSSScope): SetScopeTextResponse = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScopeTextResponse]
  }
  
  extension [Self <: SetScopeTextResponse](x: Self) {
    
    inline def setScope(value: CSSScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
