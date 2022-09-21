package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministratorWebToken extends StObject {
  
  /**
    * An opaque token to be passed to the Play front-end to generate an iframe.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdministratorWebToken {
  
  inline def apply(): SchemaAdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebToken]
  }
  
  extension [Self <: SchemaAdministratorWebToken](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
