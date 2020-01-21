package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsMembershipsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The default page size is 200 (max 1000) for the BASIC view, and 50 (max
    * 500) for the FULL view.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous list request, if any
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group to list Memberships within.  Format: `groups/{group_id}`, where
    * `group_id` is the unique id assigned to the Group.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Membership resource view to be returned. Defaults to
    * MembershipView.BASIC.
    */
  var view: js.UndefOr[String] = js.native
}

