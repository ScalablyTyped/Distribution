package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSPositionFallbackRule extends StObject {
  
  var name: Value
  
  /**
    * List of keyframes.
    */
  var tryRules: js.Array[CSSTryRule]
}
object CSSPositionFallbackRule {
  
  inline def apply(name: Value, tryRules: js.Array[CSSTryRule]): CSSPositionFallbackRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tryRules = tryRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSPositionFallbackRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSPositionFallbackRule] (val x: Self) extends AnyVal {
    
    inline def setName(value: Value): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTryRules(value: js.Array[CSSTryRule]): Self = StObject.set(x, "tryRules", value.asInstanceOf[js.Any])
    
    inline def setTryRulesVarargs(value: CSSTryRule*): Self = StObject.set(x, "tryRules", js.Array(value*))
  }
}
