package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityEnableUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var uid: SecurityUserProfileId
}
object SecurityEnableUserProfileRequest {
  
  inline def apply(uid: SecurityUserProfileId): SecurityEnableUserProfileRequest = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityEnableUserProfileRequest]
  }
  
  extension [Self <: SecurityEnableUserProfileRequest](x: Self) {
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUid(value: SecurityUserProfileId): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
