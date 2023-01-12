package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityEnrollKibanaResponse extends StObject {
  
  var http_ca: String
  
  var token: SecurityEnrollKibanaToken
}
object SecurityEnrollKibanaResponse {
  
  inline def apply(http_ca: String, token: SecurityEnrollKibanaToken): SecurityEnrollKibanaResponse = {
    val __obj = js.Dynamic.literal(http_ca = http_ca.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityEnrollKibanaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityEnrollKibanaResponse] (val x: Self) extends AnyVal {
    
    inline def setHttp_ca(value: String): Self = StObject.set(x, "http_ca", value.asInstanceOf[js.Any])
    
    inline def setToken(value: SecurityEnrollKibanaToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
