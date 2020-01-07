package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBillingaccountsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Options for how to filter the returned billing accounts. Currently this
    * only supports filtering for
    * [subaccounts](https://cloud.google.com/billing/docs/concepts) under a
    * single provided reseller billing account. (e.g.
    * "master_billing_account=billingAccounts/012345-678901-ABCDEF"). Boolean
    * algebra and other fields are not currently supported.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Requested page size. The maximum page size is 100; this is also the
    * default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListBillingAccounts`
    * call. If unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
}

