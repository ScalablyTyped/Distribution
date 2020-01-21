package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBillingaccountsProjectsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the billing account associated with the projects
    * that you want to list. For example,
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Requested page size. The maximum page size is 100; this is also the
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to be returned. This should be a
    * `next_page_token` value returned from a previous `ListProjectBillingInfo`
    * call. If unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
}

