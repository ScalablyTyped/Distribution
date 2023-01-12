package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var privileges: SecurityHasPrivilegesUserProfilePrivilegesCheck
  
  var uids: js.Array[SecurityUserProfileId]
}
object SecurityHasPrivilegesUserProfileRequest {
  
  inline def apply(privileges: SecurityHasPrivilegesUserProfilePrivilegesCheck, uids: js.Array[SecurityUserProfileId]): SecurityHasPrivilegesUserProfileRequest = {
    val __obj = js.Dynamic.literal(privileges = privileges.asInstanceOf[js.Any], uids = uids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesUserProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityHasPrivilegesUserProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setPrivileges(value: SecurityHasPrivilegesUserProfilePrivilegesCheck): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setUids(value: js.Array[SecurityUserProfileId]): Self = StObject.set(x, "uids", value.asInstanceOf[js.Any])
    
    inline def setUidsVarargs(value: SecurityUserProfileId*): Self = StObject.set(x, "uids", js.Array(value*))
  }
}
