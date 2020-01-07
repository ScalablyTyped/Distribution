package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarHistoryDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * History types to be returned by the function
    */
  var historyTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only return messages with a label matching the ID.
    */
  var labelId: js.UndefOr[String] = js.native
  /**
    * The maximum number of history records to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Returns history records after the specified startHistoryId. The
    * supplied startHistoryId should be obtained from the historyId of a
    * message, thread, or previous list response. History IDs increase
    * chronologically but are not contiguous with random gaps in between valid
    * IDs. Supplying an invalid or out of date startHistoryId typically returns
    * an HTTP 404 error code. A historyId is typically valid for at least a
    * week, but in some rare circumstances may be valid for only a few hours.
    * If you receive an HTTP 404 error response, your application should
    * perform a full sync. If you receive no nextPageToken in the response,
    * there are no updates to retrieve and you can store the returned historyId
    * for a future request.
    */
  var startHistoryId: js.UndefOr[String] = js.native
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarUsersDollarHistoryDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    historyTypes: js.Array[String] = null,
    key: String = null,
    labelId: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startHistoryId: String = null,
    userId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarUsersDollarHistoryDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (historyTypes != null) __obj.updateDynamic("historyTypes")(historyTypes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startHistoryId != null) __obj.updateDynamic("startHistoryId")(startHistoryId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarUsersDollarHistoryDollarList]
  }
}

