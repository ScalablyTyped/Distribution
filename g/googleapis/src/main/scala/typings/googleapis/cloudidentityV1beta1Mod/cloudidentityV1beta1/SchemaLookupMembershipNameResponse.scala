package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLookupMembershipNameResponse extends StObject {
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership being looked up.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique id assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique id assigned to the member.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLookupMembershipNameResponse {
  
  @scala.inline
  def apply(): SchemaLookupMembershipNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupMembershipNameResponse]
  }
  
  @scala.inline
  implicit class SchemaLookupMembershipNameResponseMutableBuilder[Self <: SchemaLookupMembershipNameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
