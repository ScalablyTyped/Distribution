package typings.gapiClientFitness.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The data stream ID of the data source that created the dataset. */
  var dataSourceId: String
  /**
    * Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch.
    * The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    */
  var datasetId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * If specified, no more than this many data points will be included in the dataset. If there are more data points in the dataset, nextPageToken will be
    * set in the dataset response.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The continuation token, which is used to page through large datasets. To get the next page of a dataset, set this parameter to the value of
    * nextPageToken from the previous response. Each subsequent call will yield a partial dataset with data point end timestamps that are strictly smaller
    * than those in the previous partial response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Retrieve a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time. */
  var userId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object DataSourceId {
  @scala.inline
  def apply(
    dataSourceId: String,
    datasetId: String,
    userId: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): DataSourceId = {
    val __obj = js.Dynamic.literal(dataSourceId = dataSourceId.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceId]
  }
}

