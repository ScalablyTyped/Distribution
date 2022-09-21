package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJwt extends StObject {
  
  /**
    * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
    */
  var compactJwt: js.UndefOr[String | Null] = js.undefined
}
object SchemaJwt {
  
  inline def apply(): SchemaJwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwt]
  }
  
  extension [Self <: SchemaJwt](x: Self) {
    
    inline def setCompactJwt(value: String): Self = StObject.set(x, "compactJwt", value.asInstanceOf[js.Any])
    
    inline def setCompactJwtNull: Self = StObject.set(x, "compactJwt", null)
    
    inline def setCompactJwtUndefined: Self = StObject.set(x, "compactJwt", js.undefined)
  }
}
