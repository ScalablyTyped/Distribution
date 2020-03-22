package typings.gapiClientResourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * The requested format of the return value. It can be URL or URL_PORT. A JSON object will be included in the response based on the format. The default
    * format is NONE, which results in no JSON in the response.
    */
  var format: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The state of the instance to list. By default, it lists all instances. */
  var listState: js.UndefOr[String] = js.undefined
  /** Maximum count of results to be returned. Acceptable values are 0 to 5000, inclusive. (Default: 5000) */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Specifies a nextPageToken returned by a previous list request. This token can be used to request the next page of results from a previous list request. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** The project name of the resource view. */
  var project: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The name of the resource view. */
  var resourceView: String
  /** The service name to return in the response. It is optional and if it is not set, all the service end points will be returned. */
  var serviceName: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The zone name of the resource view. */
  var zone: String
}

object AnonFormat {
  @scala.inline
  def apply(
    project: String,
    resourceView: String,
    zone: String,
    alt: String = null,
    fields: String = null,
    format: String = null,
    key: String = null,
    listState: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    serviceName: String = null,
    userIp: String = null
  ): AnonFormat = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], resourceView = resourceView.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (listState != null) __obj.updateDynamic("listState")(listState.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

