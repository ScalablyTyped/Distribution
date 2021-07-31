package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A token authorizing an admin to access an iframe.
  */
trait SchemaAdministratorWebToken extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#administratorWebToken&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque token to be passed to the Play front-end to generate an iframe.
    */
  var token: js.UndefOr[String] = js.undefined
}
object SchemaAdministratorWebToken {
  
  @scala.inline
  def apply(): SchemaAdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebToken]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenMutableBuilder[Self <: SchemaAdministratorWebToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
