package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOriginAuthenticationMethod extends StObject {
  
  var jwt: js.UndefOr[SchemaJwt] = js.undefined
}
object SchemaOriginAuthenticationMethod {
  
  inline def apply(): SchemaOriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOriginAuthenticationMethod]
  }
  
  extension [Self <: SchemaOriginAuthenticationMethod](x: Self) {
    
    inline def setJwt(value: SchemaJwt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
  }
}
