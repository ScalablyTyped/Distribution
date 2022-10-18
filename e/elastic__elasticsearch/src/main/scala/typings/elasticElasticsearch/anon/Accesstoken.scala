package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityGrantType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesstoken extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var grant_type: SecurityGrantType
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Accesstoken {
  
  inline def apply(grant_type: SecurityGrantType): Accesstoken = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  
  extension [Self <: Accesstoken](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setGrant_type(value: SecurityGrantType): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
