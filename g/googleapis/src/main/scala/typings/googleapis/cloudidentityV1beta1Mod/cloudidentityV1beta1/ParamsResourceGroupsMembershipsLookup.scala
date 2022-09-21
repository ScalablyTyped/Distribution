package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsMembershipsLookup
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the entity. For Google-managed entities, the `id` must be the email address of an existing group or user. For external-identity-mapped entities, the `id` must be a string conforming to the Identity Source's requirements. Must be unique within a `namespace`.
    */
  @JSName("memberKey.id")
  var memberKeyDotid: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source_id\}`.
    */
  @JSName("memberKey.namespace")
  var memberKeyDotnamespace: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent `Group` resource under which to lookup the `Membership` name. Must be of the form `groups/{group_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsMembershipsLookup {
  
  inline def apply(): ParamsResourceGroupsMembershipsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsLookup]
  }
  
  extension [Self <: ParamsResourceGroupsMembershipsLookup](x: Self) {
    
    inline def setMemberKeyDotid(value: String): Self = StObject.set(x, "memberKey.id", value.asInstanceOf[js.Any])
    
    inline def setMemberKeyDotidUndefined: Self = StObject.set(x, "memberKey.id", js.undefined)
    
    inline def setMemberKeyDotnamespace(value: String): Self = StObject.set(x, "memberKey.namespace", value.asInstanceOf[js.Any])
    
    inline def setMemberKeyDotnamespaceUndefined: Self = StObject.set(x, "memberKey.namespace", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
