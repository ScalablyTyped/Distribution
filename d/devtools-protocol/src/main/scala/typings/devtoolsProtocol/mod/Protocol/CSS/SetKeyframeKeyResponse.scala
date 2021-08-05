package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeyframeKeyResponse extends StObject {
  
  /**
    * The resulting key text after modification.
    */
  var keyText: Value
}
object SetKeyframeKeyResponse {
  
  inline def apply(keyText: Value): SetKeyframeKeyResponse = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeyframeKeyResponse]
  }
  
  extension [Self <: SetKeyframeKeyResponse](x: Self) {
    
    inline def setKeyText(value: Value): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
  }
}
