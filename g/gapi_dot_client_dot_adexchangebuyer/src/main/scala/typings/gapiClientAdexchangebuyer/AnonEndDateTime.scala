package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndDateTime extends js.Object {
  /** The account id to get the reports. */
  var accountId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The end time of the report in ISO 8601 timestamp format using UTC. */
  var endDateTime: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of entries returned on one result page. If not set, the default is 100. Optional. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * A continuation token, used to page through performance reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the
    * previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The start time of the report in ISO 8601 timestamp format using UTC. */
  var startDateTime: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonEndDateTime {
  @scala.inline
  def apply(
    accountId: String,
    endDateTime: String,
    startDateTime: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): AnonEndDateTime = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], endDateTime = endDateTime.asInstanceOf[js.Any], startDateTime = startDateTime.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndDateTime]
  }
}

