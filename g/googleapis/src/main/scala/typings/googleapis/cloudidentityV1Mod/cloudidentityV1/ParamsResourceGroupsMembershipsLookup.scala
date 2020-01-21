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

