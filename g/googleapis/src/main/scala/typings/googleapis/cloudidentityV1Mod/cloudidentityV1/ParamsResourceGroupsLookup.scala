package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsLookup
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the entity. For Google-managed entities, the `id` should be the email address of an existing group or user. For external-identity-mapped entities, the `id` must be a string conforming to the Identity Source's requirements. Must be unique within a `namespace`.
    */
  @JSName("groupKey.id")
  var groupKeyDotid: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source\}`.
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
    
    inline def setGroupKeyDotid(value: String): Self = StObject.set(x, "groupKey.id", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyDotidUndefined: Self = StObject.set(x, "groupKey.id", js.undefined)
    
    inline def setGroupKeyDotnamespace(value: String): Self = StObject.set(x, "groupKey.namespace", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyDotnamespaceUndefined: Self = StObject.set(x, "groupKey.namespace", js.undefined)
  }
}
