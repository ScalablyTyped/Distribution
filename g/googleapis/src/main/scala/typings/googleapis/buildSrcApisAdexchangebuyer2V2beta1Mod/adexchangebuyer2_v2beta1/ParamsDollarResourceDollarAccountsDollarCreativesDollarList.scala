package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarCreativesDollarList extends StandardParameters {
  /**
    * The account to list the creatives from. Specify "-" to list all creatives
    * the current user has access to.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. The server may return fewer creatives than requested
    * (due to timeout constraint) even if more are available via another call.
    * If unspecified, server will pick an appropriate default. Acceptable
    * values are 1 to 1000, inclusive.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListCreativesResponse.next_page_token
    * returned from the previous call to 'ListCreatives' method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * An optional query string to filter creatives. If no filter is specified,
    * all active creatives will be returned. <p>Supported queries are: <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i> <li>dealsStatus: {approved,
    * conditionally_approved, disapproved,                    not_checked}
    * <li>openAuctionStatus: {approved, conditionally_approved, disapproved,
    * not_checked} <li>attribute: {a numeric attribute from the list of
    * attributes} <li>disapprovalReason: {a reason from DisapprovalReason}
    * </ul> Example: 'accountId=12345 AND (dealsStatus:disapproved AND
    * disapprovalReason:unacceptable_content) OR attribute:47'
    */
  var query: js.UndefOr[String] = js.native
}

