package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLookupMembershipNameResponse extends js.Object {
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
  def apply(name: String = null): SchemaLookupMembershipNameResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLookupMembershipNameResponse]
  }
}

