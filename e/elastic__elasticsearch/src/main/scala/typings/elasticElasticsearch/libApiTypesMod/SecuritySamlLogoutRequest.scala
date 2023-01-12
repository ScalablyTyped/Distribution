package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlLogoutRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var token: String
}
object SecuritySamlLogoutRequest {
  
  inline def apply(token: String): SecuritySamlLogoutRequest = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlLogoutRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlLogoutRequest] (val x: Self) extends AnyVal {
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
