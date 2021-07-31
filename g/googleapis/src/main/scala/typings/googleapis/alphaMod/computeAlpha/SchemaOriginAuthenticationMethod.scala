package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the origin authentication method.
  */
trait SchemaOriginAuthenticationMethod extends StObject {
  
  var jwt: js.UndefOr[SchemaJwt] = js.undefined
}
object SchemaOriginAuthenticationMethod {
  
  @scala.inline
  def apply(): SchemaOriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOriginAuthenticationMethod]
  }
  
  @scala.inline
  implicit class SchemaOriginAuthenticationMethodMutableBuilder[Self <: SchemaOriginAuthenticationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJwt(value: SchemaJwt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
  }
}
