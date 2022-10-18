package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenAuthenticatedUser
  extends StObject
     with SecurityUser {
  
  var authentication_provider: js.UndefOr[SecurityGetTokenAuthenticationProvider] = js.undefined
  
  var authentication_realm: SecurityGetTokenUserRealm
  
  var authentication_type: String
  
  var lookup_realm: SecurityGetTokenUserRealm
}
object SecurityGetTokenAuthenticatedUser {
  
  inline def apply(
    authentication_realm: SecurityGetTokenUserRealm,
    authentication_type: String,
    enabled: Boolean,
    lookup_realm: SecurityGetTokenUserRealm,
    metadata: Metadata,
    roles: js.Array[String],
    username: Username
  ): SecurityGetTokenAuthenticatedUser = {
    val __obj = js.Dynamic.literal(authentication_realm = authentication_realm.asInstanceOf[js.Any], authentication_type = authentication_type.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], lookup_realm = lookup_realm.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetTokenAuthenticatedUser]
  }
  
  extension [Self <: SecurityGetTokenAuthenticatedUser](x: Self) {
    
    inline def setAuthentication_provider(value: SecurityGetTokenAuthenticationProvider): Self = StObject.set(x, "authentication_provider", value.asInstanceOf[js.Any])
    
    inline def setAuthentication_providerUndefined: Self = StObject.set(x, "authentication_provider", js.undefined)
    
    inline def setAuthentication_realm(value: SecurityGetTokenUserRealm): Self = StObject.set(x, "authentication_realm", value.asInstanceOf[js.Any])
    
    inline def setAuthentication_type(value: String): Self = StObject.set(x, "authentication_type", value.asInstanceOf[js.Any])
    
    inline def setLookup_realm(value: SecurityGetTokenUserRealm): Self = StObject.set(x, "lookup_realm", value.asInstanceOf[js.Any])
  }
}
