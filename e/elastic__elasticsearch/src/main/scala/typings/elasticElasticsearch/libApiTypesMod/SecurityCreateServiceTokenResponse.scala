package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateServiceTokenResponse extends StObject {
  
  var created: Boolean
  
  var token: SecurityCreateServiceTokenToken
}
object SecurityCreateServiceTokenResponse {
  
  inline def apply(created: Boolean, token: SecurityCreateServiceTokenToken): SecurityCreateServiceTokenResponse = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreateServiceTokenResponse]
  }
  
  extension [Self <: SecurityCreateServiceTokenResponse](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setToken(value: SecurityCreateServiceTokenToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
