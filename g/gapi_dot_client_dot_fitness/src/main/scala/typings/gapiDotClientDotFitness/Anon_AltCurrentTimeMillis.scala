package typings.gapiDotClientDotFitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCurrentTimeMillis extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The client's current time in milliseconds since epoch. */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
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
  /** When the operation was performed on the client. */
  var modifiedTimeMillis: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Delete a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time. */
  var userId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltCurrentTimeMillis {
  @scala.inline
  def apply(
    dataSourceId: String,
    datasetId: String,
    userId: String,
    alt: String = null,
    currentTimeMillis: String = null,
    fields: String = null,
    key: String = null,
    modifiedTimeMillis: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AltCurrentTimeMillis = {
    val __obj = js.Dynamic.literal(dataSourceId = dataSourceId, datasetId = datasetId, userId = userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (currentTimeMillis != null) __obj.updateDynamic("currentTimeMillis")(currentTimeMillis)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (modifiedTimeMillis != null) __obj.updateDynamic("modifiedTimeMillis")(modifiedTimeMillis)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCurrentTimeMillis]
  }
}

