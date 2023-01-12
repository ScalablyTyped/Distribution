package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceCredentialsResponse extends StObject {
  
  var count: integer
  
  var nodes_credentials: SecurityGetServiceCredentialsNodesCredentials
  
  var service_account: String
  
  var tokens: Record[String, Metadata]
}
object SecurityGetServiceCredentialsResponse {
  
  inline def apply(
    count: integer,
    nodes_credentials: SecurityGetServiceCredentialsNodesCredentials,
    service_account: String,
    tokens: Record[String, Metadata]
  ): SecurityGetServiceCredentialsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nodes_credentials = nodes_credentials.asInstanceOf[js.Any], service_account = service_account.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetServiceCredentialsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetServiceCredentialsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setNodes_credentials(value: SecurityGetServiceCredentialsNodesCredentials): Self = StObject.set(x, "nodes_credentials", value.asInstanceOf[js.Any])
    
    inline def setService_account(value: String): Self = StObject.set(x, "service_account", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: Record[String, Metadata]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
