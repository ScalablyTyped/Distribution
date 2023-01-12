package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var username: js.UndefOr[Username | js.Array[Username]] = js.undefined
  
  var with_profile_uid: js.UndefOr[Boolean] = js.undefined
}
object SecurityGetUserRequest {
  
  inline def apply(): SecurityGetUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetUserRequest] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: Username | js.Array[Username]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setUsernameVarargs(value: Username*): Self = StObject.set(x, "username", js.Array(value*))
    
    inline def setWith_profile_uid(value: Boolean): Self = StObject.set(x, "with_profile_uid", value.asInstanceOf[js.Any])
    
    inline def setWith_profile_uidUndefined: Self = StObject.set(x, "with_profile_uid", js.undefined)
  }
}
