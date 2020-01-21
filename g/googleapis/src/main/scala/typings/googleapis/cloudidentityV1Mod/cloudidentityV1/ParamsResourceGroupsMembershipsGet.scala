package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsMembershipsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership to be retrieved.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique id assigned to the Group to which Membership belongs to, and
    * `member_id` is the unique ID assigned to the member.
    */
  var name: js.UndefOr[String] = js.native
}

