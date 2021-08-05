package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsMembershipsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership to be retrieved.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique id assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique ID assigned to the member.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsMembershipsGet {
  
  inline def apply(): ParamsResourceGroupsMembershipsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsGet]
  }
  
  extension [Self <: ParamsResourceGroupsMembershipsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
