package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsMembershipsLookup extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the entity within the given namespace. The ID must be unique
    * within its namespace.
    */
  @JSName("memberKey.id")
  var memberKeyDotid: js.UndefOr[String] = js.native
  /**
    * Namespaces provide isolation for IDs, so an ID only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("memberKey.namespace")
  var memberKeyDotnamespace: js.UndefOr[String] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group to lookup Membership within.  Format: `groups/{group_id}`,
    * where `group_id` is the unique ID assigned to the Group.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceGroupsMembershipsLookup {
  @scala.inline
  def apply(): ParamsResourceGroupsMembershipsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsLookup]
  }
  @scala.inline
  implicit class ParamsResourceGroupsMembershipsLookupOps[Self <: ParamsResourceGroupsMembershipsLookup] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMemberKeyDotid(value: String): Self = this.set("memberKey.id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberKeyDotid: Self = this.set("memberKey.id", js.undefined)
    @scala.inline
    def setMemberKeyDotnamespace(value: String): Self = this.set("memberKey.namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberKeyDotnamespace: Self = this.set("memberKey.namespace", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

