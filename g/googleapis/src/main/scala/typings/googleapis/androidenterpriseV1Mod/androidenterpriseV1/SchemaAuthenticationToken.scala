package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AuthenticationToken is used by the EMM&#39;s device policy client on a
  * device to provision the given EMM-managed user on that device.
  */
@js.native
trait SchemaAuthenticationToken extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#authenticationToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The authentication token to be passed to the device policy client on the
    * device where it can be used to provision the account for which this token
    * was generated.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaAuthenticationToken {
  
  @scala.inline
  def apply(): SchemaAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationToken]
  }
  
  @scala.inline
  implicit class SchemaAuthenticationTokenMutableBuilder[Self <: SchemaAuthenticationToken] (val x: Self) extends AnyVal {
    
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
