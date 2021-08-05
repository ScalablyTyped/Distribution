package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupMembershipNameResponse extends StObject {
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership being looked up.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique ID assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique ID assigned to the member.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaLookupMembershipNameResponse {
  
  inline def apply(): SchemaLookupMembershipNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupMembershipNameResponse]
  }
  
  extension [Self <: SchemaLookupMembershipNameResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
