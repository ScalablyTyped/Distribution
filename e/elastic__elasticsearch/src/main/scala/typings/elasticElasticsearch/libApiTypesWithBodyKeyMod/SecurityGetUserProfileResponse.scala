package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserProfileResponse extends StObject {
  
  var errors: js.UndefOr[SecurityGetUserProfileGetUserProfileErrors] = js.undefined
  
  var profiles: js.Array[SecurityUserProfileWithMetadata]
}
object SecurityGetUserProfileResponse {
  
  inline def apply(profiles: js.Array[SecurityUserProfileWithMetadata]): SecurityGetUserProfileResponse = {
    val __obj = js.Dynamic.literal(profiles = profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetUserProfileResponse]
  }
  
  extension [Self <: SecurityGetUserProfileResponse](x: Self) {
    
    inline def setErrors(value: SecurityGetUserProfileGetUserProfileErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setProfiles(value: js.Array[SecurityUserProfileWithMetadata]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesVarargs(value: SecurityUserProfileWithMetadata*): Self = StObject.set(x, "profiles", js.Array(value*))
  }
}
