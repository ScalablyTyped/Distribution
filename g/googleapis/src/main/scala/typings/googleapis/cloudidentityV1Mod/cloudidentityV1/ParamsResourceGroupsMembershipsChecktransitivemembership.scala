package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsMembershipsChecktransitivemembership
  extends StObject
     with StandardParameters {
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of the group to check the transitive membership in. Format: `groups/{group\}`, where `group` is the unique id assigned to the Group to which the Membership belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A CEL expression that MUST include member specification. This is a `required` field. Certain groups are uniquely identified by both a 'member_key_id' and a 'member_key_namespace', which requires an additional query input: 'member_key_namespace'. Example query: `member_key_id == 'member_key_id_value'`
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsMembershipsChecktransitivemembership {
  
  inline def apply(): ParamsResourceGroupsMembershipsChecktransitivemembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsChecktransitivemembership]
  }
  
  extension [Self <: ParamsResourceGroupsMembershipsChecktransitivemembership](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
