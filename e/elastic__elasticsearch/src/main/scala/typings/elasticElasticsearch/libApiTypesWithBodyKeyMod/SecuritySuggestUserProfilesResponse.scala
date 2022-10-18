package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySuggestUserProfilesResponse extends StObject {
  
  var profiles: js.Array[SecurityUserProfile]
  
  var took: long
  
  var total: SecuritySuggestUserProfilesTotalUserProfiles
}
object SecuritySuggestUserProfilesResponse {
  
  inline def apply(
    profiles: js.Array[SecurityUserProfile],
    took: long,
    total: SecuritySuggestUserProfilesTotalUserProfiles
  ): SecuritySuggestUserProfilesResponse = {
    val __obj = js.Dynamic.literal(profiles = profiles.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySuggestUserProfilesResponse]
  }
  
  extension [Self <: SecuritySuggestUserProfilesResponse](x: Self) {
    
    inline def setProfiles(value: js.Array[SecurityUserProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesVarargs(value: SecurityUserProfile*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: SecuritySuggestUserProfilesTotalUserProfiles): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
