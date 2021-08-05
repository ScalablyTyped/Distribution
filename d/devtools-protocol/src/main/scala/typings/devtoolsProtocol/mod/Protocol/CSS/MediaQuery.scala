package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQuery extends StObject {
  
  /**
    * Whether the media query condition is satisfied.
    */
  var active: Boolean
  
  /**
    * Array of media query expressions.
    */
  var expressions: js.Array[MediaQueryExpression]
}
object MediaQuery {
  
  inline def apply(active: Boolean, expressions: js.Array[MediaQueryExpression]): MediaQuery = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  
  extension [Self <: MediaQuery](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setExpressions(value: js.Array[MediaQueryExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: MediaQueryExpression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
  }
}
