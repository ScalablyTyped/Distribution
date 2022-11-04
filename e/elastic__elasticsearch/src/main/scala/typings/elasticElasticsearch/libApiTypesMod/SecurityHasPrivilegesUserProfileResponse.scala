package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesUserProfileResponse extends StObject {
  
  var errors: js.UndefOr[SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors] = js.undefined
  
  var has_privilege_uids: js.Array[SecurityUserProfileId]
}
object SecurityHasPrivilegesUserProfileResponse {
  
  inline def apply(has_privilege_uids: js.Array[SecurityUserProfileId]): SecurityHasPrivilegesUserProfileResponse = {
    val __obj = js.Dynamic.literal(has_privilege_uids = has_privilege_uids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesUserProfileResponse]
  }
  
  extension [Self <: SecurityHasPrivilegesUserProfileResponse](x: Self) {
    
    inline def setErrors(value: SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setHas_privilege_uids(value: js.Array[SecurityUserProfileId]): Self = StObject.set(x, "has_privilege_uids", value.asInstanceOf[js.Any])
    
    inline def setHas_privilege_uidsVarargs(value: SecurityUserProfileId*): Self = StObject.set(x, "has_privilege_uids", js.Array(value*))
  }
}
