package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSupportsTextResponse extends StObject {
  
  /**
    * The resulting CSS Supports rule after modification.
    */
  var supports: CSSSupports
}
object SetSupportsTextResponse {
  
  inline def apply(supports: CSSSupports): SetSupportsTextResponse = {
    val __obj = js.Dynamic.literal(supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSupportsTextResponse]
  }
  
  extension [Self <: SetSupportsTextResponse](x: Self) {
    
    inline def setSupports(value: CSSSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
  }
}
