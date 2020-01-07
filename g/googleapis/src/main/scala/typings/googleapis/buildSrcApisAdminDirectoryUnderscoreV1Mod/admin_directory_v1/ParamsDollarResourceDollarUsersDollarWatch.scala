package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarWatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Comma-separated list of schema names. All fields from these schemas are
    * fetched. This should only be set when projection=custom.
    */
  var customFieldMask: js.UndefOr[String] = js.native
  /**
    * Immutable ID of the G Suite account. In case of multi-domain, to fetch
    * all users for a customer, fill this field instead of domain.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Name of the domain. Fill this field to get users from only this domain.
    * To return all users in a multi-domain fill customer field instead.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Event on which subscription is intended (if subscribing)
    */
  var event: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Default is 100. Max allowed is 500
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Column to use for sorting results
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * What subset of fields to fetch for this user.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Query string search. Should be of the form "". Complete documentation is
    * at
    * https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Channel] = js.native
  /**
    * If set to true retrieves the list of deleted users. Default is false
    */
  var showDeleted: js.UndefOr[String] = js.native
  /**
    * Whether to return results in ascending or descending order.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    */
  var viewType: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarUsersDollarWatch {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customFieldMask: String = null,
    customer: String = null,
    domain: String = null,
    event: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    query: String = null,
    quotaUser: String = null,
    requestBody: Schema$Channel = null,
    showDeleted: String = null,
    sortOrder: String = null,
    userIp: String = null,
    viewType: String = null
  ): ParamsDollarResourceDollarUsersDollarWatch = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customFieldMask != null) __obj.updateDynamic("customFieldMask")(customFieldMask.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (showDeleted != null) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarUsersDollarWatch]
  }
}

