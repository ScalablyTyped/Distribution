package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsLookup
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
  @JSName("groupKey.id")
  var groupKeyDotid: js.UndefOr[String] = js.undefined
  
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("groupKey.namespace")
  var groupKeyDotnamespace: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsLookup {
  
  inline def apply(): ParamsResourceGroupsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsLookup]
  }
  
  extension [Self <: ParamsResourceGroupsLookup](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setGroupKeyDotid(value: String): Self = StObject.set(x, "groupKey.id", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyDotidUndefined: Self = StObject.set(x, "groupKey.id", js.undefined)
    
    inline def setGroupKeyDotnamespace(value: String): Self = StObject.set(x, "groupKey.namespace", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyDotnamespaceUndefined: Self = StObject.set(x, "groupKey.namespace", js.undefined)
  }
}
