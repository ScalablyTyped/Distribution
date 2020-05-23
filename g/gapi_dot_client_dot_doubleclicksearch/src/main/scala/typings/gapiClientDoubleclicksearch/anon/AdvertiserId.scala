package typings.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserId extends js.Object {
  /** Numeric ID of the advertiser. */
  var advertiserId: String
  /** Numeric ID of the agency. */
  var agencyId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var endDate: Double
  /** Numeric ID of the engine account. */
  var engineAccountId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The number of conversions to return per call. */
  var rowCount: Double
  /** First date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var startDate: Double
  /** The 0-based starting index for retrieving conversions results. */
  var startRow: Double
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AdvertiserId {
  @scala.inline
  def apply(
    advertiserId: String,
    agencyId: String,
    endDate: Double,
    engineAccountId: String,
    rowCount: Double,
    startDate: Double,
    startRow: Double,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): AdvertiserId = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], agencyId = agencyId.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], engineAccountId = engineAccountId.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserId]
  }
}

