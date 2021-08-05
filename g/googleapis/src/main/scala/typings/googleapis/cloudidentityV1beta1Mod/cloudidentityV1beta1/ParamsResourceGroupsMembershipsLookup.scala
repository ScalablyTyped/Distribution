package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsMembershipsLookup
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id of the entity within the given namespace. The id must be unique
    * within its namespace.
    */
  @JSName("memberKey.id")
  var memberKeyDotid: js.UndefOr[String] = js.undefined
  
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("memberKey.namespace")
  var memberKeyDotnamespace: js.UndefOr[String] = js.undefined
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group to lookup Membership within.  Format: `groups/{group_id}`,
    * where `group_id` is the unique id assigned to the Group.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsMembershipsLookup {
  
  inline def apply(): ParamsResourceGroupsMembershipsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsLookup]
  }
  
  extension [Self <: ParamsResourceGroupsMembershipsLookup](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMemberKeyDotid(value: String): Self = StObject.set(x, "memberKey.id", value.asInstanceOf[js.Any])
    
    inline def setMemberKeyDotidUndefined: Self = StObject.set(x, "memberKey.id", js.undefined)
    
    inline def setMemberKeyDotnamespace(value: String): Self = StObject.set(x, "memberKey.namespace", value.asInstanceOf[js.Any])
    
    inline def setMemberKeyDotnamespaceUndefined: Self = StObject.set(x, "memberKey.namespace", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
