package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteUserRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var username: Username
}
object SecurityDeleteUserRequest {
  
  inline def apply(username: Username): SecurityDeleteUserRequest = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeleteUserRequest] (val x: Self) extends AnyVal {
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
