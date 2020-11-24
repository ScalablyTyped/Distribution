package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLookupMembershipNameResponse extends js.Object {
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership being looked up.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique ID assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique ID assigned to the member.
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
  implicit class SchemaLookupMembershipNameResponseOps[Self <: SchemaLookupMembershipNameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
