package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrettyPrint extends js.Object {
  /** Account ID which the given web property belongs to. */
  var accountId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The maximum number of webProperty-user Links to include in this response. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. */
  var `start-index`: js.UndefOr[Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /**
    * Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties
    * that user has access to.
    */
  var webPropertyId: String
}

object AnonPrettyPrint {
  @scala.inline
  def apply(
    accountId: String,
    webPropertyId: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    `max-results`: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    `start-index`: Int | Double = null,
    userIp: String = null
  ): AnonPrettyPrint = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrettyPrint]
  }
}

