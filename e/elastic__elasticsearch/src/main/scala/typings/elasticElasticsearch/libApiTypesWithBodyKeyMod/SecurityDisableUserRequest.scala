package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDisableUserRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var username: Username
}
object SecurityDisableUserRequest {
  
  inline def apply(username: Username): SecurityDisableUserRequest = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDisableUserRequest]
  }
  
  extension [Self <: SecurityDisableUserRequest](x: Self) {
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
