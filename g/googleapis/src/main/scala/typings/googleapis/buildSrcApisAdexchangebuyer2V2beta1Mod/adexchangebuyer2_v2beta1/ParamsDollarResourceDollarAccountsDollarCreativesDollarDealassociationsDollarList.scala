package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarCreativesDollarDealassociationsDollarList extends StandardParameters {
  /**
    * The account to list the associations from. Specify "-" to list all
    * creatives the current user has access to.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The creative ID to list the associations from. Specify "-" to list all
    * creatives under the above account.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * Requested page size. Server may return fewer associations than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListDealAssociationsResponse.next_page_token returned from the previous
    * call to 'ListDealAssociations' method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * An optional query string to filter deal associations. If no filter is
    * specified, all associations will be returned. Supported queries are: <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i>
    * <li>dealsId=<i>deals_id_string</i> <li>dealsStatus:{approved,
    * conditionally_approved, disapproved,                   not_checked}
    * <li>openAuctionStatus:{approved, conditionally_approved, disapproved,
    * not_checked} </ul> Example: 'dealsId=12345 AND dealsStatus:disapproved'
    */
  var query: js.UndefOr[String] = js.native
}

